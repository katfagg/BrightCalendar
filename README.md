# Bright Calender

This project is designed to help you plan your day to day schedule through mapping out goals and prioritise tasks efficiently.

## Table of Contents

- [Project overview](#project-overview)
- [Set Up instructions](#set-up-instructions)
- [Project Structure - Wireframes (UML, ERD)](#Project-Structure--Wireframes-(UML,ERD))
- [POJOs](POJOs)
- [CRUD Functions/commands](CRUD-Functions--commands)
- [Further Implementations and Extensions](Further-Implementations-and-Extensions)

## Project Overview

Bugdroid Baddies have been tasked to build an accesible, user friendly app aimed for those looking for a way to keep organised. This was created using Android Studio and Spring to come up with the finest calendar app for the go.

Features include:


## Set Up Instructions

1. Download app
2. Register details / log in
3. Use calendar as prefered, add events etc.
4. Use notes page to add extra notes


## Project Structure - Wireframes (UML, ERD)

![alt text](https://github.com/katfagg/BrightCalendar/blob/main/Screenshot%202022-10-20%20at%2010.11.37.png)
![alt text](https://github.com/katfagg/BrightCalendar/blob/main/Screenshot%202022-10-20%20at%2012.27.27.png)


## POJOs

We have also used POJO's (Plain Old Java Objects) within our project. Here are some listed below.

- User - ID, name, email, password
- ToDoList - ID, name, date, time
- Notes - ID, name


## CRUD functions / Commands

We have applied CRUD functionality to each class. Here are some listed below:

localhost:8080/...


| HTTP Request Paths | Request Type | Description |
|:---:|:---:|:---:|
| .../ | GET | Gets the user by ID |
| .../ | POST | Creates the user |
| .../| PATCH | Updates the users password by ID |
| .../ | GET | Gets the to do list by ID |
| .../ | POST | Creates the to do list |
| .../ | DELETE | Deletes the to do list by ID |
| .../ | GET | Gets the notes by ID |
| .../ | POST | Posts a note |
| .../ | PATCH | Patchs a note by ID and name  |
| .../ | DELETE | Deletes the note by ID |







## Further Implementations and Extensions

For the extensions our team had come up with a number a great ideas to implement within our project, some of these include:

- Providing the user a Google sign in option instead of registering.
- Calendar....
- Adding and customising to a users desired color scheme
- Create groups of users to use a shared page
