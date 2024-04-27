package com.metehan.ImageService.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String tag;

    private LocalDateTime creationTimestamp;

    @ManyToOne
    private ImageRepository repository;

    // Constructors, getters, and setters
}