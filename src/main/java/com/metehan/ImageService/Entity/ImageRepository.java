package com.metehan.ImageService.Entity;

import jakarta.persistence.*;
import lombok.NonNull;


import java.util.List;

@Entity
public class ImageRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;
    private String explanation;
    @ManyToOne
    @JoinColumn(name = "creatorID")
    private User creator;

    @ManyToMany
    @JoinTable(
            name = "repos_collaborators",
            joinColumns = @JoinColumn(name = "collaboratingRepositories"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    private List<User> collaborators;
    @OneToMany(mappedBy = "repository")
    private List<ImageMetaData> images;

    // Constructors, getters, and setters
}