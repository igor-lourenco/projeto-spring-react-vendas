package com.devsuperior.demodsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.demodsvendas.dto.SaleSuccessDTO;
import com.devsuperior.demodsvendas.dto.SaleSumDTO;
import com.devsuperior.demodsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.devsuperior.demodsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.devsuperior.demodsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited),"
			+ "SUM(obj.deals))"
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
}
