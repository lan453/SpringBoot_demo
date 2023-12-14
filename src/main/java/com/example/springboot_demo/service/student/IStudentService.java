package com.example.springboot_demo.service.student;

import com.example.springboot_demo.entity.Tstudent;
import com.example.springboot_demo.ventity.PageDataClass;
import com.example.springboot_demo.ventity.StudentExcelData;
import com.example.springboot_demo.ventity.StudentQueryParam;
import com.example.springboot_demo.ventity.VStudent;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IStudentService {
    //	@Transactional(isolation=Isolation.READ_COMMITTED,rollbackFor=Exception.class)
    List<String> batchAdd(Integer classId, List<StudentExcelData> datas);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    PageDataClass<VStudent> queryStudentPage(int page, int rows, StudentQueryParam param);

    Tstudent login(String num, String pwd) throws Exception;
}
