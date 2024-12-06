import com.pluralsight.dealership.Vehicle;
import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleDao {
    private BasicDataSource dataSource;

    public VehicleDao(String username, String password) {
        this.dataSource = new BasicDataSource();
        this.dataSource.setUrl("jdbc:mysql://localhost:3306/car_dealership");
        this.dataSource.setUsername(" ");
        this.dataSource.setPassword(" ");
    }

    // Search for vehicles by price range
    public List<Vehicle> getVehicleByPrice(int min, int max) {
        List<Vehicle> vehicles = new ArrayList<>();
        String query = "SELECT * FROM Vehicles WHERE price BETWEEN ? AND ?";

        try (
                Connection connection = this.dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setInt(1, min);
            statement.setInt(2, max);

            try (ResultSet results = statement.executeQuery()) {
                while (results.next()) {
                    String vin = results.getString("vin");
                    String make = results.getString("make");
                    String model = results.getString("model");
                    int year = results.getInt("year");
                    String color = results.getString("color");
                    double price = results.getDouble("price");

                    vehicles.add(new Vehicle(vin, make, model, year, color, price));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            System.out.println("Failed to create connection or prepared statement.");
        }

        return vehicles;
    }

    public List<Vehicle> getVehicleBymakemodel(String name) {
        List<Vehicle> vehicles = new ArrayList<>();
        String query = "SELECT * FROM Vehicles WHERE price BETWEEN ? AND ?";

        try (
                Connection connection = this.dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setInt(1, min);

            try (ResultSet results = statement.executeQuery()) {
                while (results.next()) {
                    String vin = results.getString("vin");
                    String make = results.getString("make");
                    String model = results.getString("model");
                    int year = results.getInt("year");
                    String color = results.getString("color");
                    double price = results.getDouble("price");

                    vehicles.add(new Vehicle(vin, make, model, year, color, price));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            System.out.println("Failed to create connection or prepared statement.");
        }

        return vehicles;
    }
    // TODO: Search for vehicles by make/model
    // TODO: Search for vehicles by year range
    // TODO: Search for vehicles by color
    // TODO: Search for vehicles by mileage range
    // TODO: Search for vehicles by type
}
