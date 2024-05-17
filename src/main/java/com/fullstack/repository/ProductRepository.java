package com.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}