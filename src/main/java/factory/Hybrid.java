package main.java.factory;

/*Class Hybrid creates a new hybrid vehicle*/
public class Hybrid extends Vehicle {
    
    Hybrid() {
        super(VehicleType.HYBRID);
        construct();
    }
 
    protected void construct() {
        System.out.println("Building Hybrid vehicle");
    }
}