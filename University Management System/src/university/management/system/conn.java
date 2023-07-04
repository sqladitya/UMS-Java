package university.management.system;
import java.sql.*;

/**
 *
 * @author Aditya Anand
 * @github sqladitya
 */
public class conn { 
    Connection c;
    Statement s;
    
    conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem", "USERANME","PASSWORD");
            s= c.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
