package Programing;

class Humen
{
	private int age;
	private String name;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
}
 
public class ThisKeyword {

	public static void main(String[] args) {
		Humen obj = new Humen();
		obj.setAge(30);
		obj.setName("Reddy");
		System.out.println(obj.getName() +" : " + obj.getAge());
		

	}

}
