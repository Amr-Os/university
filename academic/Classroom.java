package academic;

public class Classroom {
    private String ClassId;
    private String Section;
    private String DepartmentId;
    private boolean isOccupiedStatus;

    public Classroom(String classId, String section, String departmentId) {
        this.ClassId = classId;
        this.Section = section;
        this.DepartmentId = departmentId;
        this.isOccupiedStatus = false;
    }

    public void ClassroomDetails() {
        System.out.println("Class ID: " + ClassId + " | Section: " + Section + " | Dept ID: " + DepartmentId);
    }

    public boolean IsOccupied() {
        return isOccupiedStatus;
    }

    public void setOccupied(boolean status) {
        this.isOccupiedStatus = status;
    }

    public String getClassId() {
        return ClassId;
    }
}