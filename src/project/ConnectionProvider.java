/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
/**
 *
 * @author MOOLA
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection oon=DriverManager.getConnection("jdbc:mysql://localhost:3306/newstudent","root","Pro@2003");
             return oon;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}
