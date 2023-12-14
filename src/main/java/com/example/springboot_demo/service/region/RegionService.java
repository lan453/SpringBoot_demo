package com.example.springboot_demo.service.region;


import com.example.springboot_demo.dao.mapper.TregionMapper;
import com.example.springboot_demo.entity.Tregion;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class RegionService{
    @Autowired
    private TregionMapper regionMapper;

    final String key = "0fa7dd56ec6a7604e8c4d0a855707318";

    private String initRegion(String provinceName) throws IOException{
        String url1="https://restapi.amap.com/v3/config/district?keywords="+provinceName+"&subdistrict=2&key=0fa7dd56ec6a7604e8c4d0a855707318";
        URL url= new URL(url1);
        HttpURLConnection urlConnection=(HttpURLConnection) url.openConnection();
        InputStream is = urlConnection.getInputStream();
        StringBuilder results = new StringBuilder();
        byte []data = new byte[1024];
        int length = is.read(data);
        while(length!=-1) {
            String str = new String(data,0,length);
            results.append(str);
            length = is.read(data);
        }
        System.out.println(results);
        is.close();
        return results.toString();
    }

    public void parseJSON(String provinceName) throws IOException{
        String regionStr = initRegion(provinceName);
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode = objectMapper.readValue(regionStr,JsonNode.class);
        JsonNode districts = jsonNode.get("districts");
        JsonNode provinceNode = districts.get(0);
        JsonNode codeNode = provinceNode.get("adcode");
        JsonNode nameNode = provinceNode.get("name");

        Tregion provinceRegion = new Tregion();
        provinceRegion.setCode(codeNode.asText());
        provinceRegion.setName(nameNode.asText());
        this.regionMapper.insert(provinceRegion);
        deepParse(provinceRegion,provinceNode);
    }

    @Transactional(isolation=Isolation.READ_COMMITTED,rollbackFor=Exception.class)
    private void deepParse(Tregion parentRegioin, JsonNode parentNode) {
        JsonNode districts = parentNode.get("districts");
        for(int i=0;i<districts.size();i++) {
            JsonNode node = districts.get(i);
            JsonNode codeNode = node.get("code");
            JsonNode nameNode = node.get("name");
            Tregion region = new Tregion();
            region.setCode(codeNode.asText());
            region.setName(nameNode.asText());
            region.setParentregionid(parentRegioin.getId());
            this.regionMapper.insert(region);
            deepParse(region,node);
        }
    }



}
