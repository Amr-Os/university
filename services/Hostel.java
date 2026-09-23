package services;

import academic.Student;

public class Hostel {

    int studentid;
    int blocknumber;
    int roomnumber;

    public Hostel(int sid, int block, int room) {
        studentid = sid;
        blocknumber = block;
        roomnumber = room;
    }

    public Hostel(Student student, int block, int room) {
        studentid = student.getStudentId();
        blocknumber = block;
        roomnumber = room;
    }

    public void HostelDetails() {
        System.out.println("StudentId: " + studentid);
        System.out.println("BlockNumber: " + blocknumber);
        System.out.println("RoomNumber: " + roomnumber);
    }

    public void CheckIn() {
        System.out.println("Student " + studentid + " checked in");
    }

    public void CheckOut() {
        System.out.println("Student " + studentid + " checked out");
    }
}