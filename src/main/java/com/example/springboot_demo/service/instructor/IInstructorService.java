package com.example.springboot_demo.service.instructor;

import com.example.springboot_demo.entity.Tinstructor;
import com.example.springboot_demo.entity.Tinstructorclass;
import com.example.springboot_demo.ventity.*;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IInstructorService {
    //帮助自己检查是否正确地复写了父类中已有的方法
    PagedData queryPagedInstructor(int page, int rows, Tinstructor param);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    void add(InstructorClassParam param);


    PageDataClass<Vinstructor> queryByParam(int page, int rows, InstructorClassQueryParam param);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    void deleteInstructor(Short id);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    void deleteInstructorClass(Integer id);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    void updateInstructor(Vinstructor in);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    void updateInstructorClass(Tinstructorclass ic);

    Tinstructor queryInstructorById(Short id);

    Tinstructorclass queryInstructorClassById(Integer id);
    void addInstructor(Tinstructor tinstructor);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    void insertInstructorClass(Short instructorId, List<Integer> classId,
                               Byte startAcademicYearId, Byte startTerm,
                               Byte termCount);
}
