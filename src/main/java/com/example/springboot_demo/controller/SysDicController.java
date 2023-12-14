package com.example.springboot_demo.controller;

import com.example.springboot_demo.service.sysdic.SysDicService;
import com.example.springboot_demo.union.result.Result;
import com.example.springboot_demo.ventity.ComBoxEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mgt/sysdic")
public class SysDicController {
    @Autowired
    SysDicService sysDicService;
    @PostMapping("/listEnterYear")
    public Result ListEnterYear(@RequestParam("startYear") int startYear){
        List<ComBoxEntity> datas = this.sysDicService.ListEnterYear(startYear);
        return Result.OK(datas);
    }
}
