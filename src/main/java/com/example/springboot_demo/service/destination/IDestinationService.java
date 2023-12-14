package com.example.springboot_demo.service.destination;

import com.example.springboot_demo.entity.Tdestination;
import com.example.springboot_demo.ventity.ComBoxEntity;
import com.example.springboot_demo.ventity.CommonQueryTree;
import com.example.springboot_demo.ventity.VFestivalRegTable;

import java.util.List;

public interface IDestinationService {
    List<ComBoxEntity> listProvince();

    List<ComBoxEntity> listCity(Long parentRegionId);

    List<ComBoxEntity> listCounty(Long parentRegionId);

    void addDestination(Tdestination param);

    Tdestination selectByPrimaryKey(Long id);

    List<VFestivalRegTable> queryFestivalReg(CommonQueryTree param);
}
