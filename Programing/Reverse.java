package Programing;

public class Reverse {

	public static void main(String[] args) {
		int num = 1234; //123 //12 //1
		int rev = 0;//4 //43 //432
		while(num!=0)
		{
			rev = rev*10 + num%10;  //0*10+1234%10=4 // 4*10 + 123%10 =43 // 43*10+2=432 //432*10+1
			num = num/10;  //1234/10  //123/10=12 // 1
		}
		System.out.println(rev);

	}

}
