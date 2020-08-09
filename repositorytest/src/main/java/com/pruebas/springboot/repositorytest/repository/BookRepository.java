package com.pruebas.springboot.repositorytest.repository;

import com.pruebas.springboot.repositorytest.model.Author;
import com.pruebas.springboot.repositorytest.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b FROM Book b WHERE b.author.name = :authorName")
    public List<Book> findBooksByAuthor(@Param("authorName") String authorName);
}
