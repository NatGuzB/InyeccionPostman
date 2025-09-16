package com.Blog.Blog.Service;

import com.Blog.Blog.Model.Comment;
import java.util.List;
import java.util.Optional;

public interface ICommentService {
    List<Comment> getAllComments();
    Optional<Comment> getCommentById(Long id); // Devuelve Optional<Comment>
    Comment createComment(Comment comment); // Devuelve Comment
    void updateComment(Comment comment);
    void deleteComment(Long id);
}