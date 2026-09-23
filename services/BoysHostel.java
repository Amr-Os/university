package services;

import academic.Student;

public class BoysHostel extends Hostel {

    public BoysHostel(int sid, int block, int room) {
        super(sid, block, room);
    }

    public BoysHostel(Student student, int block, int room) {
        super(student, block, room);
    }
}