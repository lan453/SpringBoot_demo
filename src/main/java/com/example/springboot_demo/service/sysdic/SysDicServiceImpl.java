package com.example.springboot_demo.service.sysdic;

import com.example.springboot_demo.dao.mapper.TsysdicMapper;
import com.example.springboot_demo.ventity.ComBoxEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SysDicServiceImpl implements SysDicService{
    @Autowired
    private TsysdicMapper tsysdicMapper;
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    public List<ComBoxEntity> ListEnterYear(int startYear){
        return this.tsysdicMapper.selectAcaDic(startYear);
    }
}
