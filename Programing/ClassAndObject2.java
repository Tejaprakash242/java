package Programing;

class Multiplication
{
	int r;
	public int multiple(int a, int b) 
	{
		int r = a*b;
		System.out.println("multiple of a and b " + "= " + r);
		return 0;
	}
}

public class ClassAndObject2 {

	public static void main(String[] args) 
	{
		
		//int a = 18;
		//int b = 99;
		Multiplication myObj = new Multiplication();
		myObj.multiple(18,99);
		
		

	}

}
