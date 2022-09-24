package com.example.springboot.service;

import com.example.springboot.model.MayBay;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MayBayService {
    List<MayBay> getDSMaybayByTambayGreater(long tambay);
}
