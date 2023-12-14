package com.example.springboot_demo.dao.mapper;

import com.example.springboot_demo.entity.Tmajor;
import com.example.springboot_demo.entity.TmajorExample;
import com.example.springboot_demo.ventity.ComBoxEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TmajorMapper {
    long countByExample(TmajorExample example);

    int deleteByExample(TmajorExample example);

    int deleteByPrimaryKey(Short id);

    int insert(Tmajor record);

    int insertSelective(Tmajor record);

    List<Tmajor> selectByExample(TmajorExample example);

    Tmajor selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") Tmajor record, @Param("example") TmajorExample example);

    int updateByExample(@Param("record") Tmajor record, @Param("example") TmajorExample example);

    int updateByPrimaryKeySelective(Tmajor record);

    int updateByPrimaryKey(Tmajor record);
    List<ComBoxEntity> selectMajor();
}