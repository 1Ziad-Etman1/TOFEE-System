import java.sql.*;

public class Connect {

    String database_name;
    String table_name;


    /**
     * Connect to a sample database
     *
     * @return
     */
    public Connect (String TB_name){
        database_name = "TOFEE.db";
        table_name = TB_name;
    }
    public Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:DataBases/" + database_name;
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

    public void insertInItemsTable(String id, String name, String categoryName, String brand, float price, String seal_loose, float discountPercentage, float amountInStores, int loualPoints, String description ) {
        String sql = "INSERT INTO "+ table_name +
        "(id, name, categoryName, brand, price, seal_loose, discountPercentage, amountInStores, loualPoints, description) VALUES(?,?,?,?,?,?,?,?,?,?)";

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
            pstmt.setInt   (9, loualPoints);
            pstmt.setString(10, description);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

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
                                rs.getInt("loualPoints") + "\t" +
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
//(id, clientID, address, items, itemsAmounts, paymentMethods, paymentAmounts, price)
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

            if (colName.equals("phoneNum")) {
                pstmt.setLong(1, Long.parseLong(newVal));
            } else {
                pstmt.setString(1, newVal);
            }

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
            } else if (colName.equals("loualPoints")) {
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

    public boolean checkCredentials(String username, String password) {
        String sql = "SELECT * FROM UsersData WHERE username = ? AND password = ?";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            // If there is a row that matches the provided username and password, return true
            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        // If there is no row that matches the provided username and password, return false
        return false;
    }
    
//    public void createNewTableUserData() {
//        // SQLite connection string
//        String url = "jdbc:sqlite:DataBases/" + database_name;
//
//        // SQL statement for creating a new table
//        String sql = "CREATE TABLE IF NOT EXISTS " + table_name + " ("
//                + " id text PRIMARY KEY,\n"
//                + " name text NOT NULL,\n"
//                + " username text NOT NULL,\n"
//                + " email text NOT NULL,\n"
//                + " password text NOT NULL,\n"
//                + " phoneNum text NOT NULL,\n"
//                + " address text NOT NULL\n"
//                + " type text NOT NULL\n"
//                + ");";
//
//        try{
//            Connection conn = DriverManager.getConnection(url);
//            Statement stmt = conn.createStatement();
//            stmt.execute(sql);
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }

//    public void createNewTableItems() {
//        // SQLite connection string
//        String url = "jdbc:sqlite:DataBases/" + database_name;
//
//        // SQL statement for creating a new table
//        String sql = "CREATE TABLE IF NOT EXISTS " + table_name + " ("
//                + " id text PRIMARY KEY,\n"
//                + " name text NOT NULL,\n"
//                + " categoryName text NOT NULL,\n"
//                + " brand text NOT NULL,\n"
//                + " price REAL NOT NULL,\n"
//                + " seal_loose text NOT NULL,\n"
//                + " discountPercentage REAL NOT NULL,\n"
//                + " amountInStores REAL NOT NULL,\n"
//                + " loyalPoints INTEGER NOT NULL,\n"
//                + " description text NOT NULL\n"
//                + ");";
//
//        try{
//            Connection conn = DriverManager.getConnection(url);
//            Statement stmt = conn.createStatement();
//            stmt.execute(sql);
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
}
