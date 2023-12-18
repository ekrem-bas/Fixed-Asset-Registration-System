
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class DatabaseManager {

    private final String url = "jdbc:mysql://localhost:3306/my_database";
    private final String username = "root";
    private final String password = "root1234";
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public static Person loggedPerson;

    // CONNECTION
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
    
    
    // REGISTER
    public boolean register(Person person, String mail) {
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
    public boolean login(String mail, String password) {
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
    public boolean showPersons(DefaultTableModel dtm) {
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

    // DELETE PERSON
    public boolean delete(int id) {
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
    public boolean showAssets(DefaultTableModel dtm) {
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
    public boolean addAssets(FixedAssets asset) {
        boolean added = false;
        try {
            String sql = "INSERT INTO Asset (description, category, serialNumber, purchaseDate, price, location, status) "
                    + "VALUES ('" + asset.getProductDescription() + "',"
                    + "'" + asset.getProductCategory() + "',"
                    + "'" + asset.getProductSerialNumber() + "',"
                    + "'" + asset.getProductPurchaseDate() + "',"
                    + "'" + asset.getProductPrice() + "',"
                    + "'" + asset.getProductLocation() + "',"
                    + "'" + asset.getProductStatus() + "')";
            connection = getConnection();
            statement = connection.createStatement();
            if(statement.executeUpdate(sql) > 0) {
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
    public boolean updateAsset(int id, FixedAssets asset) {
        boolean updated = false;
        try{
            String sql = "UPDATE Asset SET description = '"+asset.getProductDescription()+"', category = '"+asset.getProductCategory()+"', serialNumber = '"+asset.getProductSerialNumber()+"', purchaseDate = '"+asset.getProductPurchaseDate()+"', price = '"+asset.getProductPrice()+"', location = '"+asset.getProductLocation()+"', status = '"+asset.getProductStatus()+"' WHERE id = '"+id+"'";
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
    public boolean deleteAsset(int id) {
        boolean deleted = false;
        try {
            String sql = "DELETE FROM Asset WHERE (id = '" + id + "')";
            connection = getConnection();
            statement = connection.createStatement();
            if(statement.executeUpdate(sql) > 0) {
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
