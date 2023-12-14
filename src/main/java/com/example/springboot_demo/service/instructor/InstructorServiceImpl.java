package com.example.springboot_demo.service.instructor;


import com.example.springboot_demo.dao.mapper.TinstructorMapper;
import com.example.springboot_demo.dao.mapper.TinstructorclassMapper;
import com.example.springboot_demo.entity.Tinstructor;
import com.example.springboot_demo.entity.TinstructorExample;
import com.example.springboot_demo.entity.Tinstructorclass;
import com.example.springboot_demo.ventity.*;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstructorServiceImpl implements IInstructorService {
    //@Autowired 它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作，通过@Autowired 的使用来消除 set/get 方法。
    @Autowired
    private TinstructorMapper instructorMapper;
    @Autowired
    TinstructorclassMapper iclassMapper;
    //帮助自己检查是否正确地复写了父类中已有的方法
    @Override
    public PagedData queryPagedInstructor(int page, int rows, Tinstructor param) {
        PageHelper.startPage(page, rows);
        TinstructorExample example = new TinstructorExample();
        TinstructorExample.Criteria cr = example.createCriteria();
        if(StringUtils.hasLength(param.getNum())) {
            cr.andNumLike("%"+param.getNum()+"%");
        }
        if(StringUtils.hasLength(param.getName())) {
            cr.andNameLike("%"+param.getName()+"%");
        }


        List<Tinstructor> datas = instructorMapper.selectByExample(example);
        com.github.pagehelper.Page listWithPage = (com.github.pagehelper.Page)datas;
        PagedData pd = new PagedData();
        pd.setTotal(listWithPage.getTotal());
        pd.setRows(listWithPage.getResult());
        return pd;
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public void add(InstructorClassParam param){
        Tinstructor instructor=param.getInstructor();
        this.instructorMapper.insert(param.getInstructor());
        List<Tinstructorclass> instructorclasses=param.getInstructorclasses();
        instructorclasses.forEach(item->{
            item.setInstructorid(instructor.getId());
            this.iclassMapper.insert(item);
        });
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public PageDataClass<Vinstructor> queryByParam(int page, int rows, InstructorClassQueryParam param){
        PageHelper.startPage(page,rows);
        List<Vinstructor> datas = this.instructorMapper.selectInstructorTable(param);
        com.github.pagehelper.Page<Vinstructor> listWithPage = (com.github.pagehelper.Page<Vinstructor>)datas;//
        PageDataClass<Vinstructor> pd = new PageDataClass<>();
        pd.setTotal(listWithPage.getTotal());
        pd.setRows(listWithPage.getResult());
        return pd;
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public void deleteInstructor(Short id){
        this.iclassMapper.deleteByInstructorId(id);
        this.instructorMapper.deleteByPrimaryKey(id);
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public void deleteInstructorClass(Integer id){
        this.iclassMapper.deleteByPrimaryKey(id);
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public void updateInstructor(Vinstructor in){
        this.instructorMapper.updateByPrimaryKey(in);
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public void updateInstructorClass(Tinstructorclass ic){
        this.iclassMapper.updateByPrimaryKey(ic);
    }
    @Override
    public Tinstructor queryInstructorById(Short id){
        return this.instructorMapper.selectByPrimaryKey(id);
    }
    @Override
    public Tinstructorclass queryInstructorClassById(Integer id){
        return this.iclassMapper.selectByPrimaryKey(id);
    }
    @Override
    public void addInstructor(Tinstructor tinstructor){
        this.instructorMapper.insert(tinstructor);
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public void insertInstructorClass(Short instructorId, List<Integer> classId,
                                      Byte startAcademicYearId, Byte startTerm,
                                      Byte termCount){
        List<Tinstructorclass> instructorclasses=new ArrayList<>();
        Byte st=startTerm;
        for(int i=0;i<termCount;i++){
            for(Integer ci:classId){
                Tinstructorclass instructorclass=new Tinstructorclass();
                instructorclass.setInstructorid(instructorId);
                instructorclass.setClassid(ci);
                instructorclass.setAcademicyearid(startAcademicYearId);
                instructorclass.setTerm(String.valueOf(st));
                instructorclasses.add(instructorclass);
            }
            if(st==2){
                startAcademicYearId++;
                st=1;
            }else {
                st++;
            }
        }
//        for(Tinstructorclass tinstructorclass:instructorclasses){
//            System.out.println(tinstructorclass);
//        }
        this.iclassMapper.insertBath(instructorclasses);
    }

}
