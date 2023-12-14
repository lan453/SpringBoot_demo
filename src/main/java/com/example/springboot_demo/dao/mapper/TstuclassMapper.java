package com.example.springboot_demo.dao.mapper;

import com.example.springboot_demo.entity.Tstuclass;
import com.example.springboot_demo.entity.TstuclassExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TstuclassMapper {
    long countByExample(TstuclassExample example);

    int deleteByExample(TstuclassExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tstuclass record);

    int insertSelective(Tstuclass record);

    List<Tstuclass> selectByExample(TstuclassExample example);

    Tstuclass selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tstuclass record, @Param("example") TstuclassExample example);

    int updateByExample(@Param("record") Tstuclass record, @Param("example") TstuclassExample example);

    int updateByPrimaryKeySelective(Tstuclass record);

    int updateByPrimaryKey(Tstuclass record);

}