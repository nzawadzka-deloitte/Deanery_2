package deanery.student;

public class FullTimeStudent extends Student{
    public FullTimeStudent(String name, String lastName, int studentID) {
        super(name, lastName, studentID);
    }
    final String type = "full time";

    public String getType() {
        return type;
    }
}
