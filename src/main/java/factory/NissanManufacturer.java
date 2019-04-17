package main.java.factory;

/**
*Nissan manufacturer starts with only building
*Truck vehicles and can build as many as
*desired by the user. If any thing else is passed through
*build will not succeed.
*/

public class NissanManufacturer extends Truck {
    
    /*Nissan Truck Vehicle is built all else fails*/
    public static Vehicle buildNissanVehicle(VehicleType model) {
        Vehicle vehicle = null;
        switch (model) {
            case TRUCK:
                vehicle = new Truck();
                break;
            default:
                throw new IllegalStateException("Nissan can only produce Trucks");
        }
        return vehicle;
    }
}
