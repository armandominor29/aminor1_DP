package main.java.factory;

/**.
*Vehicle class builds each specific vehicle.
*Applies all necessary properties to each vehicle.
*/
public abstract class Vehicle {
    
    //Initialize variables
    private int vin;
    private String color;
    private int doorCount;
    private int mpg;
    private int count = 0;
    private int cost;
    private boolean turbo;
    private boolean gasExtender;
    private boolean towingPackage;
        
    //*method builds specific vehicle*//
    public Vehicle(VehicleType model) {
        this.model = model;
        if (model == VehicleType.SPORT) {
            buildSportsCar();
        } else if (model == VehicleType.HYBRID) {
            buildHybridCar();
        } else if (model == VehicleType.TRUCK) {
            buildTruckCar();
        } else {
            throw new IllegalStateException("Object not initialized");
        }
    }

    //*Method builds sports with specific attributes*//
    private void buildSportsCar() {
        this.vin = count++;
        this.mpg = 25;
        this.color = "red";
        this.doorCount = 2;
        this.cost = 50000;
        this.turbo = true;
        this.gasExtender = false;
        this.towingPackage = false;

    }
    
    //*Method builds hybrid with specific attributes *//
    private void buildHybridCar() {
        this.vin = count++;
        this.mpg = 75;
        this.color = "green";
        this.doorCount = 4;
        this.cost = 30000;
        this.turbo = false;
        this.gasExtender = true;
        this.towingPackage = false;

    }
    
    //*Method builds truck with specific attributes *//
    private void buildTruckCar() {
        this.vin = count++;
        this.mpg = 50;
        this.color = "black";
        this.doorCount = 4;
        this.cost = 40000;
        this.turbo = false;
        this.gasExtender = false;
        this.towingPackage = true;
    }

    protected abstract void construct();
    
    private VehicleType model = null;

    //*getters and setters for vehicle attributes*//
    public int getVin() {
        return vin;
    }
    
    public void setVin(int vin) {
        this.vin = vin;
    }
    //////////////////////////////////////////////
    
    public VehicleType getModel() {
        return model;
    }
    
    public void setModel(VehicleType model) {
        this.model = model;
    }
    //////////////////////////////////////////////
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    //////////////////////////////////////////////
    
    public int getDoorCount() {
        return doorCount;
    }
    
    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
    //////////////////////////////////////////////
    
    public int getMpg() {
        return mpg;
    }
    
    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
    //////////////////////////////////////////////
    
    public int getCost() {
        return cost;
    }
    
    public void setCost(int cost) {
        this.cost = cost;
    }
    //////////////////////////////////////////////
    
    public boolean getTurbo() {
        return turbo;
    }
    
    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
    //////////////////////////////////////////////
    
    public boolean getGasExtender() {
        return gasExtender;
    }
    
    public void setGasExtender(boolean gasExtender) {
        this.gasExtender = gasExtender;
    }
    //////////////////////////////////////////////
    
    public boolean getTowingPackage() {
        return towingPackage;
    }
 
    public void setTowingPackage(boolean towingPackage) {
        this.towingPackage = towingPackage;
    }
}