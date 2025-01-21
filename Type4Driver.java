import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Type4Driver{

public static void main(String[] args)throws Exception{
Connection con = null;
Statement stmt = null;

try{
//step 2 -> connections establishment
 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance","root","root");
	
//step 3 -> create statement
 stmt = con.createStatement();

//step 4 -> Execute the Query
stmt.executeUpdate("create table student(id int ,Name varchar(20))");
}
catch(Exception e){
System.out.println("exception aarha h ");
}
//step 5 -> release resources
	
finally{

try{
stmt.close();
con.close();
}
catch(SQLException sqle){
System.out.println("Handled");
}
}
}
}