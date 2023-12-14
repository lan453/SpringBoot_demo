package com.example.springboot_demo.dao.mapper;

import com.example.springboot_demo.entity.Tacademicyear;
import com.example.springboot_demo.entity.TacademicyearExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TacademicyearMapper {
    long countByExample(TacademicyearExample example);

    int deleteByExample(TacademicyearExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(Tacademicyear record);

    int insertSelective(Tacademicyear record);

    List<Tacademicyear> selectByExample(TacademicyearExample example);

    Tacademicyear selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") Tacademicyear record, @Param("example") TacademicyearExample example);

    int updateByExample(@Param("record") Tacademicyear record, @Param("example") TacademicyearExample example);

    int updateByPrimaryKeySelective(Tacademicyear record);

    int updateByPrimaryKey(Tacademicyear record);
}