package com.dev.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.devsuperior.entities.Sale;
import com.dev.devsuperior.entities.Seller;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
