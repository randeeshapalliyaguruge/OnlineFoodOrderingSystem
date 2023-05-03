import java.sql.*;
public class SQLCON {
    
    public static Connection connect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_ordering_system","root","");
            return conn;
            
        }
        catch (Exception e)
        {
            return null;
        }
    }
}
