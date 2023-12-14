package com.example.springboot_demo.service.Tclass;

import com.example.springboot_demo.entity.Tclass;
import com.example.springboot_demo.ventity.ComBoxEntity;
import com.example.springboot_demo.ventity.CommonClass;
import com.example.springboot_demo.ventity.CommonInCla;
import com.example.springboot_demo.ventity.PageDataClass;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface IClassService {
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    List<CommonClass> listClassByEnterYearAndColleage(String colleagName, List<Integer> enteryears);
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    List<CommonClass> queryClass();

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    int addClass(Tclass obj);

    PageDataClass<CommonClass> queryPagedClass(int page, int rows, Tclass param);

    Tclass queryClassById(int id);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    void updateClass(Tclass param);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    void deleteClass(int id);


    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    List<ComBoxEntity> queryByColleageId(Integer coleageId);
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    List<CommonInCla> listClassByInstructorId(int instructorId);
}
