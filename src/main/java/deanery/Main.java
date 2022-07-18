package deanery;

import deanery.exception.WrongHour;
import deanery.exception.WrongNumber;
import deanery.student.FullTimeStudent;
import deanery.student.PartTimeStudent;
import deanery.student.Student;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongNumber, WrongHour {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = StudentData.createData();

        for (int i = 0; i < students.size(); i++) {

        try {
            students.get(i).serve("D124", 19);
        } catch (WrongNumber | WrongHour e) {
            System.out.println("Exception " + e.getMessage());
        }




    }

        System.out.println("Enter type of student: 'part time' 'full time' :");
        String type = scanner.nextLine();
        System.out.println("Enter student name:");
        String name = scanner.next();
        System.out.println("Enter student last name:");
        String lastName = scanner.next();
        System.out.println("Enter student ID: ");
        Integer ID = scanner.nextInt();
        System.out.println("Enter room:");
        String room = scanner.next();
        System.out.println("Enter hour");
        Integer hour = scanner.nextInt();
        if(type.equals("full time")){
            FullTimeStudent s = new FullTimeStudent(name, lastName, ID);
            try {
                s.serve(room, hour);
            } catch (WrongNumber | WrongHour e) {
                System.out.println("Exception " + e.getMessage());
            }
        }
        else{
            PartTimeStudent s = new PartTimeStudent(name, lastName, ID);
            try {
                s.serve(room, hour);
            } catch (WrongNumber | WrongHour e) {
                System.out.println("Exception " + e.getMessage());
            }
        }



}}