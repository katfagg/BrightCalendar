package com.example.CalendarApp.CalendarApp.controllers;

import com.example.CalendarApp.CalendarApp.models.Note;
import com.example.CalendarApp.CalendarApp.models.ToDoList;
import com.example.CalendarApp.CalendarApp.services.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/toDoLists")
public class ToDoListController {

    @Autowired
    ToDoListService toDoListService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ToDoList> getToDoListById(@PathVariable long id){
        Optional<ToDoList> toDoList = toDoListService.getToDoListById(id);
        if (toDoList.isPresent()){
            return  new ResponseEntity<>(toDoList.get(),HttpStatus.OK);
        } else {
            return  new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping
    public ResponseEntity<ToDoList> startNewToDoList (@RequestBody String name, @RequestBody Date date, @RequestBody Time time, @RequestParam long userId){
        ToDoList savedToDoList = toDoListService.saveToDoList(name, date, time, userId);
        return new ResponseEntity<>(savedToDoList, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Note> deleteToDoListById(@PathVariable long id){
        toDoListService.deleteToDoListById(id);
        return new ResponseEntity("Task removed successfully", HttpStatus.OK);
    }

}
