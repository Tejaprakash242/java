package Programing;

class MyClass
{
	int g ;
	int b;
	int t;
	int m ;
	public void branch(int g, int b)
	{
	    t = g + b;
		System.out.println("total students in a branch " + "= " + t);
	}
	public void toppers( int m )
	{
		if(m >= 80)
		{
			System.out.println("He is a Topper");
		}
		else 
			System.out.println("He is not a Topper");
		
	}
}

public class Method1 {
	public static void main(String[] args)
	{
	//int m = 82;
	//int g = 42;
	//int b = 99;
	MyClass myObj = new MyClass();
	myObj.branch(42,99);
	myObj.toppers(19); 
	
	}

}
