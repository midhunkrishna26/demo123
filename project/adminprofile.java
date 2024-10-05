package project;

import java.util.Scanner;

public class adminprofile 
{
    static void displayadmin()
    {
    	
    	Scanner sc=new Scanner(System.in);
    	int n;
    	do
    	{
    		System.out.println("--------ADMIN--------");
    		System.out.println();
    		System.out.println("1 : view all students\n2 : view all teachers\n3 : logout");
    		System.out.println("ENTER YOUR OPTION");
    		n=sc.nextInt();
    		switch(n)
    		{
    		case 1:
    			admin_op.viewstudent();
    			break;
    		case 2:
    			admin_op.viewteacher();
    			break;
    	    }
    	}
    	while(n!=3);
    }
}
