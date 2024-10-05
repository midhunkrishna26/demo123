package project;

import java.util.Scanner;

public class studentprofil 
{
   public studentprofil(int s_id) {
		super();
		this.s_id = s_id;
	}

 static int s_id;
  //display students details
 static void displaystudent()
 {
	 student sd=studentdb.getStudent();
	 System.out.println("WELCOME "+sd.getName());
	 System.out.println("DOB :"+sd.getDod());
	 System.out.println("EMAIL ID :"+sd.getEmail());
	 System.out.println("PARENT NAME : "+sd.getGname());
	 System.out.println();
	 Scanner sc=new Scanner(System.in);
	 int n;
	 do
	 {
		 System.out.println("1 : VIEW MARK\n2 : LOGOUT");
		 System.out.println("ENTER THE OPTION ");
		 n=sc.nextInt();
		 switch(n)
		 {
		 case 1:
			 viewmark();
			 break;	 
		 }
	 }
	 while(n!=2);
	 
 }
 //display mark of student
 static void viewmark()
 {
	 mark m=studentdb.getMark();
	 System.out.println("MAYALAYAM 1 :"+m.getM1());
	 System.out.println("MAYALAYAM 2 :"+m.getM2());
	 System.out.println("HINDI :"+m.getM3());
	 System.out.println("ENGLISH :"+m.getM4() );
	 System.out.println("SS :"+m.getM5());
	 System.out.println("PHYSICS :"+m.getM6());
	 System.out.println("CHEMISTRY :"+m.getM7());
	 System.out.println("BIOLOGY:"+m.getM8());
	 System.out.println("IT :"+m.getM9());
	 System.out.println("MATH :"+m.getM10());
 }
}
