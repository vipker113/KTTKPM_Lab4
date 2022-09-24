package com.example.springboot.servicelmp;


import com.example.springboot.model.NhanVien;
import com.example.springboot.repository.NhanVienRepository;
import com.example.springboot.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImp implements NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepo;

    @Override
    public List<NhanVien> getDSNhanVienByLuongGreater(double luong){
        return nhanVienRepo.findNhanViensByLuongGreaterThan(luong);
    }
}
