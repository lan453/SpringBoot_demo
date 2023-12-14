package com.example.springboot_demo.service.common;

import com.example.springboot_demo.dao.mapper.TsysdicMapper;
import com.example.springboot_demo.ventity.ComBoxEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonServise implements ICommonService {
    @Autowired
    private TsysdicMapper dicMapper;
    @Override
    public List<ComBoxEntity> listDicTableAndField(String tableName, String fieldName){
        return this.dicMapper.selectValueAndDes(tableName.toUpperCase(),fieldName.toUpperCase());
    }
}
