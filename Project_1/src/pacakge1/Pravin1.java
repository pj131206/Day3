package pacakge1;
 //---{}-----boundry(body) of the class
public class Pravin1
{
	int a;  // it will store int value
	
	public void abc() // () indicate this is a method
	{
		// boundary of the method(method name---abc) 
		System.out.println("welocom to all of you");
	}
	public static void main(String[] args) //
	{
		// this is the boundary of the main method
		Pravin1 ob=new Pravin1();
		ob.abc(); // reference_variable.method  name(); Piller No.4
		ob.abc();
		ob.a=223;
		System.out.println("Value of a"+ob.a);
		ob.a=445;
		System.out.println("value of a"+ob.a);
		System.out.println("code sharing done");
		System.out.println("again");
		
	}
}
