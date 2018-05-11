/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightapp;

import java.sql.*;

/**
 *
 * @author star
 */
public class Dbconn {
   
         
public void db(){
    try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test?username=root&password=");
        Statement st = con.createStatement();   
    } catch(Exception e)
    {
    }
}
        }