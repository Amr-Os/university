package services;

import academic.Student;

public class GirlsHostel extends Hostel {

    public GirlsHostel(int sid, int block, int room) {
        super(sid, block, room);
    }

    public GirlsHostel(Student student, int block, int room) {
        super(student, block, room);
    }
}