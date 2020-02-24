package com.exampleProject.demo.Controller;

import com.exampleProject.demo.Entity.UserEntity;
import com.exampleProject.demo.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("welcome")
public class UserController {
private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @RequestMapping("/register")
    @PostMapping
    public ResponseEntity<UserEntity> Save(@Valid @RequestBody UserEntity userEntity) throws URISyntaxException{
        UserEntity p = userService.save(userEntity);
        return ResponseEntity.created(new URI("welcome" + p.getId())).body(p);

}

    @GetMapping({"id"})
    public ResponseEntity<UserEntity> findById(@PathVariable int id){
        Optional<UserEntity> userEntity=userService.findById(id);
        return userEntity.map(response->ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
   }

   @GetMapping
    public ResponseEntity<List<UserEntity>> findall(){
       return ResponseEntity.ok(userService.findAll());
    }
   @DeleteMapping
    public void deleteById(int id){
        userService.deletebyId(id);
   }
}
