package Programing;

class Substraction
{
	int r;
	//int r = a + b;
	public int sub(int a, int b)
	{
		int r = a - b;
		System.out.println("sub"+" = "+ r);
		return 0;
	}
}

public class ClassAndObject1 {
	public static void main(String[] args)
	{
		//int a = 99;
		//int b = 71;
		
		Substraction myObj = new Substraction();
	    myObj.sub(99,81);
	}

}
