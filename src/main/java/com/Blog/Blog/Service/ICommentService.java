package com.Blog.Blog.Service;

import com.Blog.Blog.Model.Comment;
import java.util.List;
import java.util.Optional;

public interface ICommentService {
    List<Comment> getAllComments();
    Optional<Comment> getCommentById(Long id);
    Comment createComment(Comment comment);
    void updateComment(Comment comment);
    void deleteComment(Long id);
}