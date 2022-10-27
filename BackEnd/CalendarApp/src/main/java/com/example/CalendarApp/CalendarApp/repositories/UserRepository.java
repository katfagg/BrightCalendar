package com.example.CalendarApp.CalendarApp.repositories;

import com.example.CalendarApp.CalendarApp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}