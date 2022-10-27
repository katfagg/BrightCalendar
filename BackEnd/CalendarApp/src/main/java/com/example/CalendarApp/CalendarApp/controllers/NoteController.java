package com.example.CalendarApp.CalendarApp.controllers;

import com.example.CalendarApp.CalendarApp.models.Note;
import com.example.CalendarApp.CalendarApp.models.User;
import com.example.CalendarApp.CalendarApp.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/notes")
public class NoteController {

    @Autowired
    NoteService noteService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Note> getNoteById(@PathVariable long id){
        Optional<Note> note = noteService.getNoteById(id);
        if (note.isPresent()){
            return  new ResponseEntity<>(note.get(),HttpStatus.OK);
        } else {
            return  new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping
    public ResponseEntity<Note> startNewNote (@RequestBody String name, @RequestParam long userId){
        Note savedNote = noteService.saveNote(name, userId);
        return new ResponseEntity<>(savedNote, HttpStatus.CREATED);
    }

    @PatchMapping (value = "/{id}/name")
    public ResponseEntity<Note> updateNotesName(@RequestBody String name, @PathVariable Long id) {
        Note updatedName = noteService.addName(name, id);
        return new ResponseEntity<>(updatedName, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Note> deleteNoteById(@PathVariable long id){
        noteService.deleteNoteById(id);
        return new ResponseEntity("Note removed successfully", HttpStatus.OK);
    }

}
