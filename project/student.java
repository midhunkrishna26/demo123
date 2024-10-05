package project;

public class student 
{
   private String name,email,dod,gname;
   private int app_no;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDod() {
	return dod;
}
public void setDod(String dod) {
	this.dod = dod;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public int getApp_no() {
	return app_no;
}
public void setApp_no(int app_no) {
	this.app_no = app_no;
}
public student(String name, String email, String dod, String gname, int app_no) {
	super();
	this.name = name;
	this.email = email;
	this.dod = dod;
	this.gname = gname;
	this.app_no = app_no;
}
public student() {
	super();
	// TODO Auto-generated constructor stub
}
   
}
