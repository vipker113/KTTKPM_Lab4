package com.example.springboot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
@Data
public class NhanVien {
    @Id
    private String manv;
    private String ten;
    private Double luong;
}
