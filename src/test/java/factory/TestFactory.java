package test.java.factory;

import static org.junit.Assert.assertTrue;

import main.java.factory.ChevroletManufacturer;

import main.java.factory.FordManufacturer;

import main.java.factory.NissanManufacturer;

import main.java.factory.Vehicle;

import main.java.factory.VehicleType;

import org.junit.Before;

import org.junit.Test;

public class TestFactory {
    
    /*Create an instance of each type of vehicle*/
    Vehicle sportsVehicle;
    Vehicle hybridVehicle;
    Vehicle truckVehicle;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testBuildVehicle() {
        
        
        sportsVehicle = FordManufacturer.buildFordVehicle(VehicleType.SPORT);
        hybridVehicle = ChevroletManufacturer.buildChevroletVehicle(VehicleType.HYBRID);
        truckVehicle = NissanManufacturer.buildNissanVehicle(VehicleType.TRUCK);
        
        /*Set up sports vehicle*/
        sportsVehicle.setColor("blue");
        sportsVehicle.setCost(35000);
        sportsVehicle.setDoorCount(2);
        sportsVehicle.setGasExtender(false);
        sportsVehicle.setTurbo(true);
        sportsVehicle.setModel(VehicleType.SPORT);
        sportsVehicle.setMpg(30);
        sportsVehicle.setTowingPackage(false);
        sportsVehicle.setVin(1234);
        
        /*Set up hybrid vehicle*/
        hybridVehicle.setColor("yellow");
        hybridVehicle.setCost(25000);
        hybridVehicle.setDoorCount(2);
        hybridVehicle.setGasExtender(true);
        hybridVehicle.setTurbo(false);
        hybridVehicle.setModel(VehicleType.HYBRID);
        hybridVehicle.setMpg(50);
        hybridVehicle.setTowingPackage(false);
        hybridVehicle.setVin(2345);
        
        /*Set up truck vehicle*/
        truckVehicle.setColor("red");
        truckVehicle.setCost(15000);
        truckVehicle.setDoorCount(4);
        truckVehicle.setGasExtender(false);
        truckVehicle.setTurbo(false);
        truckVehicle.setModel(VehicleType.TRUCK);
        truckVehicle.setMpg(20);
        truckVehicle.setTowingPackage(true);
        truckVehicle.setVin(3456);
        
        /*test for sports vehicle for expected results*/
        String sportColor = sportsVehicle.getColor();
        assertTrue(sportColor == "blue");
        
        int sportsCost = sportsVehicle.getCost();
        assertTrue(sportsCost == 35000);
        
        int sportsdoorCount = sportsVehicle.getDoorCount();
        assertTrue(sportsdoorCount == 2);
        
        boolean sportsGasExtender = sportsVehicle.getGasExtender();
        assertTrue(sportsGasExtender == false);
        
        boolean sportsTurbo = sportsVehicle.getTurbo();
        assertTrue(sportsTurbo == true);
        
        VehicleType sportsModel = sportsVehicle.getModel();
        assertTrue(sportsModel == VehicleType.SPORT);
        
        int sportsMpg = sportsVehicle.getMpg();
        assertTrue(sportsMpg == 30);
        
        boolean sportsTowingPackage = sportsVehicle.getTowingPackage();
        assertTrue(sportsTowingPackage == false);
        
        int sportsVin = sportsVehicle.getVin();
        assertTrue(sportsVin == 1234);
        
        
        /*test for hybrid vehicle for expected results*/
        String hybridColor = hybridVehicle.getColor();
        assertTrue(hybridColor == "yellow");
        
        int hybridCost = hybridVehicle.getCost();
        assertTrue(hybridCost == 25000);
        
        int hybridDoorCount = hybridVehicle.getDoorCount();
        assertTrue(hybridDoorCount == 2);
        
        boolean hybridGasExtender = hybridVehicle.getGasExtender();
        assertTrue(hybridGasExtender == true);
        
        boolean hybridTurbo = hybridVehicle.getTurbo();
        assertTrue(hybridTurbo == false);
        
        VehicleType hybridModel = hybridVehicle.getModel();
        assertTrue(hybridModel == VehicleType.HYBRID);
        
        int hybridMpg = hybridVehicle.getMpg();
        assertTrue(hybridMpg == 50);
        
        boolean hybridTowingPackage = hybridVehicle.getTowingPackage();
        assertTrue(hybridTowingPackage == false);
        
        int hybridVin = hybridVehicle.getVin();
        assertTrue(hybridVin == 2345);
        
        
        /*test for truck vehicle for expected results*/
        String truckColor = truckVehicle.getColor();
        assertTrue(truckColor == "red");
        
        int truckCost = truckVehicle.getCost();
        assertTrue(truckCost == 15000);
        
        int truckDoorCount = truckVehicle.getDoorCount();
        assertTrue(truckDoorCount == 4);
        
        boolean truckGasExtender = truckVehicle.getGasExtender();
        assertTrue(truckGasExtender == false);
        
        boolean truckTurbo = truckVehicle.getTurbo();
        assertTrue(truckTurbo == false);
        
        VehicleType truckModel = truckVehicle.getModel();
        assertTrue(truckModel == VehicleType.TRUCK);
        
        int truckMpg = truckVehicle.getMpg();
        assertTrue(truckMpg == 20);
        
        boolean truckTowingPackage = truckVehicle.getTowingPackage();
        assertTrue(truckTowingPackage == true);
        
        int truckVin = truckVehicle.getVin();
        assertTrue(truckVin == 3456);
    }
}
