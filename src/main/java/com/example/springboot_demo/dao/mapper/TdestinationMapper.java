package com.example.springboot_demo.dao.mapper;

import com.example.springboot_demo.entity.Tdestination;
import com.example.springboot_demo.entity.TdestinationExample;
import com.example.springboot_demo.ventity.ComBoxEntity;
import com.example.springboot_demo.ventity.CommonQueryTree;
import com.example.springboot_demo.ventity.VFestivalRegTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TdestinationMapper {
    long countByExample(TdestinationExample example);

    int deleteByExample(TdestinationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tdestination record);

    int insertSelective(Tdestination record);

    List<Tdestination> selectByExample(TdestinationExample example);

    Tdestination selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tdestination record, @Param("example") TdestinationExample example);

    int updateByExample(@Param("record") Tdestination record, @Param("example") TdestinationExample example);

    int updateByPrimaryKeySelective(Tdestination record);

    int updateByPrimaryKey(Tdestination record);
    List<ComBoxEntity> listProvince();
    List<ComBoxEntity> listCity(Long parentRegionId);
    List<ComBoxEntity> listCounty(Long parentRegionId);
    List<VFestivalRegTable> queryFestivalReg(CommonQueryTree param);
}