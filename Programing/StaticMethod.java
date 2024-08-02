package Programing;

class Mobile1 {
	String brand ;
	int price;
	static String name;
	public void show()
	{
		System.out.println(brand + " : " + price + " : " + name);
	}
	public static void main()
	{
		System.out.println("in static method");
	}
}

public class StaticMethod {

	public static void main(String[] args) {   
		Mobile1 obj1 = new Mobile1();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile1.name = "SmartPhone";
		
		Mobile1 obj2 = new Mobile1();
		obj2.brand = "Samsung";
		obj2.price = 1700;
		Mobile1.name = "SmartPhone";
		Mobile1.name = "Phone";
		
		obj1.show();
	//	obj2.show1();
		

	}

}
