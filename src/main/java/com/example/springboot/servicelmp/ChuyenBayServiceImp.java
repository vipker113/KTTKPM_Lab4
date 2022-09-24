package com.example.springboot.servicelmp;


import com.example.springboot.model.ChuyenBay;
import com.example.springboot.repository.ChuyenBayRepository;
import com.example.springboot.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuyenBayServiceImp implements ChuyenBayService {
    @Autowired
    private ChuyenBayRepository chuyenBayRepo;

    @Override
    public List<ChuyenBay> getDSChuyenBayByGaden(String gaden){
        return chuyenBayRepo.findChuyenBaysByGaden(gaden);
    }
}
