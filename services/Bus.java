package services;

import academic.Student;

public class Bus {

    int busid;
    String busnumber;
    String drivername;
    String destination;
    int totalseats;

    public Bus(int id, String number, String driver, String dest, int seats) {
        busid = id;
        busnumber = number;
        drivername = driver;
        destination = dest;
        totalseats = seats;
    }

    public void BusDetails() {
        System.out.println("BusId: " + busid);
        System.out.println("BusNumber: " + busnumber);
        System.out.println("DriverName: " + drivername);
        System.out.println("Destination: " + destination);
        System.out.println("TotalSeats: " + totalseats);
    }

    public void SeatsAvailability() {
        System.out.println("Available seats: " + totalseats);
    }

    public void UseBus(Student student) {
        if (totalseats > 0) {
            totalseats--;
            System.out.println("Student " + student.getStudentId() + " entered the bus");
        } else {
            System.out.println("No seats available");
        }
    }
}