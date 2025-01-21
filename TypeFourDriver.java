import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class TypeFourDriver{

public static void main(String[] args)throws Exception{

//step1  -> load the driver
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver Loaded Successfully");

//step 2 -> connections establishment
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance","root","root");

//step 3 -> create statement
Statement stmt = con.createStatement();

//step 4 -> Execute the Query
stmt.executeUpdate("create table student(id int primary key,Name varchar(20)");

//step 5 -> release resources

stmt.close();
con.close();

}
}