package com.example.springboot.service;

import com.example.springboot.model.ChuyenBay;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChuyenBayService {
    List<ChuyenBay> getDSChuyenBayByGaden(String gaden);
}
