package Programing;

class Mobile
{
	String brand ;
	int price;
	static String name;
	public void show()
	{
		System.out.println(brand + " : " + price + " : " + name);
	}
	
}// Here given static is the variable is no change.

public class StaticVariable {

	public static void main(String[] args) {
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile.name = "SmartPhone";
		
		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 1700;
		Mobile.name = "SmartPhone";
		Mobile.name = "Phone";
		
		obj1.show();
		obj2.show();
		
		
	

	}

}
