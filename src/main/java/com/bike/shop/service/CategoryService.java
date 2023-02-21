package com.bike.shop.service;

import com.bike.shop.domain.Category;

import java.util.List;


public interface CategoryService {

    void save(Category category);
    List<Category> findAll();
}
