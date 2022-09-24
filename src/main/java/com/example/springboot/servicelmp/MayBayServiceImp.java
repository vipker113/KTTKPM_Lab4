package com.example.springboot.servicelmp;

import com.example.springboot.model.MayBay;
import com.example.springboot.repository.MayBayRepository;
import com.example.springboot.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MayBayServiceImp implements MayBayService {
    @Autowired
    private MayBayRepository mayBayRepository;

    @Override
    public List<MayBay> getDSMaybayByTambayGreater(long tambay){
        return mayBayRepository.findMayBaysByTambayGreaterThan(tambay);
    }
}
