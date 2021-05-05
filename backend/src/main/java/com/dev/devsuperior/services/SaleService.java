package com.dev.devsuperior.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.devsuperior.dto.SaleDto;
import com.dev.devsuperior.dto.SaleSuccessDto;
import com.dev.devsuperior.dto.SaleSumDto;
import com.dev.devsuperior.dto.SellerDto;
import com.dev.devsuperior.entities.Sale;
import com.dev.devsuperior.entities.Seller;
import com.dev.devsuperior.repositories.SaleRepository;
import com.dev.devsuperior.repositories.SellerRepository;

@Service
public class SaleService {
	@Autowired
	private SaleRepository repository;
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDto> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDto(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDto> amountGroupedBtSeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDto> successGroupedBtSeller(){
		return repository.successGroupedBySeller();
	}
	
}
