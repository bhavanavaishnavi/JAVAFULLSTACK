import java.sql.*;
class Test
{
public static void main(String []args)
{
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con =
DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","vaishnavi@123");
Statement s=con.createStatement(); //creating statement
ResultSet rs=s.executeQuery("select * from emp"); //executing statement
while(rs.next()){
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
}
con.close(); //closing connection
}
catch(Exception e)
{
e.printStackTrace();
}
}}