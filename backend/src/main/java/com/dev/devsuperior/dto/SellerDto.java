package com.dev.devsuperior.dto;

import java.io.Serializable;

import com.dev.devsuperior.entities.Seller;

public class SellerDto implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	public SellerDto() {}

	public SellerDto(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public SellerDto(Seller entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
