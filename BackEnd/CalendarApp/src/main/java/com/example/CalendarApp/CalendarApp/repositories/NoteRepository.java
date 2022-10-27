package com.example.CalendarApp.CalendarApp.repositories;

import com.example.CalendarApp.CalendarApp.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository <Note, Long> {
}

