package academic;

import java.util.ArrayList;
import java.util.List;

public class Auditorium {
    private String AuditoriumName;
    private List<String> EventsList;
    private String Date;
    private String Time;
    private int TotalSeats;
    private String DepartmentId;

    public Auditorium(String auditoriumName, String date, String time, int totalSeats, String departmentId) {
        this.AuditoriumName = auditoriumName;
        this.Date = date;
        this.Time = time;
        this.TotalSeats = totalSeats;
        this.DepartmentId = departmentId;
        this.EventsList = new ArrayList<>();ذذ
    }

    public void BookEvents(String eventName) {
        EventsList.add(eventName);
        System.out.println("Event '" + eventName + "' booked in " + AuditoriumName);
        System.out.println("Date: " + Date + " | Time: " + Time);
    }

    public void showAllEvents() {
        System.out.println("Events in " + AuditoriumName + ": " + EventsList);
    }
}