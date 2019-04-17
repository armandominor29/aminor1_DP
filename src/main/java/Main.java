package main.java;

import main.java.factory.ChevroletManufacturer;
import main.java.factory.FordManufacturer;
import main.java.factory.NissanManufacturer;
import main.java.factory.Vehicle;
import main.java.factory.VehicleType;

//*Main class to show case all Design Patterns*//
public class Main {
    /*Main class to show case all Design Patterns*/
    public static void main(String[] args) {
        
        //*Start demo of Factory method *//

        Vehicle sport = FordManufacturer.buildFordVehicle(VehicleType.SPORT);
        System.out.println("Cost: " + sport.getCost());
        System.out.println("MPG: " + sport.getMpg());
        System.out.println("Turbo: " + sport.getTurbo());
        System.out.println("Towing Package: " + sport.getTowingPackage());
        System.out.println("Gas Extender: " + sport.getGasExtender() + "\n");
        
        Vehicle hybrid = ChevroletManufacturer.buildChevroletVehicle(VehicleType.HYBRID);
        System.out.println("Cost: " + hybrid.getCost());
        System.out.println("MPG: " + hybrid.getMpg());
        System.out.println("Turbo: " + hybrid.getTurbo());
        System.out.println("Towing Package: " + hybrid.getTowingPackage());
        System.out.println("Gas Extender: " + hybrid.getGasExtender() + "\n");
        
        Vehicle truck = NissanManufacturer.buildNissanVehicle(VehicleType.TRUCK);
        System.out.println("Cost: " + truck.getCost());
        System.out.println("MPG: " + truck.getMpg());
        System.out.println("Turbo: " + truck.getTurbo());
        System.out.println("Towing Package: " + truck.getTowingPackage());
        System.out.println("Gas Extender: " + truck.getGasExtender());
        //*End demo of Factory method *//
    }

}
