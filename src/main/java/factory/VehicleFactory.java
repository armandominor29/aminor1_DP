package main.java.factory;

/**
*A factory is capable of building an unlimited number of cars.
*A Factory can build a sports, hybrid, or truck.
*/

public class VehicleFactory {
    /*Vehicle is built based on Vehicle Type input*/
    public static Vehicle buildVehicle(VehicleType model) {
        Vehicle vehicle = null;
        switch (model) {
            case SPORT:
                vehicle = new Sport();
                break;
            case TRUCK:
                vehicle = new Truck();
                break;
            case HYBRID:
                vehicle = new Hybrid();
                break;
            default:
                throw new IllegalStateException("Object not initialized");
        }
        return vehicle;
    }
}