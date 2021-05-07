package com.fugmann.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fugmann.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
