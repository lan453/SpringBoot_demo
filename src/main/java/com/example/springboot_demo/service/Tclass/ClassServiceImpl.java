package com.example.springboot_demo.service.Tclass;

import com.example.springboot_demo.dao.mapper.TclassMapper;
import com.example.springboot_demo.entity.Tclass;
import com.example.springboot_demo.entity.TclassExample;
import com.example.springboot_demo.entity.TclassExample.Criteria;
import com.example.springboot_demo.ventity.ComBoxEntity;
import com.example.springboot_demo.ventity.CommonClass;
import com.example.springboot_demo.ventity.CommonInCla;
import com.example.springboot_demo.ventity.PageDataClass;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClassServiceImpl implements IClassService {
    @Autowired
    private TclassMapper classMapper;
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public List<CommonClass> queryClass() {

        return this.classMapper.selectClass();
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public int addClass(Tclass obj){
        return this.classMapper.insert(obj);
    }
    @Override
    public PageDataClass<CommonClass> queryPagedClass(int page, int rows, Tclass param) {
        PageHelper.startPage(page, rows);
        TclassExample ce = new TclassExample();
        Criteria criteria = ce.createCriteria();
        Optional.ofNullable(param).ifPresent(cl->{
            Optional.ofNullable(cl.getColleageid()).ifPresent(colleageId->{
                if (colleageId>0)
                    criteria.andColleageidEqualTo(colleageId);
                else
                    criteria.andColleageidGreaterThan(colleageId);
            });
            Optional.ofNullable(cl.getName()).ifPresent(name->{
                if (StringUtil.isNotEmpty(name.trim())){
                    criteria.andNameLike("cl","%"+cl.getName()+"%");
                }
            });
            if (cl.getEnteryear() != null && cl.getEnteryear()>0){
                criteria.andEnteryearEqualTo(cl.getEnteryear());
            }
            Optional.ofNullable(cl.getMajorid()).ifPresent(majorId->{
                criteria.andMajoridEqualTo(majorId);
            });
        });
        List<CommonClass> datas = this.classMapper.selectByExampleAndCascade(ce);
        com.github.pagehelper.Page<CommonClass> listWithPage = (com.github.pagehelper.Page<CommonClass>)datas;
        PageDataClass<CommonClass> pd =new PageDataClass<>();//
        pd.setTotal(listWithPage.getTotal());
        pd.setRows(listWithPage.getResult());//
        listWithPage.close();
        return pd;
    }
    @Override
    public Tclass queryClassById(int id){
        return this.classMapper.selectByPrimaryKey(id);
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public void updateClass(Tclass param){
        this.classMapper.updateByPrimaryKey(param);
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public void deleteClass(int id){
        this.classMapper.deleteByPrimaryKey(id);
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public List<ComBoxEntity> queryByColleageId(Integer coleageId){
        return this.classMapper.selectClassTree(coleageId);
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public List<CommonClass> listClassByEnterYearAndColleage(String colleagName, List<Integer> enteryears){
        return this.classMapper.listClassByEnterYearAndColleage(colleagName,enteryears);
    }
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public List<CommonInCla> listClassByInstructorId(int instructorId){
        return this.classMapper.listClassByInstructorId(instructorId);
    }


}
