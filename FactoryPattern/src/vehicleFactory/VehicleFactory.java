package vehicleFactory;

import vehicle.Bike;
import vehicle.Car;
import vehicle.Truck;
import vehicle.Vehicle;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        return switch (vehicleType) {
            case "CAR" -> new Car();
            case "BIKE" -> new Bike();
            case "TRUCK" -> new Truck();
            default -> throw new IllegalArgumentException("Invalid vehicle type.");
        };
    }
}
