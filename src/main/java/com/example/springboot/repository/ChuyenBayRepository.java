package com.example.springboot.repository;

import com.example.springboot.model.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  ChuyenBayRepository extends JpaRepository<ChuyenBay,String> {
    List<ChuyenBay> findChuyenBaysByGaden(String gaden);
}
