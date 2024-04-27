package com.metehan.ImageService.Entity;

import com.metehan.ImageService.Entity.Image;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    @OneToMany(mappedBy = "owner")
    private List<Image> images;

    // Constructors, getters, and setters
}
