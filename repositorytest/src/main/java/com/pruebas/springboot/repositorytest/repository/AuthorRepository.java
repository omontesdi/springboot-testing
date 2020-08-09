package com.pruebas.springboot.repositorytest.repository;

import com.pruebas.springboot.repositorytest.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
