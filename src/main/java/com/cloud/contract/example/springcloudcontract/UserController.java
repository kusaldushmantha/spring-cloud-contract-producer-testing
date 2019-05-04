package com.cloud.contract.example.springcloudcontract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    private User fetchUserById(@PathVariable int id){
        return userService.findById(id);
    }

    @PostMapping("/users")
    private ResponseEntity createUser(@RequestBody User user){
        User savedUser = userService.createUser(user);
        return ResponseEntity
                .status(201)
                .body(new IdHolder(savedUser.getId()));
    }

}
