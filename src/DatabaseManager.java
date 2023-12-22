
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class DatabaseManager {

    private final static String URL = "jdbc:mysql://localhost:3306/my_database";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root1234";
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static Person loggedPerson;

    // CONNECTION
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // check permission 
    public static boolean checkPermission() {
        if (!loggedPerson.getPosition().equals("General Manager")) {
            return false;
        } else {
            return true;
        }
    }

    // REGISTER
    public static boolean register(Person person, String mail) {
        boolean exist = false;
        try {
            String sql = "SELECT * FROM Person WHERE mail = '" + mail + "'";
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                exist = true;
            } else {
                exist = false;
                statement.executeUpdate(
                        "INSERT INTO Person (name, surname, phone, mail, password, gender, position) "
                        + "VALUES ('" + person.getName() + "',"
                        + "'" + person.getSurname() + "',"
                        + "'" + person.getPhone() + "',"
                        + "'" + person.getMail() + "',"
                        + "'" + person.getPassword() + "',"
                        + "'" + person.getGender() + "',"
                        + "'" + person.getPosition() + "')"
                );
                connection.close();
                statement.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exist;
    }

    // LOGIN
    public static boolean login(String mail, String password) {
        boolean found = false;
        try {
            String sql = "SELECT * FROM Person WHERE mail = '" + mail + "' AND password = '" + password + "'";
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                found = true;
                Person person = new Person(resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("phone"),
                        resultSet.getString("mail"),
                        resultSet.getString("password"),
                        resultSet.getString("gender"),
                        resultSet.getString("position")
                );
                loggedPerson = person;
            }
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return found;
    }

    // SHOW PERSONS
    public static boolean showPersons(DefaultTableModel dtm) {
        boolean showed = false;
        try {
            String sql = "SELECT * FROM Person";
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            dtm.setRowCount(0);
            while (resultSet.next()) {
                dtm.addRow(new Object[]{
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("surname"),
                    resultSet.getString("phone"),
                    resultSet.getString("mail"),
                    resultSet.getString("gender"),
                    resultSet.getString("position"),});
                showed = true;
            }
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return showed;
    }

    // ADD PERSONS INTO COMBOBOX 
    public static boolean CBOXaddPersons(DefaultComboBoxModel dcbm) {
        boolean added = false;
        try {
            String sql = "SELECT * FROM Person";
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                dcbm.addElement(resultSet.getString("name"));
                added = true;
            }
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.toString();
        }
        return added;
    }

    // DELETE PERSON
    public static boolean delete(int id) {
        boolean deleted = false;
        try {
            connection = getConnection();
            statement = connection.createStatement();
            String sql = "DELETE FROM Person WHERE (`id` = '" + id + "')";
            if (statement.executeUpdate(sql) > 0) {
                deleted = true;
            }
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deleted;
    }

    // TODO: asset teable (update, (same frame: delete, show))
    // ADD ASSETS (done)
    // SHOW ASSETS (done)
    // UPDATE ASSETS (done)
    // FILTER ASSETS (done)
    // DELETE ASSETS (done)
    // SHOW ASSETS    
    public static boolean showAssets(DefaultTableModel dtm) {
        boolean showed = false;
        try {
            String sql = "SELECT * FROM Asset";
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            dtm.setRowCount(0);
            while (resultSet.next()) {
                dtm.addRow(new Object[]{
                    resultSet.getInt("id"),
                    resultSet.getString("user"),
                    resultSet.getString("description"),
                    resultSet.getString("category"),
                    resultSet.getString("serialNumber"),
                    resultSet.getString("purchaseDate"),
                    resultSet.getString("price"),
                    resultSet.getString("location"),
                    resultSet.getString("status"),});
                showed = true;
            }
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return showed;
    }

    // ADD ASSETS
    public static boolean addAssets(FixedAssets asset) {
        boolean added = false;
        try {
            String sql = "INSERT INTO Asset (user, description, category, serialNumber, purchaseDate, price, location, status) "
                    + "VALUES ('" + asset.getProductUser() + "',"
                    + "'" + asset.getProductDescription() + "',"
                    + "'" + asset.getProductCategory() + "',"
                    + "'" + asset.getProductSerialNumber() + "',"
                    + "'" + asset.getProductPurchaseDate() + "',"
                    + "'" + asset.getProductPrice() + "',"
                    + "'" + asset.getProductLocation() + "',"
                    + "'" + asset.getProductStatus() + "')";
            connection = getConnection();
            statement = connection.createStatement();
            if (statement.executeUpdate(sql) > 0) {
                added = true;
            }
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return added;
    }

    // UPDATE ASSET
    public static boolean updateAsset(int id, FixedAssets asset) {
        boolean updated = false;
        try {
            String sql = "UPDATE Asset SET user = '" + asset.getProductUser() + "', description = '" + asset.getProductDescription() + "', category = '" + asset.getProductCategory() + "', serialNumber = '" + asset.getProductSerialNumber() + "', purchaseDate = '" + asset.getProductPurchaseDate() + "', price = '" + asset.getProductPrice() + "', location = '" + asset.getProductLocation() + "', status = '" + asset.getProductStatus() + "' WHERE id = '" + id + "'";
            connection = getConnection();
            statement = connection.createStatement();
            if (statement.executeUpdate(sql) > 0) {
                updated = true;
            }
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return updated;
    }

    // DELETE ASSET
    public static boolean deleteAsset(int id) {
        boolean deleted = false;
        try {
            String sql = "DELETE FROM Asset WHERE (id = '" + id + "')";
            connection = getConnection();
            statement = connection.createStatement();
            if (statement.executeUpdate(sql) > 0) {
                deleted = true;
            }
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deleted;
    }

}
