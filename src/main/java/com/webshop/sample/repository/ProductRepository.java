package com.webshop.sample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webshop.sample.entity.Product;

@Repository
public interface ProductRepository extends   CrudRepository <Product,Long>{
}
