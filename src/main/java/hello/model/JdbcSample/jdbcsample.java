package hello.model.JdbcSample;
import java.sql.*;
/**
 * Created by Надежда on 13.05.2017.
 */
public class jdbcsample {
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/Kursovaya";

    static final String USER = "postgres";
    static final String PASS = "5542469";


    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {

            Class.forName(JDBC_DRIVER);


            System.out.println("Connecting to database Kursovaya");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating statement");
            stmt = conn.createStatement();
            String sql  = "select * from Man";
            ResultSet rs = stmt.executeQuery(sql);


            while (rs.next()) {
                System.out.print(rs.getInt("N_man")+ ",");
                System.out.println(rs.getString("city"));

            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {

            se.printStackTrace();
        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }


}


