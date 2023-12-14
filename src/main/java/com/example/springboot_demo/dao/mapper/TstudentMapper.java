package com.example.springboot_demo.dao.mapper;

import com.example.springboot_demo.entity.Tstudent;
import com.example.springboot_demo.entity.TstudentExample;
import java.util.List;

import com.example.springboot_demo.ventity.StudentQueryParam;
import com.example.springboot_demo.ventity.VStudent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TstudentMapper {
    long countByExample(TstudentExample example);

    int deleteByExample(TstudentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tstudent record);

    int insertSelective(Tstudent record);

    List<Tstudent> selectByExample(TstudentExample example);

    Tstudent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tstudent record, @Param("example") TstudentExample example);

    int updateByExample(@Param("record") Tstudent record, @Param("example") TstudentExample example);

    int updateByPrimaryKeySelective(Tstudent record);

    int updateByPrimaryKey(Tstudent record);

    long selectStuIdByNum(String num);

    List<VStudent> queryStudentPage(StudentQueryParam param);
//    User getById(Long id);
//    User getByUsername(String name);
}