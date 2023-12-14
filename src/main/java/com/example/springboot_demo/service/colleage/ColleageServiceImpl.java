package com.example.springboot_demo.service.colleage;



import com.example.springboot_demo.dao.mapper.TcolleageMapper;
import com.example.springboot_demo.entity.Tcolleage;
import com.example.springboot_demo.entity.TcolleageExample;
import com.example.springboot_demo.ventity.PagedData;
import com.example.springboot_demo.ventity.VColleage;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class ColleageServiceImpl implements IColleageService {
//@Autowired 它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作，通过@Autowired 的使用来消除 set/get 方法。
    @Autowired
    private TcolleageMapper colleageMapper;
//帮助自己检查是否正确地复写了父类中已有的方法
    @Override
    public PagedData queryPagedColleage(int page, int  rows, Tcolleage param) {
        PageHelper.startPage(page, rows);
        TcolleageExample example = new TcolleageExample();
        TcolleageExample.Criteria cr = example.createCriteria();
        if(StringUtils.hasLength(param.getCode())) {
            cr.andCodeLike("%"+param.getCode()+"%");
        }
        if(StringUtils.hasLength(param.getName())) {
            cr.andNameLike("%"+param.getName()+"%");
        }

        List<Tcolleage> datas = colleageMapper.selectByExample(example);
        com.github.pagehelper.Page listWithPage = (com.github.pagehelper.Page)datas;
        PagedData pd = new PagedData();
        pd.setTotal(listWithPage.getTotal());
        pd.setRows(listWithPage.getResult());
        return pd;
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public boolean addColleage(Tcolleage param) {
        int count = this.colleageMapper.insert(param);
        return count>=1?true:false;
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public void deleteColleage(byte id){
        this.colleageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Tcolleage queryColleageById(Byte id){
        return this.colleageMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public void updateColleage(Tcolleage param){
        this.colleageMapper.updateByPrimaryKey(param);
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public List<VColleage> ListColleage(){
        VColleage vColleage=new VColleage((byte) -1,"黔南民族师范学院");
        vColleage.setChildren(this.colleageMapper.selectVColleage());
        List<VColleage> cs=new ArrayList<>();
        cs.add(vColleage);
        return cs;
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public List<VColleage> selectVcolleage(){
        return this.colleageMapper.selectVColleage();
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public List<VColleage> queryClassTree(){
        return this.colleageMapper.selectCascadeClass();
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public List<VColleage> ListCEATree(){
        List<VColleage> studentTree=new ArrayList<>();
        VColleage school=new VColleage((byte) -1,"黔南民族师范学院");
        List<VColleage> colleages=this.colleageMapper.selectVColleage();
        Calendar cal = Calendar.getInstance();
        Date date=new Date();//现在的日期
        cal.setTime(date);
        int year=cal.get(Calendar.YEAR);//获取年
        int month = cal.get(Calendar.MONTH)+1;//获取月（月份从0开始，如果按照中国的习惯，需要加一）
        for (VColleage colleage:colleages) {
            if (month < 7) {
                for (int i = year - 4; i < year; i++) {
                    VColleage cl = new VColleage();
                    cl.setId(i);
                    cl.setText(i + "级");
                    colleage.getChildren().add(cl);
                }
            } else {
                for (int i = year - 3; i <= year; i++) {
                    VColleage cl = new VColleage();
                    cl.setId(i);
                    cl.setText(i + "级");
                    colleage.getChildren().add(cl);
                }
            }
        }
        for(VColleage colleage:colleages) {
            for (VColleage enterYear : colleage.getChildren()) {
                List<VColleage> datas = this.colleageMapper.selectClassTree(colleage.getId(), enterYear.getId());
                enterYear.getChildren().addAll(datas);
            }
        }
        school.setChildren(colleages);
        studentTree.add(school);
        return studentTree;
    }

}