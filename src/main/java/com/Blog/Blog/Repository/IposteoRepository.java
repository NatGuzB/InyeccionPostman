package com.Blog.Blog.Repository;

import com.Blog.Blog.Model.Posteo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface IposteoRepository extends JpaRepository<Posteo, Long> {
    List<Posteo> findByAuthorId(Long authorId);
}
