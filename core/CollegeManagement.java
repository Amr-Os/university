package core;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;

import academic.Department;

public class CollegeManagement {
    private String CollegeName;
    private String City;
    private String ContactNumber;
    ArrayList<Department> departmentsList= new ArrayList<Department>();

    public CollegeManagement(String collegeName, String city, String contactNumber) {
        CollegeName = collegeName;
        City = city;
        ContactNumber = contactNumber;
    }

    public void Open() {
        LocalDateTime now = LocalDateTime.now();
        DayOfWeek day = now.getDayOfWeek();
        int hour = now.getHour();
        boolean workingDay = day != DayOfWeek.FRIDAY && day != DayOfWeek.SATURDAY;
        boolean workingHour = hour >= 8 && hour < 16;
        if (workingDay && workingHour) {
            System.out.println(CollegeName + " is currently open.");
        } else {
            System.out.println(CollegeName + " is currently closed.");
        }
    }

    public void addDepartment(int depid, String depName, String hodName) {
        Department d = new Department(depid, depName, hodName);
        departmentsList.add(d);
    }

    public void CollegeDetails() {
        System.out.println(toString());
        showDepartments();
    }

    public void showDepartments() {
        for (Department department : departmentsList) {
            department.DepartmentDetails();
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "CollegeName: " + CollegeName +
                "\nCity: " + City +
                "\nContactNumber: " + ContactNumber;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String collegeName) {
        CollegeName = collegeName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

}
