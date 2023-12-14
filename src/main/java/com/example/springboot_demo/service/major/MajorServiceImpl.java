package com.example.springboot_demo.service.major;


import com.example.springboot_demo.dao.mapper.TmajorMapper;
import com.example.springboot_demo.entity.Tmajor;
import com.example.springboot_demo.entity.TmajorExample;
import com.example.springboot_demo.ventity.ComBoxEntity;
import com.example.springboot_demo.ventity.PagedData;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class MajorServiceImpl implements IMajorService {
//@Autowired 它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作，通过@Autowired 的使用来消除 set/get 方法。
    @Autowired
    private TmajorMapper majorMapper;
//帮助自己检查是否正确地复写了父类中已有的方法
    @Override
    public PagedData queryPagedMajor(int page, int rows, Tmajor param) {
        PageHelper.startPage(page, rows);
        TmajorExample example = new TmajorExample();
        TmajorExample.Criteria cr = example.createCriteria();
        if(StringUtils.hasLength(param.getCode())) {
            cr.andCodeLike("%"+param.getCode()+"%");
        }
        if(StringUtils.hasLength(param.getName())) {
            cr.andNameLike("%"+param.getName()+"%");
        }

        List<Tmajor> datas = majorMapper.selectByExample(example);
        com.github.pagehelper.Page listWithPage = (com.github.pagehelper.Page)datas;
        PagedData pd = new PagedData();
        pd.setTotal(listWithPage.getTotal());
        pd.setRows(listWithPage.getResult());
        return pd;
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public boolean addMajor(Tmajor param) {
        int count = this.majorMapper.insert(param);
        return count>=1?true:false;
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public void deleteMajor(short id){
        this.majorMapper.deleteByPrimaryKey(id);
    }
    @Override
    public Tmajor queryMajorById(short id){
        return this.majorMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public void updateMajor(Tmajor param){
        this.majorMapper.updateByPrimaryKey(param);
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public List<ComBoxEntity> queryMajor(){
        System.out.println(this.majorMapper.selectMajor());
        return this.majorMapper.selectMajor();
    }


}