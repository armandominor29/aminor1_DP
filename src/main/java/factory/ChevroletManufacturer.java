package main.java.factory;

/**
*Chevrolet manufacturer starts with only building
*Hybrid vehicles and can build as many as
*desired by the user. If any thing else is passed through
*build will not succeed.
*/

public class ChevroletManufacturer extends Hybrid {
    
    //*Chevrolet Hybrid Vehicle is built all else fails*//
    public static Vehicle buildChevroletVehicle(VehicleType model) {
        Vehicle vehicle = null;
        switch (model) {
            case HYBRID:
                vehicle = new Hybrid();
                break;
            default:
                throw new IllegalStateException("Chevrolet can only produce Hybrids");
        }
        return vehicle;
    }
}
