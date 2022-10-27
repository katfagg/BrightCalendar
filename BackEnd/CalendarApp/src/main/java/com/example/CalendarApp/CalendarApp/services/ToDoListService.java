package com.example.CalendarApp.CalendarApp.services;

import com.example.CalendarApp.CalendarApp.models.*;
import com.example.CalendarApp.CalendarApp.repositories.ToDoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.Optional;

@Service
public class ToDoListService {

    @Autowired
    UserService userService;

    @Autowired
    ToDoListRepository toDoListRepository;

    public Optional<ToDoList> getToDoListById(Long id){
        return toDoListRepository.findById(id);
    }

    public ToDoList saveToDoList(String name, Date date, Time time, long userId){
        User user = userService.getUserById(userId).get();
        ToDoList newToDoList = new ToDoList(name, date, time, user);
        toDoListRepository.save(newToDoList);
        return newToDoList;
    }

    public Optional<ToDoList> deleteToDoListById(Long id){
        return toDoListRepository.findById(id);
    }


}
