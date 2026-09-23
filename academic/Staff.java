package academic;

public class Staff {
    protected String StaffId;
    protected String StaffName;
    protected String DepartmentId;
    protected double Salary;

    public Staff(String staffId, String staffName, String departmentId, double salary) {
        this.StaffId = staffId;
        this.StaffName = staffName;
        this.DepartmentId = departmentId;
        this.Salary = salary;
    }

    public void StaffDetails() {
        System.out.println("Staff ID: " + StaffId);
        System.out.println("Name: " + StaffName);
        System.out.println("Department ID: " + DepartmentId);
        System.out.println("Salary: $" + Salary);
        System.out.println("-------------------------");
    }

    public String getStaffId() {
        return StaffId;
    }

    public String getStaffName() {
        return StaffName;
    }
}