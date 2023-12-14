package com.example.springboot_demo.service.recordadvice;

import com.example.springboot_demo.entity.Trecordadvice;
import com.example.springboot_demo.ventity.ComBoxEntity;
import com.example.springboot_demo.ventity.UpdateRegDatesParam;
import com.example.springboot_demo.ventity.Vrecordadvice;

import java.util.List;

public interface IRecordadviceService {
    Vrecordadvice selectNowFestival();

    List<ComBoxEntity> listFestival();

    Trecordadvice selectByPrimaryKey(Long id);

    void updateRegDate(UpdateRegDatesParam param);
}
