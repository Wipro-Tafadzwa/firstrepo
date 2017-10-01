import java.util.Scanner;

	
	public class Question3 {
	
		public static void main(String[] args) {
		
		
		    
		String a = "Hello";
		String b = "World";
			String concat=a.concat(b);
			
			String reverse = new StringBuffer(b).reverse().toString();
			String rev = reverse.toString();
			
			System.out.println(concat);
			concat=b+a;
			System.out.println("The concatenated string is: " + a + " "+ rev);
	
		
	
		}
	
	}
		   