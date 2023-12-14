package com.example.springboot_demo.controller;

import com.example.springboot_demo.service.region.RegionService;
import com.example.springboot_demo.union.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/mgt/region")
public class RegionConstroller {

    @Autowired
    private RegionService regionService;

    @GetMapping("/initRegionFromUrl")
    public Result regionInit(String provinceName)throws IOException{
        this.regionService.parseJSON(provinceName);
        return Result.OK();
    }

}

