package com.dev.devsuperior.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.devsuperior.dto.SaleDto;
import com.dev.devsuperior.dto.SaleSuccessDto;
import com.dev.devsuperior.dto.SaleSumDto;
import com.dev.devsuperior.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable){
		Page<SaleDto> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDto>> amountGroupedBtSeller(){
		List<SaleSumDto> list = service.amountGroupedBtSeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDto>> succGroupedBtSeller(){
		List<SaleSuccessDto> list = service.successGroupedBtSeller();
		return ResponseEntity.ok(list);
	}
	

}
