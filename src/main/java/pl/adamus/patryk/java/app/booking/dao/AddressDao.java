package pl.adamus.patryk.java.app.booking.dao;

import pl.adamus.patryk.java.app.booking.model.Address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AddressDao {
    public List<Address> list() {
//        kroki do wykonania dla JDBC
//        1. DriverManager
//        2. Connection
//        3. Statement / PreparedStatement
//        4. ResultSet
        List<Address> addresses = new ArrayList<>();

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            System.out.println("Connection : " + connection);
            Statement statement = connection.createStatement();
            System.out.println("Statement : " + statement);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM TEST ORDER BY ID;");
            System.out.println("ResultSet : " + resultSet);

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");
                System.out.println("ID : " + id + ", " + "Name : " + name);

                Address address = new Address();
                address.setCity(name);
                address.setFlatNumber(String.valueOf(id));

                addresses.add(address);
            }
            return addresses;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
// TODO: 07.12.2023
// napisac test jednostkowy dla metody list