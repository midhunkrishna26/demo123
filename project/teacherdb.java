package project;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class teacherdb
{
	//add data of student to db
 public static void addStudentindb(student sd)
 {
	 try 
	 {
		int id=0;
		Statement st=connect.createsmt();
		String sql="insert into student(APP_NO,NAME,DOD,GMAIL,G_NAME,teacherid) values("+sd.getApp_no()+",'"+sd.getName()+"','"+sd.getDod()+"','"+sd.getEmail()+"','"+sd.getGname()+"',"+teacherprofile.id+")";
	    if(st.executeUpdate(sql)==1)
	    {
	    	System.out.println("successfully created");
	    		sql="select max(ID) from student";
	    		ResultSet rs=st.executeQuery(sql);
	    		while(rs.next())
	    		{
	    			id=rs.getInt("max(ID)");
			    }
	    		if(id>0)
	    		{
	    			sql="insert into login values("+id+",'"+sd.getEmail()+"','"+sd.getDod()+"','student')";
	    			if(st.executeUpdate(sql)==1);
	    			{
	    				System.out.println("******LOGIN CREATED SUCCEEFULLY********");
	    			}
	    		}
	    }
	 } 
	 catch (Exception e) 
	 {
		System.out.println(e);
	 }
 }
 //get data by id from db
     public static student viewByid(int id)
     {
    	 student sd=new student();
    	 try 
    	 {
			Statement st=connect.createsmt();
			String sql="select * from student where ID="+id;
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
			  sd.setApp_no(rs.getInt("APP_NO"));
			  sd.setDod(rs.getString("DOD"));
			  sd.setEmail(rs.getString("GMAIL"));
			  sd.setGname(rs.getString("G_NAME"));
			  sd.setName(rs.getString("NAME"));
			}
		 } 
    	 catch (Exception e) 
    	 {
			System.out.println(e);
		 }
    	 return sd;
     }
     // get details of the all students
          public static List<student> getAlldata()
     {
        	  List<student> list=new ArrayList<student>();

    	 try 
    	 {
    		 
			Statement st=connect.createsmt();
			String sql="select * from student where teacherid="+teacherprofile.id;
			System.out.println(teacherprofile.id);
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				student sd=new student();
				  sd.setApp_no(rs.getInt("APP_NO"));
				  sd.setDod(rs.getString("DOD"));
				  sd.setEmail(rs.getString("GMAIL"));
				  sd.setGname(rs.getString("G_NAME"));
				  sd.setName(rs.getString("NAME"));
			      list.add(sd);
			}
		 } 
    	 catch (Exception e) 
    	 {
			System.out.println(e);
		 }
    	 
    	 return list;
     }
          // add mark to db
     public static void marktodb(mark m)
     {
    	 try
    	 {
			Statement st=connect.createsmt();
			String sql="insert into mark values("+m.getId()+","+m.getM1()+","+m.getM2()+","+m.getM3()+","+m.getM4()+","+m.getM5()+","+m.getM6()+","+m.getM7()+","+m.getM8()+","+m.getM9()+","+m.getM10()+","+teacherprofile.id+")";		
			if(st.executeUpdate(sql)==1)
			{			System.out.println("MARK IS UPDATED");
			}
		 } 
    	 catch (Exception e) 
    	 {
			System.out.println(e);		
		 }
     }
}

