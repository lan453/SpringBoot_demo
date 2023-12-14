package com.example.springboot_demo.dao.mapper;

import com.example.springboot_demo.entity.Tregion;
import com.example.springboot_demo.entity.TregionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TregionMapper {
    long countByExample(TregionExample example);

    int deleteByExample(TregionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tregion record);

    int insertSelective(Tregion record);

    List<Tregion> selectByExample(TregionExample example);

    Tregion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tregion record, @Param("example") TregionExample example);

    int updateByExample(@Param("record") Tregion record, @Param("example") TregionExample example);

    int updateByPrimaryKeySelective(Tregion record);

    int updateByPrimaryKey(Tregion record);
}