package Exercise32;

import java.sql.*;

public class StudentDAO {

    private static final String URL =
            "jdbc:sqlite:students.db";

    public void insertStudent(int id,String name)
            throws Exception {

        Connection conn =
                DriverManager.getConnection(URL);

        PreparedStatement ps =
                conn.prepareStatement(
                "INSERT INTO students VALUES(?,?)");

        ps.setInt(1,id);
        ps.setString(2,name);

        ps.executeUpdate();

        conn.close();
    }

    public void updateStudent(int id,String name)
            throws Exception {

        Connection conn =
                DriverManager.getConnection(URL);

        PreparedStatement ps =
                conn.prepareStatement(
                "UPDATE students SET name=? WHERE id=?");

        ps.setString(1,name);
        ps.setInt(2,id);

        ps.executeUpdate();

        conn.close();
    }
}