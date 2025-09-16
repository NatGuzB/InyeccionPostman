package com.Blog.Blog.Repository;
import com.Blog.Blog.Model.Posteo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IposteoRepository extends JpaRepository<Posteo, Long> {

}