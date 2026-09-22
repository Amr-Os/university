package academic;

public class Department {
    int DepartmentId;
    String DepartmentName;
    String HODName;
    static int TotalStaffs;
    static int TotalStudents;

    public Department(int departmentId, String departmentName, String hODName) {
        DepartmentId = departmentId;
        DepartmentName = departmentName;
        HODName = hODName;
    }

    public void DepartmentDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "DepartmentId: " + DepartmentId +
                "\nDepartmentName: " + DepartmentName +
                "\nHODName: " + HODName;
    }

    public void ShowEvents() {
    }

    public int getDepartmentId() {
        return DepartmentId;
    }

}
