package project_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Project_db {

    public static void main(String[] args) {

    }
    
    
    private static void insert(int carID, String Make,String Model,int BasePrice, int Year ,String Availability){
        Connection con =DbConnection.connect();
        PreparedStatement ps = null;
        
        try{
            String sql = "INSERT INTO CarTable(carID,Make,Model,Year,BasePrice,Availability) VALUES (?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1,carID );
            ps.setString(2, Make);
            ps.setString(3, Model);
            ps.setInt(4, BasePrice);
            ps.setInt(5, Year);
            ps.setString(6,Availability);
            ps.execute();
            System.out.println("Data has been inserted!");
        }catch(SQLException e){
            System.out.println(e.toString());
        }
   
}

}
