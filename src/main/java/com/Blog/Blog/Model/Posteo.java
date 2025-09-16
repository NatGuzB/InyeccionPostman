package com.Blog.Blog.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Posteo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    @JsonManagedReference
    private Author author;

    @OneToMany(mappedBy = "posteo", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference
    private List<Comment> comments;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }
    public List<Comment> getComments() { return comments; }
    public void setComments(List<Comment> comments) { this.comments = comments; }

}
