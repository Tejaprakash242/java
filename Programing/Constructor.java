package Programing;
class Family
{
	private int age;
	private String name;
	public Family()    //default constructor
	{
		age = 18;
		name = "Virat";
	}
	public Family(int a, String n)  
	{
		age  = a;
		name = n;
		
	}
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
 
public class Constructor {

	public static void main(String[] args) {
		Family obj = new Family();
		Family obj1 = new Family( 18,"teja");
		//obj.setAge(30);
		//obj.setName("Reddy");
		System.out.println(obj.getName() +" : " + obj.getAge());
		System.out.println(obj1.getName() +" : " + obj1.getAge());
		

	}

}

