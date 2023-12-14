package com.example.springboot_demo.dao.mapper;

import com.example.springboot_demo.entity.Tcolleage;
import com.example.springboot_demo.entity.TcolleageExample;
import com.example.springboot_demo.ventity.VColleage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TcolleageMapper {
    long countByExample(TcolleageExample example);

    int deleteByExample(TcolleageExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(Tcolleage record);

    int insertSelective(Tcolleage record);

    List<Tcolleage> selectByExample(TcolleageExample example);

    Tcolleage selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") Tcolleage record, @Param("example") TcolleageExample example);

    int updateByExample(@Param("record") Tcolleage record, @Param("example") TcolleageExample example);

    int updateByPrimaryKeySelective(Tcolleage record);

    int updateByPrimaryKey(Tcolleage record);

    List<VColleage> selectVColleage();
    List<VColleage> selectCascadeClass();
    List<VColleage> selectClassTree(int colleageID, int enteryear);
}