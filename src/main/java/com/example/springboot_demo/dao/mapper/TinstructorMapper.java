package com.example.springboot_demo.dao.mapper;

import com.example.springboot_demo.entity.Tinstructor;
import com.example.springboot_demo.entity.TinstructorExample;
import com.example.springboot_demo.ventity.InstructorClassQueryParam;
import com.example.springboot_demo.ventity.Vinstructor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TinstructorMapper {
    long countByExample(TinstructorExample example);

    int deleteByExample(TinstructorExample example);

    int deleteByPrimaryKey(Short id);

    int insert(Tinstructor record);

    int insertSelective(Tinstructor record);

    List<Tinstructor> selectByExample(TinstructorExample example);

    Tinstructor selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") Tinstructor record, @Param("example") TinstructorExample example);

    int updateByExample(@Param("record") Tinstructor record, @Param("example") TinstructorExample example);

    int updateByPrimaryKeySelective(Tinstructor record);

    int updateByPrimaryKey(Vinstructor record);
    List<Vinstructor> selectInstructorTable(InstructorClassQueryParam param);
}