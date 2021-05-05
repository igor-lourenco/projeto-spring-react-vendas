package com.devsuperior.demodsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.demodsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
