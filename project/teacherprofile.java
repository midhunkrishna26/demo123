package project;

import java.util.List;
import java.util.Scanner;

public class teacherprofile
{
	 static int id=0;
     public teacherprofile(int id) 
     {
		super();
		this.id = id;
	 }
     // display teacher profile
      static void display_profile()
      {
    	  int i;
    	  do
    	  {
    	  operations o=new operations();
    	  staff st=o.teacherdetails(id);
    	  System.out.println("WELCOME"+st.getName());
    	  System.out.println();
    	  System.out.println("      ******************");
    	  System.out.println("1: ADD STUDENT\n2: VIEW BY ID\n3: VIEW ALL STUDENTS\n4: ADD MARK\n5 LOGOUT");
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("ENTER THE OPTION");
    	  i=sc.nextInt();
    		  switch(i)
    		  {
    		  case 1:
    			  addStudent();
    			  break;
    		  case 2:
    			  System.out.println("ENTER THE STUDENT ID");
    			  displayStudentbyid(sc.nextInt());
    			  break;
    		  case 3:
    			  d();
    			  break;
    		  case 4:
    			  addmark();
    			  break;
    		  }
    	  }
    	  while(i!=5);
      }
      // used to display all student details
       static void d()
      {
    	  List<student> li=teacherdb.getAlldata();
    	  for (student sd : li) 
    	  {   
    		  System.out.println("                         *****************************");
    		  System.out.println("STUDENT NAME:"+sd.getName());
        	  System.out.println("APPLICATION NO: "+sd.getApp_no());
        	  System.out.println("DATE OF BIRTH :"+sd.getDod());
        	  System.out.println("EMAIL ID: "+sd.getEmail());
        	  System.out.println("PARENT NAME :"+sd.getGname());
		}
      }
       //get data of the students
      static void addStudent()
      {
    	  student sd=new student();
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("ENTER THE STUDENT NAME:");
    	  sd.setName(sc.next());
    	  System.out.println("ENTER THE APPLICATION NO: ");
    	  sd.setApp_no(sc.nextInt());
    	  System.out.println("ENTER THE DATE OF BIRTH :");
    	  sd.setDod(sc.next());
    	  System.out.println("ENTER THE EMAIL ID: ");
    	  sd.setEmail(sc.next());
    	  System.out.println("ENTER THE PARENT NAME :");
    	  sd.setGname(sc.next());
    	  teacherdb.addStudentindb(sd);
      }
      //display student data by id
      static void displayStudentbyid(int id)
      {
    	  student sd=teacherdb.viewByid(id);
    	  System.out.println("STUDENT NAME:"+sd.getName());
    	  System.out.println("APPLICATION NO: "+sd.getApp_no());
    	  System.out.println("DATE OF BIRTH :"+sd.getDod());
    	  System.out.println("EMAIL ID: "+sd.getEmail());
    	  System.out.println("PARENT NAME :"+sd.getGname());
    	  System.out.println();
      }
      // get mark from the teacher
	 static void addmark() 
	 {
		 System.out.println("ENTER ID OF THE STUDENT");
		 mark m= new mark();
		 Scanner sc=new Scanner(System.in);
		 m.setId(sc.nextInt());
		 System.out.println("ENTER THE MARK OF MAYALAYAM 1 :");
		 m.setM1(sc.nextInt());
		 System.out.println("ENTER THE MARK OF MAYALAYAM 2 :");
		 m.setM2(sc.nextInt());
		 System.out.println("ENTER THE MARK OF HINDI :");
		 m.setM3(sc.nextInt());
		 System.out.println("ENTER THE MARK OF ENGLISH :");
		 m.setM4(sc.nextInt());
		 System.out.println("ENTER THE MARK OF SS :");
		 m.setM5(sc.nextInt());
		 System.out.println("ENTER THE MARK OF PHYSICS :");
		 m.setM6(sc.nextInt());
		 System.out.println("ENTER THE MARK OF CHEMISTRY :");
		 m.setM7(sc.nextInt());
		 System.out.println("ENTER THE MARK OF BIOLOGY:");
		 m.setM8(sc.nextInt());
		 System.out.println("ENTER THE MARK OF MATHS :");
		 m.setM9(sc.nextInt());
		 System.out.println("ENTER THE MARK OF IT :");
		 m.setM10(sc.nextInt());
		 teacherdb.marktodb(m);
	 }
	
}
