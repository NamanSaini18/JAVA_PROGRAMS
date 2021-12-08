import java.sql.*;

public class TEST {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/naman","root","");
    Statement s = con.createStatement();
    
    // CallableStatement object to call a stored procedure declared in phpmyadmin with name "GetInfo"
    CallableStatement cs = con.prepareCall("{call GetInfo()}");
    cs.execute();   // This is the execution of callable statement that is created
    
    
    ResultSet rs =cs.getResultSet();
    
    while(rs.next())
    {
      System.out.println(rs.getInt(1));
      System.out.println(rs.getString(2));
    }

  }
}
