package com.Blog.Blog.Service;

import com.Blog.Blog.Model.Comment;
import com.Blog.Blog.Repository.IcommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService implements ICommentService {
    private final IcommentRepository commentRepository;

    public CommentService(IcommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public Optional<Comment> getCommentById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void updateComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }
}


