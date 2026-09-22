package services;

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
            System.out.println("available seats: " + totalseats);
        }
    }

