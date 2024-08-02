package Programing;

public class TernaryOperator {

	public static void main(String[] args) {
		int a = 20;
		int result  = 0;
	/*	if (a%2 == 1)
		      result = 99;
		else 
			result = 100;*/
		result = a%2==0 ? 99:100;
		System.out.println(result);
		
			

	}

}
