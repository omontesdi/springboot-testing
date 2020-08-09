package com.pruebas.springboot.repositorytest.repository;

import com.pruebas.springboot.repositorytest.Application;
import com.pruebas.springboot.repositorytest.H2JpaConfig;
import com.pruebas.springboot.repositorytest.model.Author;
import com.pruebas.springboot.repositorytest.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {Application.class, H2JpaConfig.class})
class BookRepositoryTest {

    @Autowired
    private BookRepository repository;

    @Test
    public void findByIdTest() {
        Optional<Book> book = repository.findById(1l);
        assertTrue(book.isPresent());
    }

    @Test
    public void findBooksByAuthorTest() {
        List<Book> books = repository.findBooksByAuthor("Stephen");
        assertTrue(books.size()>0);
    }
}