import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class SetResult {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance", "root", "root");
        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("Select * from Student");

        while (rs.next()) {
            System.out.println(rs.getInt("id") + "\t" + rs.getString("name"));
        }

        rs.close();
        stmt.close();
        con.close();

    }

}