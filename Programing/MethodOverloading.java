package Programing;
class CalculaterAdd
{
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public int add(int a,int b)
	{
		return a-b;
	}
	public double add(double a,int b)
	{
		return a+b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		CalculaterAdd obj = new CalculaterAdd();
		int result = obj.add(4, 14,1 );
		System.out.println(result);

	}

}
