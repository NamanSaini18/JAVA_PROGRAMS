package MY_PROJECT;

import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class INVALID_DATA extends Exception{   // this is the name of custom exception
    INVALID_DATA(String obj){
        super(obj);

    }
}
public class PROJECT {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, INVALID_DATA {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Email id to create new account: ");
        String str = sc.nextLine();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Naman","root","");
        PreparedStatement ps = con.prepareStatement("insert into INFORMATION VALUES(?,?)");
        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9._]+@(gmail|yahoo|hotmail|outlook|rediff).com");
        Pattern p2 = Pattern.compile("[6-9][0-9]{9}");
        Matcher m = p.matcher(str);
        Matcher m2 = p2.matcher(str);


        if(m.find() && m2.find()){
            boolean t= true;
            boolean t1 = true;
            while(t && t1){
                System.out.println(m.group() + " " + m2.group());

                ps.setString(1,m.group());
                ps.setString(2,m2.group());
                ps.execute();
                t=m.find();
                t1=m2.find();
            }
        }

        else {
            try {
                throw new INVALID_DATA("PLEASE ENTER A VALID EMAIL ID AND PHONE NUMBER");
            }catch(INVALID_DATA e){
                System.out.println(e.getMessage());
            }
        }
        ResultSet rs = ps.executeQuery("select * from INFORMATION");
        System.out.println("Your updated table from database is :  ");
        while(rs.next()){
            System.out.println(rs.getString("Email"));
            System.out.println(rs.getString("Phone_no"));
        }


        con.close();

    }
}
