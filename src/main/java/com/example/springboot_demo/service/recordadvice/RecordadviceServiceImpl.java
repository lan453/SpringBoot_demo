package com.example.springboot_demo.service.recordadvice;

import com.example.springboot_demo.dao.mapper.TrecordadviceMapper;
import com.example.springboot_demo.entity.Trecordadvice;
import com.example.springboot_demo.ventity.ComBoxEntity;
import com.example.springboot_demo.ventity.UpdateRegDatesParam;
import com.example.springboot_demo.ventity.Vrecordadvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordadviceServiceImpl implements IRecordadviceService {
    @Autowired
    private TrecordadviceMapper trecordadviceMapper;
    @Override
    public Vrecordadvice selectNowFestival(){
        return this.trecordadviceMapper.selectNowFestival();
    }
    @Override
    public List<ComBoxEntity> listFestival(){
        return this.trecordadviceMapper.listFestival();
    }
    @Override
    public Trecordadvice selectByPrimaryKey(Long id){
        return this.trecordadviceMapper.selectByPrimaryKey(id);
    }
    @Override
    public void updateRegDate(UpdateRegDatesParam param){
        this.trecordadviceMapper.updateRegDate(param);
    }
}
