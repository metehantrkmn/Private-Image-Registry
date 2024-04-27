package com.metehan.ImageService.Entity;

import jakarta.persistence.*;


import java.util.List;

@Entity
public class ImageRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private User owner;

    @OneToMany(mappedBy = "repository")
    private List<Image> images;

    // Constructors, getters, and setters
}