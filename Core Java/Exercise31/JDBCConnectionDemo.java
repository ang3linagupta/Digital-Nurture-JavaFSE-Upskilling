package Exercise31;

import java.sql.*;

public class JDBCConnectionDemo {

    public static void main(String[] args) {

        String url = "jdbc:sqlite:students.db";

        try (
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        ) {

            while(rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}