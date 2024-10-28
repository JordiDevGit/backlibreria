package com.jordigarcia.libreria.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String title;
    private float price;
}
