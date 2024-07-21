package com.metehan.ImageService.Repository;

import com.metehan.ImageService.Entity.ImageMetaData;
import com.metehan.ImageService.Entity.ImageRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageCrudRepository extends CrudRepository<ImageMetaData,Long> {

    Optional<ImageMetaData> findImageMetaDataByTag(String tag);
    Boolean existsByTag(String name);

}
