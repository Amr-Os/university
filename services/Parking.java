package services;

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
        System.out.println("vehicle number: " + vehiclenumber);
        System.out.println("owner name: " + vehicleownername);
        System.out.println("slot id: " + slotid);
        System.out.println("vehicle parked");
    }
}