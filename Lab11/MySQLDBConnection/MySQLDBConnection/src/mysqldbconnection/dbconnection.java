/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mysqldbconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbconnection
{
    Connection con;
    Statement st;
    dbconnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scdlab10","root","fast123");
            st=con.createStatement();
            System.out.println("MySQL Connected Successfully");
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        dbconnection obj = new dbconnection();
    }
}
