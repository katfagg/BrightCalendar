package com.example.CalendarApp.CalendarApp.services;

import com.example.CalendarApp.CalendarApp.repositories.UserRepository;
import com.example.CalendarApp.CalendarApp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    public User saveUser(String userName, String userEmail, String userPassword){
        User newUser = new User(userName, userEmail, userPassword);
        userRepository.save(newUser);
        return newUser;
    }
    public User addPassword(String password, Long id) {
        User user = userRepository.findById(id).get();
        user.getPassword().addAll(password);
        userRepository.save(user);
        return user;

    }
}
