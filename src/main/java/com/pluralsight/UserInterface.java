/*
UserInterface will be responsible for all output to the screen, reading of user input,
and "dispatching" of the commands to the Dealership as needed. (ex: when the user selects
"List all Vehicles", UserInterface would call the appropriate Dealership method and then
display the vehicles it returns.)
 */

package com.pluralsight;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    // Dealership object
    Dealership dealership;

    // Parameterless constructor
    public UserInterface() {
    }

    private void init() throws FileNotFoundException {
        this.dealership = DealershipFileManager.getDealership();
    }
    public void display() throws FileNotFoundException {
        // call init method
        init();

        Scanner scanner = new Scanner(System.in);

        while(true) {

            // Display the menu
            System.out.println("""
                    Welcome to the Car Dealership App!
                    Select an option to continue.
                    1 - Find vehicles within a price range
                    2 - Find vehicles by make / model
                    3 - Find vehicles by year range
                    4 - Find vehicles by color
                    5 - Find vehicles by mileage range
                    6 - Find vehicles by type (car, truck, SUV, van)
                    7 - List ALL vehicles
                    8 - Add a vehicle
                    9 - Remove a vehicle
                    99 - Quit                          
                    """);

            // Read user command
            int option = scanner.nextInt();
            scanner.nextLine(); // Consumes the new line character

            // Switch statement that calls the correct process() method to display menu
            switch (option){
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 99:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid choice (1,2,3,4,5,6,7,8,9, or 99).");
                    break;
            }
        }
    }

    // Methods
    public double processGetByPriceRequest(){
        return 0;
    }
    public String processGetByMakeModelRequest(){
        return "";
    }

    public int processGetByYearRequest(){
        return 0;
    }
    public String processGetByColorRequest(){
        return "";
    }
    public int processGetByMileageRequest(){
        return 0;
    }
    public String processGetByVehicleTypeRequest(){
        return "";
    }
    public void processGetAllVehiclesRequest(){
         processAllVehiclesRequest();
    }
    public void processAddVehicleRequest(){

    }
    public void processRemoveVehicleRequest(){

    }

    // Helper methods
    private void displayVehicles(List<Vehicle> vehicleList){
        for(Vehicle vehicle: vehicleList){
            System.out.println(vehicle);
        }
    }

    public void processAllVehiclesRequest(){
        // get all vehicles
        List<Vehicle> vehicleList = dealership.getAllVehicles();
        // call method to display the vehicles
        displayVehicles(vehicleList);
    }

}
