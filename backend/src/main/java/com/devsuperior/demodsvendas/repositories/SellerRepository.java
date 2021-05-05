package com.devsuperior.demodsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.demodsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
