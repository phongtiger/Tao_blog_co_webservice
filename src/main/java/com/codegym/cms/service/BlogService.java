package com.codegym.cms.service;

import com.codegym.cms.model.Blog;
import com.codegym.cms.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    Iterable<Blog> findAllByProvince(Category category);
    Page<Blog> findAllByTittleContaining(String tittle, Pageable pageable);
    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
