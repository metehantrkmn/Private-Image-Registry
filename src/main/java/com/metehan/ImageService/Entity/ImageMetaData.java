package com.metehan.ImageService.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
public class ImageMetaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;

    private String tag;

    private LocalDateTime creationTimestamp;

    @ManyToOne
    @JoinColumn(name = "repositoryID")
    private ImageRepository repository;

    // Constructors, getters, and setters
}