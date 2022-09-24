package com.example.springboot.repository;

import com.example.springboot.model.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay,String> {
    List<MayBay> findMayBaysByTambayGreaterThan(long tambay);
}
