package project_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarService {
    private static final String SELECT_CAR_BY_ID = "SELECT * FROM CarTable WHERE carID = ?";
    private static final String SELECT_CUSTOMIZATION_BY_CAR_ID = "SELECT * FROM CustomizationTable WHERE carID = ?";

    public static CarTable selectCarById(int carId) {
        try (Connection connection = DbConnection.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CAR_BY_ID)) {

            preparedStatement.setInt(1, carId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new CarTable(
                        resultSet.getInt("CarID"),
                        resultSet.getString("Make"),
                        resultSet.getString("Model"),
                        resultSet.getInt("Year"),
                        resultSet.getInt("BasePrice"),
                        resultSet.getString("Availability")
                );
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return null; // Car not found
    }

    public static CustomizationTable selectCustomizationByCarId(int carId) {
        try (Connection connection = DbConnection.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMIZATION_BY_CAR_ID)) {

            preparedStatement.setInt(1, carId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new CustomizationTable(
                        resultSet.getInt("CustomizationID"),
                        resultSet.getInt("CarID"),
                        resultSet.getString("Option"),
                        resultSet.getInt("OptionPrice")
                );
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return null; // Customization not found
    }

    public static double calculateTotalCost(int carId, String selectedOption) {
        CarTable car = selectCarById(carId);
        CustomizationTable customization = selectCustomizationByCarId(carId);

        if (car != null && customization != null) {
            double totalCost = car.getBasePrice() + customization.getOptionPrice();
            // Add additional logic for taxes or discounts if needed
            return totalCost;
        }

        return 0; // Invalid car or customization
}
}
