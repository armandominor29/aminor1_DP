package main.java.factory;

//*Class Truck creates a new truck vehicle*//
public class Truck extends Vehicle {
    
    Truck() {
        super(VehicleType.TRUCK);
        construct();
    }
 
    protected void construct() {
        System.out.println("Building Truck vehicle");
    }
}