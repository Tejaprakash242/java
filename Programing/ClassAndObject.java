package Programing;

class Calculater {
	int a;
	public int add(int n1, int n2)
	{
		int r = n1 + n2 ;
		return r;
	}
	} 

public class ClassAndObject {


	public static void main(String[] args) {
		int n1 = 99;
		int n2 = 71;
		 Calculater myObj = new Calculater();
		 int result = myObj.add(99,71);
		 System.out.println(result);
		
	

	}

}
