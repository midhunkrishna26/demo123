package project;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Result;

public class operations 
{
	// used to update teacter table in db
	 public static void create_acc(staff tr)
	    {
	   	    try 
	   	    {
     	    	int id=0;
	   	    	Statement st=connect.createsmt();
	   	    	String sql="insert into teacher(NAME,ENCODE,PASSWORD,ROLE,EMAIL,SUBJECT) value('"+tr.getName()+"',"+tr.getEncode()+",'"+tr.getPass()+"','teacher','"+tr.getEmail()+"','"+tr.getSub()+"')";
	   	    	if(st.executeUpdate(sql)==1)
	   	    	{
	   	    		System.out.println("successfully created");
	   	    		sql="select max(ID) from teacher";
	   	    		ResultSet rs=st.executeQuery(sql);
	   	    		while(rs.next())
	   	    		{
	   	    			id=rs.getInt("max(ID)");
					}
	   	    		if(id>0)
	   	    		{
	   	    			sql="insert into login values("+id+",'"+tr.getEmail()+"','"+tr.getPass()+"','teacher')";
	   	    			if(st.executeUpdate(sql)==1);
	   	    			{
	   	    				System.out.println("             LOGIN CREATED SUCCEEFULLY");
	   	    			}
	   	    		}
	   	    	}
	   	    }
	   	    catch (Exception e) 
	   	    {
			  System.out.println(e);
			}
	    }
	 // get teacher data from data base
	    public static staff teacherdetails(int id)
	    {
	    	staff s=new staff();
	       try 
	       {
			Statement st=connect.createsmt();
			String sql="select * from teacher where id="+id;
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next())
			{
				s.setEmail(rs.getString("EMAIL"));
				s.setName(rs.getString("NAME"));
				s.setSub(rs.getString("SUBJECT"));
				s.setEncode(rs.getInt("ENCODE"));
			}
		   }
	       catch (Exception e)
	       {
			
		   }
	       return s;
	    }
	    //used to check login
    	public static void checklogin(String email, String pass)
	        {
    		String role="";
			int id=0;
		   try 
		   {
			 Statement st=connect.createsmt();
			 String sql="select id,ROLE from login where GMAIL='"+email+"' and PASSWORD='"+pass+"'";
			 ResultSet rs=st.executeQuery(sql);
			 while(rs.next())
			 {
			     id=rs.getInt("id");
				 role=rs.getString("ROLE");
			 }
			 if(id>0)
			 {
			 switch(role)
			 {
			 case "teacher":
		         teacherprofile tp=new teacherprofile(id);
				 tp.display_profile();
				 break;
			 case "student"	:
				 studentprofil sd=new studentprofil(id);
				 sd.displaystudent();
			     break;
			 case "admine":
				 adminprofile.displayadmin();
				 break;
		     }
			 }
			 else
			 {
				 System.out.println("INVALID USER NAME AND PASSWORD");
			 }
			 }
		   
		   catch (Exception e) 
		   {
		      System.out.println("error");
		   }
	        }
}
