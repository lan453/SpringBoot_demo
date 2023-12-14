package com.example.springboot_demo.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.util.ListUtils;
import com.example.springboot_demo.configJWT.JWTUtil;
import com.example.springboot_demo.entity.Tstudent;
import com.example.springboot_demo.service.student.IStudentService;
import com.example.springboot_demo.union.result.Result;
import com.example.springboot_demo.ventity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mgt/student")
public class StudentConstroller {
	
	@Value("${spring.servlet.multipart.location}")
	private String destPath;
	
	@Value("${studentimportresult.resourceHandler}")
	private String excelResourceHandler;
	
	@Autowired
	private IStudentService studentService;

	List<StudentExcelData>  datas = new ArrayList<>();
	List<String>  message = new ArrayList<>();


	@PostMapping("/queryStudentPage")
	public PageDataClass<VStudent> queryStudentPage(int page, int rows, StudentQueryParam param){
		return studentService.queryStudentPage(page, rows, param);
	}

	public void saveTodb(Integer classId,File destFile) {
		/***
		 * 写入结果文件
		 */

//		File resultExcel=new File(destPath,System.currentTimeMillis()+".xlsx");
//		ExcelWriter excelWriter=EasyExcel.write(resultExcel.getAbsolutePath(),StudentExcelDataResult.class).build();
//		WriteSheet writeSheet = EasyExcel.writerSheet("导入结果").build();
		EasyExcel.read(destFile.getAbsolutePath(), StudentExcelData.class, new ReadListener<StudentExcelData>() {
			/**
			 * 单次缓存的数据量
			 */
			public static final int BATCH_COUNT = 20;
			/**
			 *临时存储
			 */
			private List<StudentExcelData> cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);



			@Override
			public void invoke(StudentExcelData data, AnalysisContext context) {
				cachedDataList.add(data);
				if (cachedDataList.size() >= BATCH_COUNT) {
					saveData();
					// 存储完成清理 list
					cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
				}
			}

			@Override
			public void doAfterAllAnalysed(AnalysisContext context) {
				saveData();
			}

			/**
			 * 加上存储数据库
			 */
			private void saveData() {
				datas.addAll(this.cachedDataList);
				List<String> resultMessage = studentService.batchAdd(classId, cachedDataList);
				message.addAll(resultMessage);
//            	writeResultToExcel(excelWriter,writeSheet,resultMessage,cachedDataList);
			}
		}).sheet().doRead();


	}

	private String writeResultToExcel() {
		long currentMillis = System.currentTimeMillis();
		String relativePath = "/excleimportresult/"+currentMillis + ".xlsx";
		File resultExcel = new File(destPath,currentMillis + ".xlsx");
		List<StudentExcelDataResult> results = new ArrayList<>();
		for(int index =0;index<this.datas.size();index++) {
			StudentExcelData sed = this.datas.get(index);

			StudentExcelDataResult sedr = new StudentExcelDataResult();
			sedr.setName(sed.getName());
			sedr.setGender(sed.getGender());
			sedr.setNum(sed.getNum());
			sedr.setTel(sed.getTel());
			sedr.setResult(this.message.get(index));
			results.add(sedr);
		}
		EasyExcel.write(resultExcel.getAbsolutePath(), StudentExcelDataResult.class).sheet("导入结果").doWrite(results);
		this.datas.clear();
		this.message.clear();
		return relativePath;
	}

	@PostMapping("/import/{classId}")
	public Result uploadFile(@PathVariable("classId")Integer classId, MultipartFile file) {
		String extension = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String destFileName = System.currentTimeMillis()+extension;
		File destFile = new File(this.destPath,destFileName);
		String downloadFilePath="";
		try {
			file.transferTo(destFile);
			this.saveTodb(classId, destFile);
			downloadFilePath = writeResultToExcel();
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		return Result.OK(downloadFilePath);
		
	}

	@PostMapping("/login")
	public Result doLogin(String num,String pwd) throws Exception{
		Tstudent obj = this.studentService.login(num,pwd);
		System.out.println(obj);
		String token = JWTUtil.generateToken(obj);
		return Result.OK(token);
	}
	
}
