package com.example.springboot_demo.dao.mapper;

import com.example.springboot_demo.entity.Trecordadvice;
import com.example.springboot_demo.entity.TrecordadviceExample;
import com.example.springboot_demo.ventity.ComBoxEntity;
import com.example.springboot_demo.ventity.UpdateRegDatesParam;
import com.example.springboot_demo.ventity.Vrecordadvice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TrecordadviceMapper {
    long countByExample(TrecordadviceExample example);

    int deleteByExample(TrecordadviceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Trecordadvice record);

    int insertSelective(Trecordadvice record);

    List<Trecordadvice> selectByExample(TrecordadviceExample example);

    Trecordadvice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Trecordadvice record, @Param("example") TrecordadviceExample example);

    int updateByExample(@Param("record") Trecordadvice record, @Param("example") TrecordadviceExample example);

    int updateByPrimaryKeySelective(Trecordadvice record);

    int updateByPrimaryKey(Trecordadvice record);
    Vrecordadvice selectNowFestival();
    List<ComBoxEntity> listFestival();
    int updateRegDate(UpdateRegDatesParam param);
}