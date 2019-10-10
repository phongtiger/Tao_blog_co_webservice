package com.codegym.cms.service;

import com.codegym.cms.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category>findAllRest();
    Iterable<Category> findAll();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);
}
