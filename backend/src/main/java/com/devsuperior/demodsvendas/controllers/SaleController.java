package com.devsuperior.demodsvendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demodsvendas.dto.SaleDTO;
import com.devsuperior.demodsvendas.services.SaleService;


@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> finAll(Pageable pageable){
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
}
