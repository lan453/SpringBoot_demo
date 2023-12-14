package com.example.springboot_demo.controller;
//控制层作用：接收参数，返回结果，调用服务层
import com.example.springboot_demo.entity.Tmajor;
import com.example.springboot_demo.service.major.IMajorService;
import com.example.springboot_demo.union.result.Result;
import com.example.springboot_demo.ventity.ComBoxEntity;
import com.example.springboot_demo.ventity.PagedData;
import com.example.springboot_demo.ventity.VColleage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mgt/major")
public class MajorConstroller {
    @Autowired
    private IMajorService majorService;

    @PostMapping("/query")
    public PagedData queryPagedMajor(int page, int rows, Tmajor param) {
        return majorService.queryPagedMajor(page, rows, param);
    }

    @PostMapping("/add")
    public Result addMajor(Tmajor param){
        boolean isok = this.majorService.addMajor(param);
        if (isok){
            return Result.OK();
        }else {
            return Result.ERROR();
        }
    }

    @DeleteMapping("/delete/{id}")
    public Result deleteMajor(@PathVariable(name = "id") byte id){
        this.majorService.deleteMajor(id);
        return Result.OK();
    }
    @PostMapping("/queryPrimaryKey/{id}")
    public Result queryMajorByID(@PathVariable(name = "id") short id){
        Tmajor major = this.majorService.queryMajorById(id);
        return Result.OK(major);
    }

    @PutMapping("/updateMajor")
    public Result updateColleage(Tmajor major){
        this.majorService.updateMajor(major);
        return Result.OK();
    }
    @PostMapping("/queryMajor")
    public List<ComBoxEntity> queryMajor(){
        return this.majorService.queryMajor();
    }
    @PostMapping("/queryListMajor")
    public Result queryMajorList(){
        List<ComBoxEntity> datas=this.majorService.queryMajor();
        return Result.OK(datas);
    }


}