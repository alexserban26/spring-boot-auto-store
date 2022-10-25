package com.autostore.partstore.dao;

import com.autostore.partstore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
