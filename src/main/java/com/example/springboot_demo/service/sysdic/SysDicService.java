package com.example.springboot_demo.service.sysdic;

import com.example.springboot_demo.ventity.ComBoxEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface SysDicService {
    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    List<ComBoxEntity> ListEnterYear(int startYear);
}
