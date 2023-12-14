package com.example.springboot_demo.controller;

import com.example.springboot_demo.service.common.ICommonService;
import com.example.springboot_demo.union.result.Result;
import com.example.springboot_demo.ventity.ComBoxEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/mgt/common")
public class CommonController {
    @Autowired
    ICommonService commonService;

    private int beginGrade = 2015;
    @PostMapping("/grade")
    public List<ComBoxEntity> listGrade(){
        List<ComBoxEntity> grades = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        for (int i=beginGrade;i<=currentYear;i++){
            ComBoxEntity cbe =new ComBoxEntity(i,String.valueOf(i));
            grades.add(cbe);
        }
        return grades;
    }
    @PostMapping("/listEnteryears")
    public Result listEnteryears(){
        List<ComBoxEntity> grades = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        for (int i=beginGrade;i<=currentYear;i++){
            ComBoxEntity cbe =new ComBoxEntity(i,String.valueOf(i));
            grades.add(cbe);
        }
        List<ComBoxEntity> datas = grades;
        return Result.OK(datas);
    }
    @PostMapping("/diclist")
    public List<ComBoxEntity> listDicByTableAndField(String tableName,String fieldName){
        return this.commonService.listDicTableAndField(tableName.toUpperCase(),fieldName.toUpperCase());
    }
    @PostMapping("/listAcademicyearids")
    public Result listAcademicyearids(String tableName,String fieldName){
        List<ComBoxEntity> datas = this.commonService.listDicTableAndField(tableName.toUpperCase(),fieldName.toUpperCase());
        return Result.OK(datas);
    }

}
