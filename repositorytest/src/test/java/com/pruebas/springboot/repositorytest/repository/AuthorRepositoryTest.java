package com.pruebas.springboot.repositorytest.repository;

import com.pruebas.springboot.repositorytest.Application;
import com.pruebas.springboot.repositorytest.H2JpaConfig;
import com.pruebas.springboot.repositorytest.model.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {Application.class, H2JpaConfig.class})
class AuthorRepositoryTest {
    @Autowired
    private AuthorRepository repository;

    @Test
    public void getByIdTest() {
        Optional<Author> author = repository.findById(1l);
        assertTrue(author.isPresent());
    }

    @Test
    public void findAllByIdTest(){
        List<Author> authors = repository.findAllById(Arrays.asList(1l, 2l));
        assertTrue(authors.size()>0);
    }

}