package academic;

public class Department {
    private int DepartmentId;
    private String DepartmentName;
    private String HODName;
    public static int TotalStaffs;
    public static int TotalStudents;

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

    public void setDepartmentId(int departmentId) {
        DepartmentId = departmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getHODName() {
        return HODName;
    }

    public void setHODName(String hODName) {
        HODName = hODName;
    }

    public static int getTotalStaffs() {
        return TotalStaffs;
    }

    public static void setTotalStaffs(int totalStaffs) {
        TotalStaffs = totalStaffs;
    }

    public static int getTotalStudents() {
        return TotalStudents;
    }

    public static void setTotalStudents(int totalStudents) {
        TotalStudents = totalStudents;
    }

}
