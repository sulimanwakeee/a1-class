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
public class MysqlCon {
    public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
//here sonoo is the database name, root is the username and root is the password
Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from Students");

while(rs.next())
System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4));

con.close();

}catch(Exception e){ System.out.println(e);}

}
    public class dbConnect{
        public void Db(){
  try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test?username=root&password=");
        Statement st = con.createStatement();   
    }catch(Exception e){}
        
        }
}}
