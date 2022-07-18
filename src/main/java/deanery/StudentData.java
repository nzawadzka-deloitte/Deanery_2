package deanery;

import deanery.student.FullTimeStudent;
import deanery.student.PartTimeStudent;
import deanery.student.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
    public static List<Student> createData(){
        Student fullTimeStudent1 = new FullTimeStudent("Natalia", "Zawadzka", 252706);
        Student fullTimeStudent2 = new FullTimeStudent("Marcelina", "Bielecka", 252707);
        Student fullTimeStudent3 = new FullTimeStudent("Filip", "Nowak", 252708);
        Student partTimeStudent1 = new PartTimeStudent("Agata", "Sitek", 252709);
        Student partTimeStudent2 = new PartTimeStudent("Paweł", "Sienkiewcz", 252710);
        Student partTimeStudent3 = new PartTimeStudent("Oliwier", "Jakis", 252711);

        List<Student> students = new ArrayList<>(List.of(fullTimeStudent1, fullTimeStudent2, fullTimeStudent3, partTimeStudent1,
        partTimeStudent2, partTimeStudent3));
        System.out.println(students);
        return students;
    }


}
