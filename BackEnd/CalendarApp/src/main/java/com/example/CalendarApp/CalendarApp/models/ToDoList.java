package com.example.CalendarApp.CalendarApp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Time;
import java.util.Date;

import javax.persistence.*;

@Entity(name = "toDoLists")
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "name")
    private String name;

    @Column (name = "date")
    private Date date;

    @Column (name = "time")
    private Time time;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties({"toDoList"})
    private User user;

    public ToDoList(String name, Date date, Time time, User user){
        this.name = name;
        this.date = date;
        this.time = time;
        this.user = user;
    }

    public ToDoList(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
