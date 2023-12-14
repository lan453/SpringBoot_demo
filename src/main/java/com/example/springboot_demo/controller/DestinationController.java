package com.example.springboot_demo.controller;

import com.example.springboot_demo.entity.Tdestination;
import com.example.springboot_demo.service.destination.IDestinationService;
import com.example.springboot_demo.ventity.ComBoxEntity;
import com.example.springboot_demo.ventity.CommonQueryTree;
import com.example.springboot_demo.ventity.VFestivalRegTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mgt/destination")
public class DestinationController {
    @Autowired
    private IDestinationService destinationService;
    @PostMapping("/listProvince")
    public List<ComBoxEntity> listProvince(){
        return this.destinationService.listProvince();
    }
    @PostMapping("/listCity")
    public List<ComBoxEntity> listCity(Long parentRegionId){
        return this.destinationService.listCity(parentRegionId);
    }
    @PostMapping("/listCounty")
    public List<ComBoxEntity> listCounty(Long parentRegionId){
        return this.destinationService.listCounty(parentRegionId);
    }
    @PostMapping("/addDestination")
    public void addDestination(Tdestination tdestination){
        this.destinationService.addDestination(tdestination);
    }
    @PostMapping("/selectByPrimaryKey")
    public Tdestination selectByPrimaryKey(Long id){
        return this.destinationService.selectByPrimaryKey(id);
    }
    @PostMapping("/queryFestivalReg")
    public List<VFestivalRegTable> queryFestivalReg(CommonQueryTree param){
        return this.destinationService.queryFestivalReg(param);
    }

}
