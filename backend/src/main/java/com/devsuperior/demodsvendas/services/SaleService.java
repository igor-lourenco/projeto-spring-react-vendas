package com.devsuperior.demodsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.demodsvendas.dto.SaleDTO;
import com.devsuperior.demodsvendas.dto.SaleSuccessDTO;
import com.devsuperior.demodsvendas.dto.SaleSumDTO;
import com.devsuperior.demodsvendas.entities.Sale;
import com.devsuperior.demodsvendas.repositories.SaleRepository;
import com.devsuperior.demodsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){ //Retorna uma lista paginada no banco
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){ //Retorna a soma total da venda de cada vendedor
		sellerRepository.findAll(); 
		return repository.amountGroupedBySeller();
	}

	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){ //Retorna a soma total da taxa de sucesso de cada vendedor
		sellerRepository.findAll();
		return repository.successGroupedBySeller();
	}
}
