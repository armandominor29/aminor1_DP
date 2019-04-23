package test.java.factory;

import static org.junit.Assert.assertTrue;

import main.java.factory.ChevroletManufacturer;

import main.java.factory.FordManufacturer;

import main.java.factory.NissanManufacturer;

import main.java.factory.Vehicle;
import main.java.factory.VehicleFactory;
import main.java.factory.VehicleType;

import org.junit.Before;

import org.junit.Test;

public class TestFactory {
    
    /*Create an instance of each type of vehicle*/
    Vehicle sportsVehicle;
    Vehicle hybridVehicle;
    Vehicle truckVehicle;
    Vehicle sportsGeneric;
    Vehicle hybridGeneric;
    Vehicle truckGeneric;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testBuildVehicle() {
        
        
        sportsVehicle = FordManufacturer.buildFordVehicle(VehicleType.SPORT);
        hybridVehicle = ChevroletManufacturer.buildChevroletVehicle(VehicleType.HYBRID);
        truckVehicle = NissanManufacturer.buildNissanVehicle(VehicleType.TRUCK);
        
        sportsGeneric = VehicleFactory.buildVehicle(VehicleType.SPORT);
        hybridGeneric = VehicleFactory.buildVehicle(VehicleType.HYBRID);
        truckGeneric = VehicleFactory.buildVehicle(VehicleType.TRUCK);
        
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
        
        /*Set up generic sports vehicle*/
        sportsGeneric.setColor("yellow");
        sportsGeneric.setCost(35000);
        sportsGeneric.setDoorCount(2);
        sportsGeneric.setGasExtender(false);
        sportsGeneric.setTurbo(true);
        sportsGeneric.setModel(VehicleType.SPORT);
        sportsGeneric.setMpg(30);
        sportsGeneric.setTowingPackage(false);
        sportsGeneric.setVin(1111);
        
        /*Set up generic hybrid vehicle*/
        hybridGeneric.setColor("maroon");
        hybridGeneric.setCost(35000);
        hybridGeneric.setDoorCount(4);
        hybridGeneric.setGasExtender(true);
        hybridGeneric.setTurbo(false);
        hybridGeneric.setModel(VehicleType.HYBRID);
        hybridGeneric.setMpg(60);
        hybridGeneric.setTowingPackage(false);
        hybridGeneric.setVin(2222);
        
        /*Set up generic truck vehicle*/
        truckGeneric.setColor("green");
        truckGeneric.setCost(40000);
        truckGeneric.setDoorCount(4);
        truckGeneric.setGasExtender(false);
        truckGeneric.setTurbo(false);
        truckGeneric.setModel(VehicleType.TRUCK);
        truckGeneric.setMpg(10);
        truckGeneric.setTowingPackage(true);
        truckGeneric.setVin(3333);
        
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
        
        /*test for Generic sports vehicle for expected results*/
        String sportGenericColor = sportsGeneric.getColor();
        assertTrue(sportGenericColor == "yellow");
        
        int sportsGenericCost = sportsGeneric.getCost();
        assertTrue(sportsGenericCost == 35000);
        
        int sportsGenericDoorCount = sportsGeneric.getDoorCount();
        assertTrue(sportsGenericDoorCount == 2);
        
        boolean sportsGenericGasExtender = sportsGeneric.getGasExtender();
        assertTrue(sportsGenericGasExtender == false);
        
        boolean sportsGenericTurbo = sportsGeneric.getTurbo();
        assertTrue(sportsGenericTurbo == true);
        
        VehicleType sportsGenericModel = sportsGeneric.getModel();
        assertTrue(sportsGenericModel == VehicleType.SPORT);
        
        int sportsGenericMpg = sportsGeneric.getMpg();
        assertTrue(sportsGenericMpg == 30);
        
        boolean sportsGenericTowingPackage = sportsGeneric.getTowingPackage();
        assertTrue(sportsGenericTowingPackage == false);
        
        int sportsGenericVin = sportsGeneric.getVin();
        assertTrue(sportsGenericVin == 1111);
        
        /*test for Generic hybrid vehicle for expected results*/
        String hybridGenericColor = hybridGeneric.getColor();
        assertTrue(hybridGenericColor == "maroon");
        
        int hybridGenericCost = hybridGeneric.getCost();
        assertTrue(hybridGenericCost == 35000);
        
        int hybridGenericDoorCount = hybridGeneric.getDoorCount();
        assertTrue(hybridGenericDoorCount == 4);
        
        boolean hybridGenericGasExtender = hybridGeneric.getGasExtender();
        assertTrue(hybridGenericGasExtender == true);
        
        boolean hybridGenericTurbo = hybridGeneric.getTurbo();
        assertTrue(hybridGenericTurbo == false);
        
        VehicleType hybridGenericModel = hybridGeneric.getModel();
        assertTrue(hybridGenericModel == VehicleType.HYBRID);
        
        int hybridGenericMpg = hybridGeneric.getMpg();
        assertTrue(hybridGenericMpg == 60);
        
        boolean hybridGenericTowingPackage = hybridGeneric.getTowingPackage();
        assertTrue(hybridGenericTowingPackage == false);
        
        int hybridGenericVin = hybridGeneric.getVin();
        assertTrue(hybridGenericVin == 2222);
        
        /*test for Generic truck vehicle for expected results*/
        String truckGenericColor = truckGeneric.getColor();
        assertTrue(truckGenericColor == "green");
        
        int truckGenericCost = truckGeneric.getCost();
        assertTrue(truckGenericCost == 40000);
        
        int truckGenericDoorCount = truckGeneric.getDoorCount();
        assertTrue(truckGenericDoorCount == 4);
        
        boolean truckGenericGasExtender = truckGeneric.getGasExtender();
        assertTrue(truckGenericGasExtender == false);
        
        boolean truckGenericTurbo = truckGeneric.getTurbo();
        assertTrue(truckGenericTurbo == false);
        
        VehicleType truckGenericModel = truckGeneric.getModel();
        assertTrue(truckGenericModel == VehicleType.TRUCK);
        
        int truckGenericMpg = truckGeneric.getMpg();
        assertTrue(truckGenericMpg == 10);
        
        boolean truckGenericTowingPackage = truckGeneric.getTowingPackage();
        assertTrue(truckGenericTowingPackage == true);
        
        int truckGenericVin = truckGeneric.getVin();
        assertTrue(truckGenericVin == 3333);
    }
}
