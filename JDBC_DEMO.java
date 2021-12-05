// In this code we are using prepared statements for executing our query.
// First we will enter our Name of employee(According to table format of database) and the ID of Employee(Format of database)
import java.sql.*;
import java.util.Scanner;


public class jdbc_test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Naman","root","");

        PreparedStatement ps = con.prepareStatement("insert into Employee values(?,?)");

//       ResultSet rs1 = ps.executeQuery();



        ps.setString(1,new Scanner(System.in).nextLine());
        ps.setInt(2,new Scanner(System.in).nextInt());
        ps.execute();
        PreparedStatement ps5 = con.prepareStatement("select * from Employee");
        ResultSet rs2 = ps5.executeQuery();
        while(rs2.next()){
            System.out.println(rs2.getString("Emp_Name") + " " + rs2.getInt("Emp_ID"));

        }

        con.close();
    }
}

// Output will be your updated table from database
