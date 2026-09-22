package core;

public class CollegeManagement {
    String CollegeName;
    String City;
    String ContactNumber;

    public CollegeManagement(String collegeName, String city, String contactNumber) {
        CollegeName = collegeName;
        City = city;
        ContactNumber = contactNumber;
    }

    public void Open() {

    }

    public void CollegeDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CollegeName: " + CollegeName +
                "\nCity: " + City +
                "\nContactNumber: " + ContactNumber;
    }

}
