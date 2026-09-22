package academic;

public class Student {
    private int StudentId;
    String StudentName;
    String Gender;
    int Year;
    int ClassId;

    public Student(int studentId, String studentName, String gender, int year, int classId) {
        StudentId = studentId;
        StudentName = studentName;
        Gender = gender;
        Year = year;
        ClassId = classId;
    }

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
