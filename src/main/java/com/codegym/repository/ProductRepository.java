package com.codegym.repository;

import com.codegym.model.Product;

import java.util.List;

public interface ProductRepository<E> {
    List<E> findAll();
    Product findById(long id);
}
