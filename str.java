package l5;

public class str 
{
	public static void main(String[] args) 
	{
		String name="  midhun hello";
		String name1="mi,dh/un";
	System.out.println(name.isEmpty());	
	System.out.println(name.trim());
	System.out.println(name.contains("dh"));
	System.out.println(name.replace("hello","world"));
	System.out.println(name.split(" "));
	System.out.println(name.equals(name1));
}
}
