
class Vehicle {
    protected String model;
    protected int year;
    protected String fuelType;

    public Vehicle(String model, int year, String fuelType) {
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public void start() {
        System.out.println(model + " is starting.");
    }

    public void stop() {
        System.out.println(model + " is stopping.");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String model, int year, String fuelType, int numberOfDoors) {
        super(model, year, fuelType);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println(model + " (Car) is starting.");
    }

    public void openDoors() {
        System.out.println(numberOfDoors + " doors opening.");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String model, int year, String fuelType, boolean hasSidecar) {
        super(model, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void start() {
        System.out.println(model + " (Motorcycle) is starting.");
    }

    public void displaySidecarStatus() {
        if (hasSidecar) {
            System.out.println("This motorcycle has a sidecar.");
        } else {
            System.out.println("This motorcycle does not have a sidecar.");
        }
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        Car car = new Car("Toyota Camry", 2020, "Gasoline", 4);
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", 2018, "Gasoline", true);

        car.start();
        car.openDoors();
        car.stop();

        motorcycle.start();
        motorcycle.displaySidecarStatus();
        motorcycle.stop();
    }
}
