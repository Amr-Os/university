import academic.Department;
import academic.PGStudent;
import academic.UGStudent;
import academic.Staff;
import core.CollegeManagement;
import services.Bus;
import services.Canteen;
import services.Hostel;
import services.BoysHostel;
import services.GirlsHostel;
import services.Parking;

public class Main {
    public static void main(String[] args) {

        CollegeManagement college = new CollegeManagement("Tech College", "Cairo", "0100000000");
        college.Open();
        college.addDepartment(1, "Computer Science", "Dr. Ahmed");
        college.addDepartment(2, "Engineering", "Dr. Sara");
        college.CollegeDetails();

        Department cs = new Department(1, "Computer Science", "Dr. Ahmed");
        cs.addEvent("AI Workshop");
        cs.ShowEvents();

        UGStudent ug = new UGStudent(1, "Ali", "Male", 2, 101);
        ug.StudentDetails();
        ug.PayFees();
        ug.IsPresent("2026-09-22");

        PGStudent pg = new PGStudent(2, "Mona", "Female", 1, 201);
        pg.StudentDetails();
        pg.PayFees(3000.0);
        pg.PayFees();
        pg.IsPresent("2026-09-22");

        Staff staff = new Staff("S1", "Ahmed", "1", 5000);
        staff.StaffDetails();

        Canteen canteen = new Canteen(1);
        canteen.additem("Coffee");
        canteen.additem("Sandwich");
        canteen.ShowItems();
        canteen.Buy(ug, "Coffee");

        Bus bus = new Bus(1, "BUS-01", "Mohammed", "Sanaa", 30);
        bus.BusDetails();
        bus.UseBus(ug);
        bus.SeatsAvailability();

        Hostel hostel = new Hostel(ug, 2, 10);
        hostel.HostelDetails();
        hostel.CheckIn();
        hostel.CheckOut();

        BoysHostel boys = new BoysHostel(ug, 1, 5);
        boys.HostelDetails();

        GirlsHostel girls = new GirlsHostel(pg, 2, 8);
        girls.HostelDetails();

        Parking studentparking = new Parking(1, "12345", "Ali");
        studentparking.ParkVehicle(ug);

        Parking staffparking = new Parking(2, "67890", "Ahmed");
        staffparking.ParkVehicle(staff);
    }
}