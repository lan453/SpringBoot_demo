package com.example.springboot_demo.service.student;

import com.example.springboot_demo.dao.mapper.TstuclassMapper;
import com.example.springboot_demo.dao.mapper.TstudentMapper;
import com.example.springboot_demo.entity.Tstuclass;
import com.example.springboot_demo.entity.Tstudent;
import com.example.springboot_demo.entity.TstudentExample;
import com.example.springboot_demo.ventity.PageDataClass;
import com.example.springboot_demo.ventity.StudentExcelData;
import com.example.springboot_demo.ventity.StudentQueryParam;
import com.example.springboot_demo.ventity.VStudent;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService implements IStudentService {
	
	@Autowired
	private TstudentMapper studentMapper;
	
	@Autowired
    TstuclassMapper stuclassMapper;
	
	@Autowired
	private SqlSessionFactory sqlSessioinFactory;
	
	

	@Override
//	@Transactional(isolation=Isolation.READ_COMMITTED,rollbackFor=Exception.class)
	public List<String> batchAdd(Integer classId, List<StudentExcelData> datas) {
		List<Tstudent> tdatas = new ArrayList<>();
		List<String>  resultMessage = new ArrayList<>();
		for(StudentExcelData sed :datas) {
			Tstudent ts = new Tstudent();
			ts.setName(sed.getName());
			ts.setNum(sed.getNum());
			ts.setTel(sed.getTel());
			ts.setGender(sed.getGender().contains("男")?"1":"2");
            tdatas.add(ts);
		}
		for(Tstudent student:tdatas) {
			try {
				this.saveStuAndStuclass(classId, student);
				resultMessage.add("成功");
			}catch(Exception e) {
				e.printStackTrace();
				resultMessage.add("失败"+e.getMessage());
			}
		}
		return resultMessage;
	}
	@Transactional(isolation=Isolation.READ_COMMITTED,rollbackFor=Exception.class)
	void saveStuAndStuclass(Integer classId, Tstudent ts) {
		this.studentMapper.insertSelective(ts);
		Tstuclass sc = new Tstuclass();
		sc.setStudentid(this.studentMapper.selectStuIdByNum(ts.getNum()));
		sc.setClassid(classId);
		this.stuclassMapper.insertSelective(sc);
//		System.out.println(ts);
//		System.out.println("=======================================");
//		System.out.println(sc);
	}
	@Override
	@Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
	public PageDataClass<VStudent> queryStudentPage(int page, int rows, StudentQueryParam param){
		PageHelper.startPage(page,rows);
		List<VStudent> datas = this.studentMapper.queryStudentPage(param);
		com.github.pagehelper.Page<VStudent> listWithPage = (com.github.pagehelper.Page<VStudent>)datas;
		PageDataClass<VStudent> pd = new PageDataClass<>();
		pd.setTotal(listWithPage.getTotal());
		pd.setRows(listWithPage.getResult());
		return pd;
	}

	@Override
	public Tstudent login(String num, String pwd) throws Exception {
		// TODO Auto-generated method stub
		TstudentExample example = new TstudentExample();
		example.createCriteria().andNumEqualTo(num).andPwdEqualTo(pwd);
		List<Tstudent> datas = this.studentMapper.selectByExample(example);
		if(datas!=null && !datas.isEmpty()) {
			return datas.get(0);
		}
		throw new Exception("用户名或密码错误");
	}





}
