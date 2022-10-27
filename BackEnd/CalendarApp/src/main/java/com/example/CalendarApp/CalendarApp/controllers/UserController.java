package com.example.CalendarApp.CalendarApp.controllers;

import com.example.CalendarApp.CalendarApp.models.User;
import com.example.CalendarApp.CalendarApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserService userService;

    //Might need to change this from id to email
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        Optional<User> user = userService.getUserById(id);
        if (user.isPresent()){
            return new ResponseEntity<>(user.get(),HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<User> addNewUser(@RequestBody String name, @RequestParam String email, @RequestBody String password){
        User savedUser = userService.saveUser(name, email,password);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);

    }

    @PatchMapping (value = "/{id}/password")
    public ResponseEntity<User> updatePassword(@RequestBody String password, @PathVariable Long id) {
        User updatedPassword = userService.updatePassword(password, id);
        return new ResponseEntity<>(updatedPassword, HttpStatus.OK);
    }

}

