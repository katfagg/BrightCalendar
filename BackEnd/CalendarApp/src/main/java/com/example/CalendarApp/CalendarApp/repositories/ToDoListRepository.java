package com.example.CalendarApp.CalendarApp.repositories;

import com.example.CalendarApp.CalendarApp.models.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoListRepository extends JpaRepository <ToDoList, Long> {
}

