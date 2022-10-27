package com.example.mainactivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashSet;

public class NoteEditorActivity extends AppCompatActivity {

    int noteId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);

        EditText editText = (EditText)  findViewById(R.id.editText);

        Intent intent = getIntent();
         noteId = intent.getIntExtra("noteId", 1);
         NoteActivity.arrayAdapter.notifyDataSetChanged();

        if (noteId != 1) {

            editText.setText(NoteActivity.notes.get(noteId)); // checks for valid note ID
        } else {
            NoteActivity.notes.add("");
            noteId = NoteActivity.notes.size() -1; // if the note we added was the 3rd item it would have an id of 2, the size of note arraylist would be 3, minus 1 is 2
        }

//        created an edit text and we getting the note ID value from the intent (forming an action on the screen / start activity), if its not -1 then we get the value from the notes text and displaying it in the edit text.


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                NoteActivity.notes.set(noteId, String.valueOf(charSequence));
                NoteActivity.arrayAdapter.notifyDataSetChanged(); //saving the content of the item

                SharedPreferences sharedPreferences = getApplication().getSharedPreferences("com.notes", Context.MODE_PRIVATE);

                HashSet<String> set = new HashSet(NoteActivity.notes);

                sharedPreferences.edit().putStringSet("notes", set).apply();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
//            When we run the app we should be able to edit the note and changes will automatically saved in the notes field and displayed on the list view.
        });

    }
}