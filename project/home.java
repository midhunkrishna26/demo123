package project;

import java.util.Scanner;

public class home 
{
// user menu
	public static void menu()
	{
		int a;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("1 : CREATE ACCOUND \n2 : LOGIN\n3 : EXIT");
		System.out.println("ENTER THE OPTION");
		a=sc.nextInt();
		switch(a)
		{
		case 1:
			data();
			break;
		case 2:
            login();
			break;
		default:
			System.out.println("invaild value");
			break;
		}
		}
		while(a!=3);
	}
	// used to get data to create account
	static void data()
	{
	    Scanner sc= new Scanner(System.in);
	    staff tr=new staff();
	    System.out.println("ENTER YOUR EMPLY ID : ");
	    tr.setEncode(sc.nextInt());
	    System.out.println("ENTER YOUR EMIAL ID : ");
	    tr.setEmail(sc.next());
	    System.out.println("ENTER YOUR NAME : ");
	    tr.setName(sc.next());
	    System.out.println("ENTER YOUR SUBJECT : ");
	    tr.setSub(sc.next());
	    System.out.println("SET PASSWORD :");
	    tr.setPass(sc.next());
	    operations.create_acc(tr);
	}
	// used to get data for login
	public static void login()
    {
	String email,pass;
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER USERNAME");
	email=sc.next();
	System.out.println("ENTER PASSWORD");
	pass=sc.next();
	 operations.checklogin(email,pass);
    }
    public static void main(String[] args) 
    {
		menu();
	}
}
