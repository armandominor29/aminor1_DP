package main.java.factory;

/*Class Sport creates a new sports vehicle*/
public class Sport extends Vehicle {
    
    Sport() {
        super(VehicleType.SPORT);
        construct();
    }
 
    protected void construct() {
        System.out.println("Building Sports vehicle");
    }
}