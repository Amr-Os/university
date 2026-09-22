import academic.Department;
import academic.PGStudent;
import academic.UGStudent;
import core.CollegeManagement;

public class Main {
    public static void main(String[] args) {
        CollegeManagement college = new CollegeManagement("Tech College", "Cairo", "0100000000");
        college.Open();
        college.addDepartment(1, "Computer Science", "Dr. Ahmed");
        college.addDepartment(2, "Engineering", "Dr. Sara");
        college.CollegeDetails();

        Department cs = new Department(1, "Computer Science", "Dr. Ahmed");
        cs.addEvent("AI Workshop");
        cs.ShowEvents();

        UGStudent ug = new UGStudent(1, "Ali", "Male", 2, 101);
        ug.StudentDetails();
        ug.PayFees();
        ug.IsPresent("2026-09-22");

        PGStudent pg = new PGStudent(2, "Mona", "Female", 1, 201);
        pg.StudentDetails();
        pg.PayFees(3000.0);
        pg.PayFees();
        pg.IsPresent("2026-09-22");
    }
}
