package Programing;

class Computer
{
	public void music()
	{
		System.out.println("play music");
	}
	int cast;
	public String getMeAPen(int cast)
	{
		return "pen";
	}
}

public class Method {

	public static void main(String[] args) {
		Computer myObj = new Computer();
		myObj.music();
		
		String str = myObj.getMeAPen(10);
		System.out.println(str);

	}

}
