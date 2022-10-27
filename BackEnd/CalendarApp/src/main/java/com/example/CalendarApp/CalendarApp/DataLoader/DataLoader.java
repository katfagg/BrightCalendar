package com.example.CalendarApp.CalendarApp.DataLoader;

import com.example.CalendarApp.CalendarApp.models.Note;
import com.example.CalendarApp.CalendarApp.models.User;
import com.example.CalendarApp.CalendarApp.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    NoteRepository noteRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Note note1 = new Note("Example note... ", new User());

        noteRepository.saveAll(Arrays.asList(note1));
    }
}

