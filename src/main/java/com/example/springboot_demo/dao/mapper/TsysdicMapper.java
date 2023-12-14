package com.example.springboot_demo.dao.mapper;

import com.example.springboot_demo.entity.Tsysdic;
import com.example.springboot_demo.entity.TsysdicExample;
import com.example.springboot_demo.ventity.ComBoxEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TsysdicMapper {
    long countByExample(TsysdicExample example);

    int deleteByExample(TsysdicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tsysdic record);

    int insertSelective(Tsysdic record);

    List<Tsysdic> selectByExample(TsysdicExample example);
    List<ComBoxEntity> selectValueAndDes(String tableName, String fieldName);

    Tsysdic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tsysdic record, @Param("example") TsysdicExample example);

    int updateByExample(@Param("record") Tsysdic record, @Param("example") TsysdicExample example);

    int updateByPrimaryKeySelective(Tsysdic record);

    int updateByPrimaryKey(Tsysdic record);

    List<ComBoxEntity> selectAcaDic(int startYear);
}