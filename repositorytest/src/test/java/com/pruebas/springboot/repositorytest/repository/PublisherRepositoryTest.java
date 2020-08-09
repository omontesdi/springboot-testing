package com.pruebas.springboot.repositorytest.repository;

import com.pruebas.springboot.repositorytest.Application;
import com.pruebas.springboot.repositorytest.H2JpaConfig;
import com.pruebas.springboot.repositorytest.model.Author;
import com.pruebas.springboot.repositorytest.model.Publisher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {Application.class, H2JpaConfig.class})
class PublisherRepositoryTest {
    @Autowired
    private PublisherRepository repository;

    @Test
    public void getByIdTest() {
        Optional<Publisher> publisher = repository.findById(1l);
        assertTrue(publisher.isPresent());
    }
}