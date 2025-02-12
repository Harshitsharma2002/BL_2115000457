import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String vehicleNumber, type;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Rental Rate: $" + rentalRate);
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return rentalRate * 0.1;
    }

    public String getInsuranceDetails() {
        return "Insurance: 10% of rental cost";
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.2;
    }

    public double calculateInsurance() {
        return rentalRate * 0.15;
    }

    public String getInsuranceDetails() {
        return "Insurance: 15% of rental cost";
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("GJ01GA1234", 50));
        vehicles.add(new Bike("GJ01GB5678", 30));
        vehicles.add(new Truck("GJ01GC9876", 80));

        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("Rental Cost for 5 days: $" + vehicle.calculateRentalCost(5));
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println(insurable.getInsuranceDetails());
                System.out.println("Insurance Cost: $" + insurable.calculateInsurance());
            }
            System.out.println("---------------------------------");
        }
    }
}