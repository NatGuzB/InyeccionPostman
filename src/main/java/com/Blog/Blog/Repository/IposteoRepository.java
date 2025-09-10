package com.Blog.Blog.Repository;
import com.Blog.Blog.Model.Posteo;
import java.util.List;

public interface IposteoRepository {
    List<Posteo> findAll();
    Posteo findById(Long id);
    void save(Posteo posteo);
    void deleteById(Long id);
    void update(Posteo posteo);
}
