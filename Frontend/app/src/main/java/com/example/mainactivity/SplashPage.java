package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashPage extends AppCompatActivity implements View.OnClickListener{

    private Button calendarSplash;
    private Button toDoSplash;
    private Button notesSplash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_page);

        calendarSplash = (Button) findViewById(R.id.calendarSplash);
        calendarSplash.setOnClickListener(this);

        notesSplash = (Button) findViewById(R.id.notesSplash);
        notesSplash.setOnClickListener(this);

        toDoSplash = (Button) findViewById(R.id.toDoSplash);
        toDoSplash.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.calendarSplash:
                startActivity(new Intent(this, CalMonthActivity.class));
                break;

            case R.id.notesSplash:
                startActivity(new Intent(this, NoteActivity.class));
                break;

            case R.id.toDoSplash:
                startActivity(new Intent(this, MainActivityKot.class));
        }
    }
}
