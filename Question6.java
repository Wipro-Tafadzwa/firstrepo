import java.util.Scanner;


public class Question6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your two numbers");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		for(int i=1; i <=a; i++){
			
			if(i%2==0){
				System.out.println(i+ " ");
			}
		}

	}

}
