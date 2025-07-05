package com.example.demo.jpa;

import com.example.demo.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
public class BookJpaManager {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void saveBook(String title) {
        Book book = new Book(title);
        entityManager.persist(book);
    }
}
