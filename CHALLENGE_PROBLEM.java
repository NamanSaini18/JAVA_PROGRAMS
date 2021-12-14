import java.sql.*;

public class JDBCCalls {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        int n = Integer.parseInt(args[0]);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Naman","root","");
        DAOclass obj = new DAOclass();


        switch (n) {
            case 1:
                //inserting a record
                obj.insert(con, Integer.parseInt(args[1]), args[2], args[3], args[4], Integer.parseInt(args[5]));
                break;
            case 2:
                //deleting a record
                obj.delete(con, Integer.parseInt(args[1]));
                break;
            case 3:
                //modifying a record
                obj.modify(con, Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;
            case 4:
                //displaying a record
                if(args.length==1) {
                    obj.SHOWALL(con);
                } else {
                    obj.display(con, Integer.parseInt(args[1]));
                }
                break;
            default:
                System.out.println("You have entered an invalid number! Please try again");
                break;
        }
        con.close();
    }
}


class DAOclass{
    public void insert(Connection con, int stu_ID,String name, String Class, String DOB, int Fees) throws SQLException {
        String str = "Insert into student values(?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(str);
        ps.setInt(1, stu_ID);
        ps.setString(2, name);
        ps.setString(3,Class);
        ps.setString(4,DOB);
        ps.setInt(5,Fees);
        ps.executeUpdate();
        System.out.println("Data entered successfully");

    }
    public void delete(Connection con, int stu_ID) throws SQLException {
        String del = "Delete from Student WHERE stu_ID'" + stu_ID +"';";
        PreparedStatement ps = con.prepareStatement(del);
        ps.executeQuery();
        System.out.println("Desired data deleted successfully");

    }
    public void modify(Connection con, int stu_ID, int Fees) throws SQLException {
        String mod = "UPDATE student SET Fees ' " + Fees + " 'WHERE stu_ID' " + stu_ID + " ' ";
        PreparedStatement ps = con.prepareStatement(mod);
        ps.executeUpdate();
        System.out.println("Data modified Successfully ");

    }
    public void display(Connection con, int stu_ID) throws SQLException {
        String dis = "select * from student";
        Statement s = con.prepareStatement(dis);
        ResultSet rs=  s.executeQuery(dis);
        while(rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getInt(5));
        }
    }
    public void SHOWALL(Connection con) throws SQLException {
        String Show = "Select * from student";
        Statement s2 = con.prepareStatement(Show);
        ResultSet rs = s2.executeQuery(Show);
        while(rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getInt(5));

        }



    }
