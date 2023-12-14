package com.example.springboot_demo.service.colleage;
import com.example.springboot_demo.entity.Tcolleage;
import com.example.springboot_demo.ventity.PagedData;
import com.example.springboot_demo.ventity.VColleage;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IColleageService {


    //帮助自己检查是否正确地复写了父类中已有的方法
    PagedData queryPagedColleage(int page, int rows, Tcolleage param);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    boolean addColleage(Tcolleage param);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    void deleteColleage(byte id);

    Tcolleage queryColleageById(Byte id);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    void updateColleage(Tcolleage param);

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    List<VColleage> ListColleage();

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    List<VColleage> selectVcolleage();

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    List<VColleage> queryClassTree();


    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    List<VColleage> ListCEATree();
}
