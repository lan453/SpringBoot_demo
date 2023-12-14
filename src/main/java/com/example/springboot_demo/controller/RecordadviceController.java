package com.example.springboot_demo.controller;

import com.example.springboot_demo.entity.Tdestination;
import com.example.springboot_demo.entity.Trecordadvice;
import com.example.springboot_demo.service.recordadvice.IRecordadviceService;
import com.example.springboot_demo.ventity.ComBoxEntity;
import com.example.springboot_demo.ventity.UpdateRegDatesParam;
import com.example.springboot_demo.ventity.Vrecordadvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mgt/recordadvice")
public class RecordadviceController {
    @Autowired
    private IRecordadviceService recordadviceService;
    @PostMapping("/queryNowFestival")
    public Vrecordadvice selectNowFestival(){
        return this.recordadviceService.selectNowFestival();
    }
    @PostMapping("/listFestival")
    public List<ComBoxEntity> listFestival(){
        return this.recordadviceService.listFestival();
    }
    @PostMapping("/selectByPrimaryKey")
    public Trecordadvice selectByPrimaryKey(Long id){
        return this.recordadviceService.selectByPrimaryKey(id);
    }
    @PostMapping("/updateRegDate")
    public void updateRegDate(UpdateRegDatesParam param){
        this.recordadviceService.updateRegDate(param);
    }
}
