import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		
		int[] arr2 = {1,2,3,4,5,7,8,9,10,11,12};
		
		//conditional statements
		//check if array has multiple of 2
		
		for(int i=0; i<arr2.length;i++)
		{
			if(arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				
			}
			else
			{
				System.out.println(arr2[i]+" is not multiple of 2");
			
			}
			
		}
		
		//Array list
		//create object of the class - object.method
		ArrayList<String> a = new ArrayList();
		a.add("rahul");
		a.add("Yash");
		a.add("anvi");
		a.remove(2);
		System.out.println(a.get(1));
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("********");
		for(String val:a)
		{
			System.out.println(val);
		}
		
		//item is present in array list
		System.out.println(a.contains("rahul"));
		
		String[] name = {"yash", "anvi","selenium",};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("anvi"));
		

	}

}
