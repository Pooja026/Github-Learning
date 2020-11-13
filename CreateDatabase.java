package com.jspiders.jdbc.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class CreateDatabase
{

	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
       try 
       {
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		
		String dburl="jdbc:mysql://localhost:3306";
		String user="root";
		String password="root";
		
		con = DriverManager.getConnection(dburl, user, password);
		
		String query= " Create database DesaiFamily ";
		
		stmt = con.createStatement();
		
		int res = stmt.executeUpdate(query);
		
		if(res!=0)
		{
			System.out.println("Database Created");
		}
	} 
       catch (SQLException e) 
       {
		e.printStackTrace();
	   }
       finally
       {
    	   try
    	   {
    		  if(con!=null)
    		  {
    			  con.close();
    		  }
    		  if(stmt!=null)
    		  {
    			  stmt.close();
    		  }

    	   }
    	   catch (SQLException e) 
           {
    		e.printStackTrace();
    	   }

       }
	}

}
