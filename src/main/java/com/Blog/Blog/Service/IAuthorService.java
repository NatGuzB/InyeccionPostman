package com.Blog.Blog.Service;

import com.Blog.Blog.Model.Author;
import java.util.List;
import java.util.Optional;

public interface IAuthorService {
    List<Author> getAllAuthors();
    Optional<Author> getAuthorById(Long id);
    Author createAuthor(Author author);
    void updateAuthor(Author author);
    void deleteAuthor(Long id);
}