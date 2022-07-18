package deanery.student;

public class PartTimeStudent extends Student{
    public PartTimeStudent(String name, String lastName, int studentID) {
        super(name, lastName, studentID);
    }
    final String type = "part time";

    public String getType() {
        return type;
    }

}
