
import java.util.Scanner;


		public class Question7 {

			public static void main(String[] args) {
				Scanner scanner=new Scanner(System.in);
				
				System.out.println("Enter your two numbers");
				
				int a = scanner.nextInt();
				int b = scanner.nextInt();

				
				for(int i=1; i <=a; i++){
					
					if(i%a==0)
				    if(i%b==0){
						System.out.println(i+ " ");
					}
				}

			}

		}