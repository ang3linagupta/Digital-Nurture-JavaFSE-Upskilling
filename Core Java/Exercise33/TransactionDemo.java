package Exercise33;

import java.sql.*;

public class TransactionDemo {

    public static void transfer(Connection conn,
                                int fromId,
                                int toId,
                                double amount) {

        try {

            conn.setAutoCommit(false);

            PreparedStatement debit =
                    conn.prepareStatement(
                    "UPDATE accounts SET balance = balance - ? WHERE id = ?");

            debit.setDouble(1, amount);
            debit.setInt(2, fromId);

            PreparedStatement credit =
                    conn.prepareStatement(
                    "UPDATE accounts SET balance = balance + ? WHERE id = ?");

            credit.setDouble(1, amount);
            credit.setInt(2, toId);

            debit.executeUpdate();
            credit.executeUpdate();

            conn.commit();

            System.out.println("Transfer Successful");

        } catch (Exception e) {

            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            System.out.println("Transfer Failed");
        }
    }

    public static void main(String[] args) {
        System.out.println("Transaction Demo");
    }
}
