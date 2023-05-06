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

    public void insertInTtemsTable(String id, String name, String username, String email, String password, String phoneNum, String address, String type ) {
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
    public void selectAllFromAuthTable() {
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
