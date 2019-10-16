package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService<E> {
    List<E> findAll();
    Product findById(long id);
}
