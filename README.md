# Bright Calender

This project is designed to help you plan your day to day schedule through mapping out goals and prioritise tasks efficiently.

## Table of Contents

- Project overview
- Set Up instructions
- Project Structure - Wireframes (UML, ERD)
- POJOs
- CRUD Functions/commands
- Further Implementations and Extensions

## Project Overview

Bugdroid Baddies have been tasked to build an accesible, user friendly app aimed for those looking for a way to keep organised. This was created using Android Studio and Spring to come up with the finest calendar app for the go.

Features include:

- Individual log in for user
- Password authentication
- Calendar
- To do list
- Notes page


## Set Up Instructions

1. First ensure that Android Studio is installed.
2. Then, clone this repository by clicking the green 'code' sign on top of this page. Click the SSH key and type in your terminal the following: git clone [git@github.com:katfagg/BrightCalendar.git]("git@github.com:katfagg/BrightCalendar.git").
3. Open the file.
4. Create a Firebase authentication and real-time database using the Firebase console.
5. Then, use the Android Studio Firebase tools to connect to Firebase and install the relevant SDK's.
6. Press the green run button that resembles a triangle at the top of the file.
7. An emulator will appear on the right hand side of the page.
8. You can now log in or register to the Calendar app.


## Project Structure - Wireframes (UML, ERD)

![alt text](https://github.com/katfagg/BrightCalendar/blob/main/Screenshot%202022-10-20%20at%2010.11.37.png)
![alt text](https://github.com/katfagg/BrightCalendar/blob/main/Screenshot%202022-10-20%20at%2012.27.27.png)


## POJOs

We have also used POJO's (Plain Old Java Objects) within our project. Here they are listed below.

- User - ID, name, email, password
- ToDoList - ID, name, detail, date, time
- Notes - ID, name


## CRUD functions / Commands

We have applied CRUD functionality to each class. Here are some listed below:

localhost:8080/...


| HTTP Request Paths | Request Type | Description |
|:---:|:---:|:---:|
| .../users/{id} | GET | Gets the user by ID |
| .../users | POST | Creates the user |
| .../users/{id}/password| PATCH | Updates the users password by ID |
| .../toDoLists/{id} | GET | Gets the to do list by ID |
| .../toDoLists | POST | Creates the to do list |
| .../toDoLists/{id} | DELETE | Deletes the to do list by ID |
| .../notes/{id} | GET | Gets the notes by ID |
| .../notes | POST | Posts a note |
| .../notes/{id}/name | PATCH | Patches a note by ID and name  |
| .../notes/{id} | DELETE | Deletes the note by ID |



## Further Implementations and Extensions

For the extensions our team had come up with a number a great ideas to implement within our project, some of these include:

- Providing the user a Google sign in option instead of registering.
- Pushing notifications for events on the Calendar.
- Adding and customising to a users desired color scheme.
- Create groups of users to use a shared page.

In the future we would like to host the app on Android Playstore for users to really use.
