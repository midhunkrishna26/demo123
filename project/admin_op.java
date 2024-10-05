package project;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class admin_op 
{
   static void viewteacher()
   {
	   try 
	   {
		   Statement st=connect.createsmt();
		   String sql="select teacher.NAME,teacher.SUBJECT,student.NAME from teacher inner join student on teacher.ID=student.teacherid";
		   ResultSet rs=st.executeQuery(sql);
		   while(rs.next())
		   {
			   System.out.println(rs.getString("NAME")+" "+rs.getString("SUBJECT")+" "+rs.getString("student.NAME"));
		   }
	   } 
	   catch (Exception e) 
	   {
		System.out.println(e);
	   }
	   
   }
   public static void viewstudent()
   { 
	   try 
	   {
		   Statement st=connect.createsmt();
		   String sql="select student.NAME,student.DOD,student.G_NAME,mark.mal1 from student inner join mark on student.ID=mark.ID";
	       ResultSet rs=st.executeQuery(sql);
	       System.out.println("NAME   DOB       PARENTNAME   MALAYALAM1");
		   while(rs.next())
		   {
			   System.out.println(rs.getString("NAME")+" "+rs.getString("DOD")+"  "+rs.getString("G_NAME")+"    "+rs.getInt("mal1"));
		   }
		
	   } 
	   catch (Exception e) 
	   {
		System.out.println(e);
	   }
	   
   }
}
