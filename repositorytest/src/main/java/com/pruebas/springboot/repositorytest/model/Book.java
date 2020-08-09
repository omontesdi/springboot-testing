package com.pruebas.springboot.repositorytest.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private Integer year;
    @ManyToOne
    @JoinColumn(name = "AUTHOR_ID", nullable = false)
    private Author author;
    @ManyToOne
    @JoinColumn(name = "PUBLISHER_ID", nullable = false)
    private Publisher publisher;
}
