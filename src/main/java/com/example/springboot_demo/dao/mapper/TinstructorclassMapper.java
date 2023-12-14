package com.example.springboot_demo.dao.mapper;

import com.example.springboot_demo.entity.Tinstructorclass;
import com.example.springboot_demo.entity.TinstructorclassExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TinstructorclassMapper {
    long countByExample(TinstructorclassExample example);

    int deleteByExample(TinstructorclassExample example);

    int deleteByPrimaryKey(Integer id);
    void deleteByInstructorId(Short instructorid);

    int insert(Tinstructorclass record);

    int insertSelective(Tinstructorclass record);

    List<Tinstructorclass> selectByExample(TinstructorclassExample example);

    Tinstructorclass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tinstructorclass record, @Param("example") TinstructorclassExample example);

    int updateByExample(@Param("record") Tinstructorclass record, @Param("example") TinstructorclassExample example);

    int updateByPrimaryKeySelective(Tinstructorclass record);

    int updateByPrimaryKey(Tinstructorclass record);
    int insertBath(List<Tinstructorclass> instructorclasses);
}