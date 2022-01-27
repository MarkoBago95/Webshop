package com.webshop.sample.service;

import java.util.List;

import com.webshop.sample.entity.Product;

public interface ProductService {

    Product saveProduct(Product product);
    Product updateProduct(Product product);
    List<Product> getAllProducts();
    Product getProduct(Long id);
    void deleteProduct(Long id);
}
