package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connect 
	{
	    public static Statement st=null;
//	    create db connection
	    public static Statement createsmt()
	    {
	    	try
	    	{
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	   		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","root"); 
	   	     st=con.createStatement();
	    	}
	    	catch (Exception e)
	    	{
	    		System.out.println(e);
	    	}
	    	return st;
	    }
	}

