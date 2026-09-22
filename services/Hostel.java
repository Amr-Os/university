package services;

public class Hostel {

    int studentid;
    int blocknumber;
    int roomnumber;

    public Hostel(int sid, int block, int room) {
        studentid = sid;
        blocknumber = block;
        roomnumber = room;
    }

    public void HostelDetails() {
        System.out.println("studentId: " + studentid);
        System.out.println("blockNumber: " + blocknumber);
        System.out.println("roomNumber: " + roomnumber);
    }

    public void CheckIn() {
        System.out.println("student " + studentid + " checked in");
    }

    public void CheckOut() {
        System.out.println("student " + studentid + " checked out");
    }
}