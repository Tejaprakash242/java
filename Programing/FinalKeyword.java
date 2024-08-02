package Programing;


class calc
{
	public void show()
	{
		System.out.println("in A show");
		
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		//final keyword is in variable,method,class
		final int num;
		num = 18;
		System.out.println(num);
		calc obj = new calc();
		obj.show();
		obj.add(2,16);

	}

}
