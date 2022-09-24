package com.example.springboot.service;

import com.example.springboot.model.NhanVien;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NhanVienService {
    List<NhanVien> getDSNhanVienByLuongGreater(double luong);
}
