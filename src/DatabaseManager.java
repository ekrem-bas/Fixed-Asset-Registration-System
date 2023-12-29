
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class DatabaseManager {

    // url for sql connection
    private final static String URL = "jdbc:mysql://localhost:3306/my_database";
    // username for sql connection
    private final static String USERNAME = "root";
    // password for sql connection
    private final static String PASSWORD = "root1234";
    // connection
    private static Connection connection;
    // statement
    private static Statement statement;
    // result set
    private static ResultSet resultSet;

    // loggedPerson to check permission
    public static Person loggedPerson;

    // CONNECTION
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // CHECK PERMISSION
    public static boolean checkPermission() {
        // if user is admin it will get a permission
        if (!loggedPerson.getPosition().equals("Admin")) {
            return false;
        } else {
            return true;
        }
    }

    // REGISTER
    public static boolean register(Person person, String mail) {
        // check if the mail exists or not
        boolean exist = false;
        // sql block
        try {
            // query for registering
            String sql = "SELECT * FROM Person WHERE mail = '" + mail + "'";
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            // if the given mail is exist it will return true
            if (resultSet.next()) {
                exist = true;
            } else {
                // if not it will create a person with given values
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
                // closing connection and statement
                connection.close();
                statement.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // return true or false to give an information to user
        return exist;
    }

    // LOGIN
    public static boolean login(String mail, String password) {
        // check if the user founded from sql
        boolean found = false;
        // sql block
        try {
            // query for checking the mail and password to login
            String sql = "SELECT * FROM Person WHERE mail = '" + mail + "' AND password = '" + password + "'";
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            // if there is a person with given values it will assign the logged person to loggedPerson variable
            if (resultSet.next()) {
                found = true;
                Person person = new Person(
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("phone"),
                        resultSet.getString("mail"),
                        resultSet.getString("password"),
                        resultSet.getString("gender"),
                        resultSet.getString("position")
                );
                loggedPerson = person;
            }
            // closing connection and statement
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return found;
    }

    // SHOW PERSONS
    public static boolean showPersons(DefaultTableModel dtm) {
        // to check if this method worked or not
        boolean showed = false;
        try {
            // sql query to show persons except Admin
            String sql = "SELECT * FROM Person WHERE name <> 'Admin'";
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            // reset the table
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
            // query for sql to add persons to combobox except admin 
            String sql = "SELECT * FROM Person WHERE name <> 'Admin'";
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
            // delete person where the given id
            String sql = "DELETE FROM Person WHERE id = '" + id + "'";
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

    // SHOW ASSETS    
    public static boolean showAssets(DefaultTableModel dtm) {
        boolean showed = false;
        try {
            // query for sql to get all of assets in the database table
            String sql = "SELECT * FROM Asset";
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            // reset the table
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
            // add asset to database with given values
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
            // update the selected asset with given values
            String sql = "UPDATE Asset SET user = '" + asset.getProductUser() + "',"
                    + " description = '" + asset.getProductDescription() + "',"
                    + " category = '" + asset.getProductCategory() + "',"
                    + " serialNumber = '" + asset.getProductSerialNumber() + "',"
                    + " purchaseDate = '" + asset.getProductPurchaseDate() + "',"
                    + " price = '" + asset.getProductPrice() + "',"
                    + " location = '" + asset.getProductLocation() + "',"
                    + " status = '" + asset.getProductStatus() + "'"
                    + " WHERE id = '" + id + "'";
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
            // delete asset with the given id
            String sql = "DELETE FROM Asset WHERE id = '" + id + "'";
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
