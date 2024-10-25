package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    // Data members
    private String name;
    private String address;
    private String phone;
    ArrayList<Vehicle> inventory;

    // Constructor
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        inventory = new ArrayList<>();
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return inventory;
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max){

        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }

    public List<Vehicle> getVehiclesByYear(double min, double max){
        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color){
        return null;
    }

    public  List<Vehicle> getVehiclesByMileage(double min,double max){
        return  null;
    }
    public List<Vehicle> getVehiclesByType(String vehicleType){
        return null;
    }
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){

    }
}
