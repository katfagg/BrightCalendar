package com.example.mainactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalTime;

public class EventEditActivity extends AppCompatActivity
{
    private EditText eventNameET, eventHourET, eventMinET;
    private TextView eventDateTV, eventTimeTV;

    private LocalTime time;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_edit_layout);
        initWidgets();
        time = LocalTime.now();
        eventDateTV.setText("Date: " + CalendarUtils.formattedDate(CalendarUtils.selectedDate));
        eventTimeTV.setText("Time: ");
        eventHourET.setText(Integer.toString(time.getHour()));
        eventMinET.setText(Integer.toString(time.getMinute()));
    }

    private void initWidgets()
    {
        eventNameET = findViewById(R.id.eventNameET);
        eventDateTV = findViewById(R.id.eventDateTV);
        eventTimeTV = findViewById(R.id.eventTimeTV);
        eventHourET = findViewById(R.id.eventHourET);
        eventMinET = findViewById(R.id.eventMinET);
    }

    public void saveEventAction(View view)
    {
        String eventName = eventNameET.getText().toString();
        time = LocalTime.of(Integer.parseInt(eventHourET.getText().toString()), Integer.parseInt(eventMinET.getText().toString()));
        Event newEvent = new Event(eventName, CalendarUtils.selectedDate, time);
        Event.eventsList.add(newEvent);
        finish();
    }
}
