package academic;

public class Student {
    private int StudentId;
    String StudentName;
    String Gender;
    int Year;
    int ClassId;
    private double FeesDue = 10000.0;
    private double FeesPaidAmount = 0.0;

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

    public void PayFees() {
        PayFees(FeesDue - FeesPaidAmount);
    }

    public void PayFees(double amount) {
        if (isFeesPaid()) {
            System.out.println(StudentName + " fees are already fully paid.");
            return;
        }
        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
            return;
        }
        FeesPaidAmount += amount;
        if (isFeesPaid()) {
            System.out.println(StudentName + " has paid the fees in full.");
        } else {
            System.out.println(StudentName + " paid " + amount + ". Remaining: " + (FeesDue - FeesPaidAmount) + ".");
        }
    }

    public void IsPresent(String date) {
        System.out.println(StudentName + " is present on " + date + ".");
    }

    public boolean isFeesPaid() {
        return FeesPaidAmount >= FeesDue;
    }

    public int getStudentId() {
        return StudentId;
    }

    public int getClassId() {
        return ClassId;
    }
}
