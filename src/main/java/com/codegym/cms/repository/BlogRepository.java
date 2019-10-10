package com.codegym.cms.repository;

import com.codegym.cms.model.Blog;
import com.codegym.cms.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BlogRepository extends PagingAndSortingRepository<Blog,Long> {
    List<Blog> findAll();
    List<Blog> findAllByCategory_Id(Long id);
    Blog findById(Long id);

    Iterable<Blog> findAllByCategory(Category category);
    Page<Blog> findAllByTittleContaining(String tittle, Pageable pageable);
    Page<Blog> findAllByCategory_Id(Long id,Pageable pageable);

}


//public interface BlogRepository extends PagingAndSortingRepository<Blog,Long> {
//    Iterable<Blog> findAllByCategory(Category category);
//    Page<Blog> findAllByTittleContaining(String tittle, Pageable pageable);
//    Page<Blog> findAllByCategory_Id(Long id,Pageable pageable);
//}
