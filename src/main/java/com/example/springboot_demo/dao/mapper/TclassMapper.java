package com.example.springboot_demo.dao.mapper;

import com.example.springboot_demo.entity.Tclass;
import com.example.springboot_demo.entity.TclassExample;
import com.example.springboot_demo.ventity.ComBoxEntity;
import com.example.springboot_demo.ventity.CommonClass;
import com.example.springboot_demo.ventity.CommonInCla;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TclassMapper {
    List<CommonClass> listClassByEnterYearAndColleage(String colleagName, List<Integer> enteryears);
    long countByExample(TclassExample example);

    int deleteByExample(TclassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tclass record);

    int insertSelective(Tclass record);

    List<Tclass> selectByExample(TclassExample example);

    Tclass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tclass record, @Param("example") TclassExample example);

    int updateByExample(@Param("record") Tclass record, @Param("example") TclassExample example);

    int updateByPrimaryKeySelective(Tclass record);

    int updateByPrimaryKey(Tclass record);
    List<CommonClass> selectClass();
    List<CommonClass> selectByExampleAndCascade(TclassExample example);
    List<ComBoxEntity> selectClassTree(Integer colleageid);
    List<CommonInCla> listClassByInstructorId(Integer instructorId);
}