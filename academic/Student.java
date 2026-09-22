package academic;

public class Student {
    private int StudentId;
    String StudentName;
    String Gender;
    int Year;
    int ClassId;

    public void StudentDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "StudentId: " + StudentId +
                "\nStudentName: " + StudentName +
                "\nGender: " + Gender +
                "\nYear: " + Year +
                "\nClassId: " + ClassId;
    }

    public int getStudentId() {
        return StudentId;
    }

    public int getClassId() {
        return ClassId;
    }
}
