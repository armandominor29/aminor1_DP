package main.java.factory;

/**.
*Ford manufacturer starts with only building.
*Sport vehicles and can build as many as,
*desired by the user. If any thing else is passed through,
*build will not succeed.
*/

public class FordManufacturer extends Sport {
    
    private FactoryType man = null;
    
    public FordManufacturer(FactoryType man) {
        this.man = man;
        if (man == FactoryType.CHEVROLET) {
            //buildSportsCar();
        } else if (man == FactoryType.FORD) {
            //buildHybridCar();
        } else if (man == FactoryType.NISSAN) {
           // buildTruckCar();
        } else {
            throw new IllegalStateException("Object not initialized");
        }
    }
    
    /*Ford Sport Vehicle is built all else fails*/
    public static Vehicle buildFordVehicle(VehicleType model) {
        Vehicle vehicle = null;
        switch (model) {
            case SPORT:
                vehicle = new Sport();
                break;
            default:
                throw new IllegalStateException("Ford can only produce Sport Vehicles");
        }
        return vehicle;
    }
}

