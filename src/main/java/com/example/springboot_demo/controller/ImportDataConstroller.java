package com.example.springboot_demo.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.alibaba.excel.read.listener.ReadListener;
import com.example.springboot_demo.service.student.IStudentService;
import com.example.springboot_demo.union.result.Result;
import com.example.springboot_demo.ventity.StudentExcelData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.util.ListUtils;
@RestController
@RequestMapping("/mgt/importfile")
public class ImportDataConstroller {
	
	@Value("${spring.servlet.multipart.location}")
	private String destPath;
	
	@Autowired
	private IStudentService studentService;
	
	
	
	@PostMapping("/upload/{classId}")
	public Result uploadFile(@PathVariable("classId")Integer classId, MultipartFile file) {
//		UUID.randomUUID()
		//ajldsfjlasdfjla.xlsx
		String extension = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String destFileName = System.currentTimeMillis()+extension;//1991293123123.xlsx
		File destFile = new File(this.destPath,destFileName);
		try {
			file.transferTo(destFile);
			this.saveTodb(classId, destFile);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		
		return Result.OK();
		
	}
	
	
	public void saveTodb(Integer classId,File destFile) {
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
            	studentService.batchAdd(classId, cachedDataList);
            }
        }).sheet().doRead();
	}

}
