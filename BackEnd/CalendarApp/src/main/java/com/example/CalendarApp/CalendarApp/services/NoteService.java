package com.example.CalendarApp.CalendarApp.services;

import com.example.CalendarApp.CalendarApp.models.*;
import com.example.CalendarApp.CalendarApp.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NoteService {

    @Autowired
    UserService userService;

    @Autowired
    NoteRepository noteRepository;

    public Optional<Note> getNoteById(Long id){
        return noteRepository.findById(id);
    }

    public Note saveNote(String name, long userId){
        User user = userService.getUserById(userId).get();
        Note newNote = new Note(name, user);
        noteRepository.save(newNote);
        return newNote;
    }

    public Note addName(String name, Long id) {
        Note note = noteRepository.findById(id).get();
        note.getName().addAll(name);
        noteRepository.save(note);
        return note;

    }
    public Optional<Note> deleteNoteById(Long id){
        return noteRepository.findById(id);
    }

}
