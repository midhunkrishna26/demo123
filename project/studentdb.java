
package project;

import java.sql.ResultSet;
import java.sql.Statement;

public class studentdb 
{
	//get data of the student by id from db
   static student getStudent()
   {
	   student sd=new student();
	 try
	 {
		Statement st=connect.createsmt();
		String sql="select * from student where ID="+studentprofil.s_id;
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			sd.setApp_no(rs.getInt("APP_NO"));
			sd.setDod(rs.getString("DOD"));
			sd.setName(rs.getString("NAME"));
			sd.setEmail(rs.getString("GMAIL"));
			sd.setGname(rs.getString("G_NAME"));
		}
	 } 
	 catch (Exception e)
	 {
		System.out.println(e);
	 } 
	 return sd;
   }
   // get mark from the db
   static mark getMark()
   {
	   mark m=new mark();
	   try 
	   {
		    Statement st=connect.createsmt();
		    String sql="select * from mark where ID="+studentprofil.s_id;
		    ResultSet rs=st.executeQuery(sql);
		    while(rs.next())
		    {
		    	m.setM1(rs.getInt("mal1"));
		    	m.setM2(rs.getInt("mal2"));
		    	m.setM3(rs.getInt("hindi"));
		    	m.setM4(rs.getInt("eng"));
		    	m.setM5(rs.getInt("ss"));
		    	m.setM6(rs.getInt("phy"));
		    	m.setM7(rs.getInt("che"));
		    	m.setM8(rs.getInt("bio"));
		    	m.setM9(rs.getInt("it"));
		    	m.setM10(rs.getInt("maths"));
		    }
		    
	   }
	   catch (Exception e) 
	   {
		System.out.println(e);
	   }
	   return m;
   }
}
