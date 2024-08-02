package Programing;

class Division
{
	int h;
	public int divide(int a, int b)
	{
		int  r =  a/b;
		System.out.println("divide the a and b " + "= " + r);
		return 0;
	}
}


public class ClassAndObject3 {

	public static void main(String[] args) 
	{
		int a = 12;
		int b = 2;
		Division myObj = new Division();
		myObj.divide(12,2);

	}

}
