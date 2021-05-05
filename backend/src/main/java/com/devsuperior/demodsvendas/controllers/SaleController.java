package com.devsuperior.demodsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demodsvendas.dto.SaleDTO;
import com.devsuperior.demodsvendas.dto.SaleSuccessDTO;
import com.devsuperior.demodsvendas.dto.SaleSumDTO;
import com.devsuperior.demodsvendas.services.SaleService;


@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> finAll(Pageable pageable){ // Pega a lista e mostra no website
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){ // Pega a soma total de venda de cada vendedor e mostra no website
		List<SaleSumDTO> list = service.amountGroupedBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(){ // Pega a soma total da taxa de suesso de cada vendedor e mostra no website
		List<SaleSuccessDTO> list = service.successGroupedBySeller();
		return ResponseEntity.ok(list);
	}
}
