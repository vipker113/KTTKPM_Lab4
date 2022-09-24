package com.example.springboot;

import com.example.springboot.service.ChuyenBayService;
import com.example.springboot.service.MayBayService;
import com.example.springboot.service.NhanVienService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataJpaApplicationTests {

	@Autowired
	private ChuyenBayService chuyenBayService;
	@Autowired
	private MayBayService mayBayService;
	@Autowired
	private NhanVienService nhanVienService;

	@Test
	void contextLoads() {
	}

}
