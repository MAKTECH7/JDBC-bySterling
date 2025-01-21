import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TypeFourDriverTest{
public static void main(String[] args)throws Exception{
//step 2 -> connection establishment

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance","root","root");

//step 3 -> Create statement
Statement stmt = con.createStatement();

//step 4 -> Execute Query

//stmt.executeUpdate("create table student(id int ,Name varchar(20))");

//stmt.executeUpdate("insert into student (id, Name) values (10,'Ayan'),(20,'Rehan'),(30,'Mc //flame'),(40, 'ikhlas');");

//stmt.executeUpdate("ALTER table student ADD Savings FLOAT NOT NULL DEFAULT 0");    //ADD column

stmt.executeUpdate("ALTER TABLE student MODIFY Savings DOUBLE NOT NULL DEFAULT 0.0");  //modify

//stmt.executeUpdate("ALTER TABLE student CHANGE COLUMN Name FirstName varchar(30)"); //change the //name

//stmt.executeUpdate("ALTER TABLE student DROP Savings"); //Drop the columm

//stmt.executeUpdate("ALTER TABLE student RENAME TO Students"); //rename the table





// Step 5 -> Release Resources
con.close();
stmt.close();


}

}