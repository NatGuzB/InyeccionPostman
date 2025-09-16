package com.Blog.Blog.Repository;
import com.Blog.Blog.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IauthorRepository extends JpaRepository<Author, Long> {
}
