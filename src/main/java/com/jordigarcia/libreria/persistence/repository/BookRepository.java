package com.jordigarcia.libreria.persistence.repository;

import com.jordigarcia.libreria.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
