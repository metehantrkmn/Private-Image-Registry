package com.metehan.ImageService.Repository;

import com.metehan.ImageService.Entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findUserByUsername(String username);

}
