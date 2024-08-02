package Programing;
import java.util.Scanner;
public class Hello 
{
	
	public static void main(String[] args)
	{
		int num = 370;
		int temp = num;
		int r,sum=0;
	
		while(num>0 )
		{
			r = num%10;
			num =num/10;
			sum = sum +r*r*r;
		}
		if (temp==sum)
			System.out.println("its armstrong number");
		
		else
			System.out.println("its not armstrong number");
        /*  int a=10,b =20;5
		        int c = a;
		        a =b;
		        b=c;
		Scanner lcm = new Scanner(System.in) ;
			int a = lcm.nextInt();
			int b = lcm.nextInt();
			int temp = 0;
			for(int i=1;i<=a;i++)
			{
			    if(a%i==0 && b%i==0)
			    temp =i;
			}
			System.out.println(temp);
		}

   // System.out.println("After swapping a is" + a);
   // System.out.println("After swagpping b is" + b);*/
	/*	int flag =0;
	Scanner in = new Scanner(System.in);
	System.out.println("enter the minimum value :");
	int min = in.nextInt();
	System.out.println("enter the maximum value :");
	int max = in.nextInt();
	for(int i = min;i<=max; i++)
	{
		for (int j =2;j<i;j++)
		{
			if (i%j == 0)
			{
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print(i + " ");
		}
		flag = 0;
	}*/
		
	}
}
	
	

