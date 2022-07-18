package deanery.student;

import deanery.Visit;
import deanery.exception.WrongHour;
import deanery.exception.WrongNumber;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Student {
    private String name;
    private String lastName;
    private int studentID;
    private String type;


    public Student(String name, String lastName, int studentID) {
        this.name = name;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


    public String getType() {
        return type;
    }

    public void serve(String room, Integer hour) throws WrongNumber, WrongHour {
        Visit.visitation(this, room, hour);
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println("------------------------------");
        System.out.format("%22s", "STUDENT " + studentID+"\n");
        System.out.format("First Name    |" );
        System.out.println(name);
        System.out.format("Second Name   |");
        System.out.println(lastName);
        System.out.println("Raport generated on " + dtf.format(now));
        System.out.println("Room number " + room);
        System.out.println("------------------------------");
    }
}
