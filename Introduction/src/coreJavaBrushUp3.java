
public class coreJavaBrushUp3 {

	public static void main(String[] args) {
		
		//string is an object or string literal
		
		String s1 = "Rahul Shetty Academy";
		String s5 = "hello";
		
		//new
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		//splitting a string 
		
		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
		System.out.println(splittedString[0]);
		
		//System.out.println(splittedString[0]);
		//System.out.println(splittedString[1]);
		//System.out.println(splittedString[2]);
		System.out.println(splittedString[1].trim());
		
		//printing characters and reversing it
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		} 
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
