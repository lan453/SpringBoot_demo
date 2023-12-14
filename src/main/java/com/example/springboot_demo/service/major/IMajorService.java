package com.example.springboot_demo.service.major;


import com.example.springboot_demo.entity.Tmajor;
import com.example.springboot_demo.ventity.ComBoxEntity;
import com.example.springboot_demo.ventity.PagedData;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IMajorService {


    //帮助自己检查是否正确地复写了父类中已有的方法
    PagedData queryPagedMajor(int page, int rows, Tmajor param);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    boolean addMajor(Tmajor param);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    void deleteMajor(short id);

    Tmajor queryMajorById(short id);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    void updateMajor(Tmajor param);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    List<ComBoxEntity> queryMajor();
}
