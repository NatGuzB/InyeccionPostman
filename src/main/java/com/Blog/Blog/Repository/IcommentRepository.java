package com.Blog.Blog.Repository;
import com.Blog.Blog.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IcommentRepository extends JpaRepository<Comment, Long> {
}
