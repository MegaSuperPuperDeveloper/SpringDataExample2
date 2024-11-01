package com.example.springdataexample2.models;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.persistence.Id;

@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(name = "publication_year")
    private Integer publicationYear;
}