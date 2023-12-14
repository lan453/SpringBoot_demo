package com.example.springboot_demo.service.common;

import com.example.springboot_demo.ventity.ComBoxEntity;

import java.util.List;

public interface ICommonService {


    List<ComBoxEntity> listDicTableAndField(String tableName, String fieldName);
}
