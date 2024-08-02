package Programing;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		/*System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("entered integer is : " + num);*/
		
		//using Scanner for getting input from the user
		
		/*Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println("Enter a string :" + s);
		int a = in.nextInt();
		System.out.println("Enter a integer :" + a);
		float b = in.nextFloat();
		System.out.println("Enter a float :" + b);*/
		
		//multiplication of two float number
		
		/*
		float f1 = 2.4f;
		float f2 = 4.6f;
		float t = f1*f2;
		System.out.println("Multiple of two float number :" +t);
		*/
		//Swapping two numbers
		
		/*int a= 10,b =20;
		int c = a+b;
		a = b;
		b = c-b;
		
		System.out.println(" Enter before Swapping number a is :" +a);
		System.out.println(" Enter before Swapping number b is :" + b);*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number a :");
		String a = sc.next();
		System.out.println("Enter a binary number b :");
		String b = sc.next();
		int x = Integer.parseInt(a,2);
		int y = Integer.parseInt(b,2);
		int z = x+y;
		System.out.println("x : "+Integer.toBinaryString(x));
		System.out.println("y : "+Integer.toBinaryString(y));
		System.out.println("z : "+Integer.toBinaryString(z));*/
		int real,image;
		public ComplexNumber(int r,int i) {
			this.real = r;
			this.image = i;
		}
		public void showc()
		{
			System.out.println(this.real + " +i"+this.image);
		}
		public static ComplexNumber add(ComplexNumber n1,ComplexNumber n2)
		{
			ComplexNumber res = new ComplexNumber(0,0);
			res.real = n1.real + n2.real;
			res.image = n1.image+ n2.image;
			return res;
		}
		public static void main(String arg[])
		{
			ComplexNumber c1 = new ComplexNumber(4,5);
			ComplexNumber c2 = new ComplexNumber(10,5);
			System.out.println("first Complex number: ");
			c1.showc();
			System.out.println("second Complex number: ");
			c2.showc();
			ComplexNumber res = add(c1,c2);
			System.out.println("addition is :");
			res.showc();
		
		}
		
	}
}
