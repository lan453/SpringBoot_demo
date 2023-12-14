package com.example.springboot_demo.service.destination;

import com.example.springboot_demo.dao.mapper.TdestinationMapper;
import com.example.springboot_demo.entity.Tdestination;
import com.example.springboot_demo.ventity.ComBoxEntity;
import com.example.springboot_demo.ventity.CommonQueryTree;
import com.example.springboot_demo.ventity.VFestivalRegTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class destinationServiceImpl implements IDestinationService {
    @Autowired
    private TdestinationMapper tdestinationMapper;
    @Override
    public List<ComBoxEntity> listProvince(){
        return this.tdestinationMapper.listProvince();
    }
    @Override
    public List<ComBoxEntity> listCity(Long parentRegionId){
        return this.tdestinationMapper.listCity(parentRegionId);
    }
    @Override
    public List<ComBoxEntity> listCounty(Long parentRegionId){
        return this.tdestinationMapper.listCity(parentRegionId);
    }
    @Override
    public void addDestination(Tdestination param){
        System.out.println(param);
        this.tdestinationMapper.insert(param);
    }
    @Override
    public Tdestination selectByPrimaryKey(Long id){
        return this.tdestinationMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<VFestivalRegTable> queryFestivalReg(CommonQueryTree param){
//        System.out.println(param);
        return this.tdestinationMapper.queryFestivalReg(param);
    }
}
