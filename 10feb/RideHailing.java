import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String vehicleId, driverName;
    protected double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per KM: $" + ratePerKm);
    }

    abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Station";
    }

    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return ratePerKm * distance * 0.9;
    }
}

class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return ratePerKm * distance * 1.1;
    }
}

public class RideHailing {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        Car c1 = new Car("CAR101", "Gaurav Patel", 15);
        Bike b1 = new Bike("BIKE202", "Rahul Mehta", 10);
        Auto a1 = new Auto("AUTO303", "Amit Sharma", 12);

        rides.add(c1);
        rides.add(b1);
        rides.add(a1);

        for (Vehicle ride : rides) {
            ride.getVehicleDetails();
            System.out.println("Fare for 10 km: $" + ride.calculateFare(10));
            if (ride instanceof GPS) {
                System.out.println("Current Location: " + ((GPS) ride).getCurrentLocation());
            }
            System.out.println("---------------------------------");
        }
    }
}