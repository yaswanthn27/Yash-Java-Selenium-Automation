
public class MethodsDemo {

	public static void main(String[] args) {
		
		//calling methods with object  and without object(static)
		
		MethodsDemo d = new MethodsDemo();
		d.getData();
		
		String name = d.getData1();
		System.out.println(name);
		
		getData2();
		
		MethodsDemo2 e = new MethodsDemo2();
		e.getUserData();
		
		String n = e.getUserData1();
		System.out.println(n);
		
		

	}
	
	//Methods
	
	public void getData()
	{
		 System.out.println("Hello world");
	}
	
	public String getData1()
	{
		return "Yash";
	}
	
	public static String getData2()
	{
		System.out.println("Yashu");
		return "rahul";
	}
}
