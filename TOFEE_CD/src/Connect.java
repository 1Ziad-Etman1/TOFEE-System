import java.sql.*;

//UsersData
//Items
//orders
//categories

/**
 * The type Connect.
 */
public class Connect {

    /**
     * The Table name.
     */
    String table_name;


    /**
     * Connect to a sample database
     *
     * @param TB_name the tb name
     * @return
     */
    public Connect (String TB_name){
        table_name = TB_name;
    }

    /**
     * Connect connection.
     *
     * @return the connection
     */
    public Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:DataBases/TOFEE.db";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
//        finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
        return conn;
    }


    /**
     * Insert in auth table.
     *
     * @param id       the id
     * @param name     the name
     * @param username the username
     * @param email    the email
     * @param password the password
     * @param phoneNum the phone num
     * @param address  the address
     * @param type     the type
     */
    public void insertInAuthTable(String id, String name, String username, String email, String password, String phoneNum, String address, String type ) {
        String sql = "INSERT INTO "+ table_name +"(id, name, username, email, password, phoneNum, address, type) VALUES(?,?,?,?,?,?,?,?)";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, username);
            pstmt.setString(4, email);
            pstmt.setString(5, password);
            pstmt.setString(6, phoneNum);
            pstmt.setString(7, address);
            pstmt.setString(8, type);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Insert in items table.
     *
     * @param id                 the id
     * @param name               the name
     * @param categoryName       the category name
     * @param brand              the brand
     * @param price              the price
     * @param seal_loose         the seal loose
     * @param discountPercentage the discount percentage
     * @param amountInStores     the amount in stores
     * @param loyalPoints        the loyal points
     * @param description        the description
     */
    public void insertInItemsTable(String id, String name, String categoryName, String brand, float price, String seal_loose, float discountPercentage, float amountInStores, int loyalPoints, String description ) {
        String sql = "INSERT INTO "+ table_name +
        "(id, name, categoryName, brand, price, seal_loose, discountPercentage, amountInStores, loyalPoints, description) VALUES(?,?,?,?,?,?,?,?,?,?)";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, categoryName);
            pstmt.setString(4, brand);
            pstmt.setFloat (5, price);
            pstmt.setString(6, seal_loose);
            pstmt.setFloat (7, discountPercentage);
            pstmt.setFloat (8, amountInStores);
            pstmt.setInt   (9, loyalPoints);
            pstmt.setString(10, description);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Insert in catigory table.
     *
     * @param id    the id
     * @param name  the name
     * @param items the items
     */
    public void insertInCatigoryTable(String id, String name, String items) {
        String sql = "INSERT INTO "+ table_name +"(id, name, items) VALUES(?,?,?)";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, items);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Insert in orders table.
     *
     * @param id             the id
     * @param clientID       the client id
     * @param address        the address
     * @param items          the items
     * @param itemsAmounts   the items amounts
     * @param paymentMethods the payment methods
     * @param paymentAmounts the payment amounts
     * @param price          the price
     */
    public void insertInOrdersTable(String id, String clientID, String address, String items, String itemsAmounts, String paymentMethods, String paymentAmounts, float price ) {
        String sql = "INSERT INTO "+ table_name +"(id, clientID, address, items, itemsAmounts, paymentMethods, paymentAmounts, price) VALUES(?,?,?,?,?,?,?,?)";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, clientID);
            pstmt.setString(3, address);
            pstmt.setString(4, items);
            pstmt.setString(5, itemsAmounts);
            pstmt.setString(6, paymentMethods);
            pstmt.setString(7, paymentAmounts);
            pstmt.setFloat(8, price);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Select all.
     */
    public void selectAll(){
        if (table_name == "UsersData"){
            selectAllFromAuthTable();
        } else if (table_name == "Items") {
            selectAllFromItemsTable();
        } else if (table_name == "categories") {
            selectAllFromCategoryTable();
        } else if (table_name == "orders") {
            selectAllFromOrdersTable();
        }
    }

    private void selectAllFromAuthTable() {
        String sql = "SELECT * FROM " + table_name;

        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(
                        rs.getString("id") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getString("username") + "\t" +
                        rs.getString("email") + "\t" +
                        rs.getString("password") + "\t" +
                        rs.getString("phoneNum") + "\t" +
                        rs.getString("address") + "\t" +
                        rs.getString("type")
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void selectAllFromItemsTable() {
        String sql = "SELECT * FROM " + table_name;

        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(
                        rs.getString("id") + "\t" +
                                rs.getString("name") + "\t" +
                                rs.getString("categoryName") + "\t" +
                                rs.getString("brand") + "\t" +
                                rs.getFloat("price") + "\t" +
                                rs.getString("seal_loose") + "\t" +
                                rs.getFloat("discountPercentage") + "\t" +
                                rs.getFloat("amountInStores") + "\t" +
                                rs.getInt("loyalPoints") + "\t" +
                                rs.getString("description")
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void selectAllFromCategoryTable() {
        String sql = "SELECT * FROM " + table_name;

        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(
                        rs.getString("id") + "\t" +
                                rs.getString("name") + "\t" +
                                rs.getString("items")
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void selectAllFromOrdersTable() {
        String sql = "SELECT * FROM " + table_name;

        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(
                        rs.getString("id") + "\t" +
                                rs.getString("clientID") + "\t" +
                                rs.getString("address") + "\t" +
                                rs.getString("items") + "\t" +
                                rs.getString("itemsAmounts") + "\t" +
                                rs.getString("paymentMethods") + "\t" +
                                rs.getString("paymentAmounts") + "\t" +
                                rs.getFloat("price")
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Delete from table.
     *
     * @param id the id
     */
    public void deleteFromTable(String id) {
        char tableChar = id.charAt(0);

        switch(tableChar) {
            case 'u':
                deleteFromAuthTable(id);
                break;
            case 'i':
                deleteFromItemsTable(id);
                break;
            case 'c':
                deleteFromCategoryTable(id);
                break;
            case 'o':
                deleteFromOrdersTable(id);
                break;
            default:
                System.out.println("Invalid ID");
                break;
        }
    }


    private void deleteFromAuthTable(String id) {
        String sql = "DELETE FROM "+ table_name +" WHERE id = ?";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void deleteFromItemsTable(String id) {
        String sql = "DELETE FROM "+ table_name +" WHERE id = ?";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void deleteFromCategoryTable(String id) {
        String sql = "DELETE FROM "+ table_name +" WHERE id = ?";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void deleteFromOrdersTable(String id) {
        String sql = "DELETE FROM "+ table_name +" WHERE id = ?";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Update table.
     *
     * @param id      the id
     * @param colName the col name
     * @param newVal  the new val
     */
    public void updateTable(String id, String colName, String newVal) {
        char tableChar = id.charAt(0);

        switch(tableChar) {
            case 'u':
                updateAuthTable(id, colName, newVal);
                break;
            case 'i':
                updateItemsTable(id, colName, newVal);
                break;
            case 'c':
                updateCategoryTable(id, colName, newVal);
                break;
            case 'o':
                updateOrdersTable(id, colName, newVal);
                break;
            default:
                System.out.println("Invalid ID");
                break;
        }
    }

    private void updateAuthTable(String id, String colName, String newVal) {
        String sql = "UPDATE " + table_name + " SET " + colName + " = ? WHERE id = ?";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);


            pstmt.setString(1, newVal);


            pstmt.setString(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void updateItemsTable(String id, String colName, String newVal) {
        String sql = "UPDATE " + table_name + " SET " + colName + " = ? WHERE id = ?";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            if (colName.equals("price") || colName.equals("discountPercentage") || colName.equals("amountInStores")) {
                pstmt.setFloat(1, Float.parseFloat(newVal));
            } else if (colName.equals("loyalPoints")) {
                pstmt.setInt(1, Integer.parseInt(newVal));
            } else {
                pstmt.setString(1, newVal);
            }

            pstmt.setString(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void updateCategoryTable(String id, String colName, String newVal) {
        String sql = "UPDATE " + table_name + " SET " + colName + " = ? WHERE id = ?";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newVal);
            pstmt.setString(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void updateOrdersTable(String id, String colName, String newVal) {
        String sql = "UPDATE " + table_name + " SET " + colName + " = ? WHERE id = ?";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            if (colName.equals("totalCost")) {
                pstmt.setFloat(1, Float.parseFloat(newVal));
            } else if (colName.equals("orderStatus")) {
                pstmt.setInt(1, Integer.parseInt(newVal));
            } else {
                pstmt.setString(1, newVal);
            }

            pstmt.setString(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Check credentials boolean.
     *
     * @param username the username
     * @param email    the email
     * @param password the password
     * @return the boolean
     */
    public boolean checkCredentials(String username, String email, String password) {
        String sql = "SELECT * FROM UsersData WHERE username = ? AND email = ? AND password = ?";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, username);
            pstmt.setString(2, email);
            pstmt.setString(3, password);
            ResultSet rs = pstmt.executeQuery();

            // If there is a row that matches the provided username and password, return true
            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        // If there is no row that matches the provided username, email and password, return false
        return false;
    }

    /**
     * Check mail boolean.
     *
     * @param email the email
     * @return the boolean
     */
    public boolean checkMail(String email) {
        String sql = "SELECT * FROM UsersData WHERE email = ?";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();

            // If there is a row that matches the provided email, return true
            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        // If there is no row that matches the provided username and password, return false
        return false;
    }

    /**
     * Check mail id boolean.
     *
     * @param ID    the id
     * @param email the email
     * @return the boolean
     */
    public boolean checkMail_ID(String ID,String email) {
        String sql = "SELECT * FROM UsersData WHERE id = ? AND email = ?";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, ID);
            pstmt.setString(2, email);

            ResultSet rs = pstmt.executeQuery();

            // If there is a row that matches the provided email, return true
            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        // If there is no row that matches the provided username and password, return false
        return false;
    }

    /**
     * Search view by name.
     *
     * @param key the key
     */
    public void search_viewByName(String key){
        key = '\'' + key + '\'';
        String sql = "SELECT * FROM " + table_name + " WHERE name = " + key + " ;";

        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(
                        rs.getString("id") + "\t" +
                                rs.getString("name") + "\t" +
                                rs.getString("categoryName") + "\t" +
                                rs.getString("brand") + "\t" +
                                rs.getFloat("price") + "\t" +
                                rs.getString("seal_loose") + "\t" +
                                rs.getFloat("discountPercentage") + "\t" +
                                rs.getFloat("amountInStores") + "\t" +
                                rs.getInt("loyalPoints") + "\t" +
                                rs.getString("description")
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Search view by category.
     *
     * @param key the key
     */
    public void search_viewByCategory(String key){
        key = '\'' + key + '\'';
        String sql = "SELECT * FROM " + table_name + " WHERE categoryName = " + key + " ;";

        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(
                        rs.getString("id") + "\t" +
                                rs.getString("name") + "\t" +
                                rs.getString("categoryName") + "\t" +
                                rs.getString("brand") + "\t" +
                                rs.getFloat("price") + "\t" +
                                rs.getString("seal_loose") + "\t" +
                                rs.getFloat("discountPercentage") + "\t" +
                                rs.getFloat("amountInStores") + "\t" +
                                rs.getInt("loyalPoints") + "\t" +
                                rs.getString("description")
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Gets last user id.
     *
     * @return the last user id
     */
    public String getLastUserId() {
        String lastId = "";

        try {
            // create a SQL statement to retrieve the ID of the last row in the user table
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id FROM "+table_name+" WHERE id=(SELECT MAX(id))");

            // if there is a last ID, retrieve it
            if (rs.next()) {
                lastId = rs.getString(1);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lastId;
    }

    /**
     * Gets price by id.
     *
     * @param id the id
     * @return the price by id
     */
    public float getPriceById(String id) {
        float price = 0;

        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            id = '\'' + id + '\'';
            ResultSet rs = stmt.executeQuery("SELECT price FROM " + table_name + " WHERE id = " + id );

            if (rs.next()) {
                price = rs.getFloat(1);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return price;
    }
}
