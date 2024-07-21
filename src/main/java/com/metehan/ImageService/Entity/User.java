package com.metehan.ImageService.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "\"USER\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @OneToMany(mappedBy = "creator")
    private List<ImageRepository> repositories;

    @ManyToMany(mappedBy = "collaborators")
    private List<ImageRepository> collaboratingRepositories;

    // Constructors, getters, and setters
}
