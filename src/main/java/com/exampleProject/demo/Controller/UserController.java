package com.exampleProject.demo.Controller;

import com.exampleProject.demo.Entity.UserEntity;
import com.exampleProject.demo.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@Controller
@RequestMapping("welcome")
public class UserController {
private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @PostMapping
    public ResponseEntity<UserEntity> Save(@Valid @RequestBody UserEntity userEntity) throws URISyntaxException{
        UserEntity p = userService.save(userEntity);
        return ResponseEntity.created(new URI("welcome" + p.getId())).body(p);

}


}
