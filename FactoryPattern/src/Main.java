import vehicle.Vehicle;
import vehicleFactory.VehicleFactory;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What you want to create - CAR, BIKE or TRUCK");
        System.out.println();
        String vehicleType = scanner.nextLine();
        Vehicle myVehicle = factory.getVehicle(vehicleType);
        myVehicle.start();
        myVehicle.stop();
    }
}