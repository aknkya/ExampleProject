package com.exampleProject.demo.Service;

import com.exampleProject.demo.Entity.UserEntity;
import com.exampleProject.demo.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

   public List<UserEntity> findAll(){
       return (List<UserEntity>) userRepository.findAll();
   }

  public Optional<UserEntity> findById(int x){
       return userRepository.findById(x);
  }

  public UserEntity save(UserEntity userEntity){
        return userRepository.save(userEntity);
  }

  public void delete(int id){
        userRepository.deleteById(id);
  }

}
