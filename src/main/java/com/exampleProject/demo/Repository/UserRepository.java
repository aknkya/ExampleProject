package com.exampleProject.demo.Repository;

import com.exampleProject.demo.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
