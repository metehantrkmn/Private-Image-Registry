package com.metehan.ImageService.Repository;

import com.metehan.ImageService.Entity.Image;
import org.springframework.data.repository.CrudRepository;

public interface ImageCrudRepository extends CrudRepository<Image,String> {
}
