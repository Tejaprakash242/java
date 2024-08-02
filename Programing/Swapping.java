package Programing;

public class Swapping {

	public static void main(String[] args) {
		int a = 10 ,b = 20;
		System.out.println("Before swapping is "+ a + " " + b);
		/*int t = a;
		a = b;
		b = t;*/
		// using + and - 
		/*a = a+b;
		b = a-b;
		a = a-b;*/
		// using * and /
		a = a*b ;
		b = a/b;
		a = a/b;
		
	
		
		
		System.out.println("After swapping is "+ a  +" "+ b);

	}

}
