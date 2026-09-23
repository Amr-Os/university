package services;

import academic.Student;
import academic.Staff;

public class Parking {

    int slotid;
    String vehiclenumber;
    String vehicleownername;

    public Parking(int id, String number, String owner) {
        slotid = id;
        vehiclenumber = number;
        vehicleownername = owner;
    }

    public void ParkVehicle() {
        System.out.println("Vehicle Number: " + vehiclenumber);
        System.out.println("Owner Name: " + vehicleownername);
        System.out.println("Slot Id: " + slotid);
        System.out.println("Vehicle parked");
    }

    public void ParkVehicle(Student student) {
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Vehicle Number: " + vehiclenumber);
        System.out.println("Slot Id: " + slotid);
        System.out.println("Vehicle parked");
    }

    public void ParkVehicle(Staff staff) {
        System.out.println("Staff ID: " + staff.getStaffId());
        System.out.println("Owner Name: " + staff.getStaffName());
        System.out.println("Vehicle Number: " + vehiclenumber);
        System.out.println("Slot Id: " + slotid);
        System.out.println("Vehicle parked");
    }
}