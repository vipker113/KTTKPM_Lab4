package com.example.springboot.repository;

import com.example.springboot.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien,String> {
    List<NhanVien> findNhanViensByLuongGreaterThan(double luong);
}
