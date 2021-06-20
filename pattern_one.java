package youtube;
import java.util.Scanner;

public class pattern_one {
	
	public static void main(String[] noah) {
		
		int x;
		
		try(Scanner scan=new Scanner(System.in)){
			
			System.out.print("Enter the number:");
			x=scan.nextInt();
			
			
			for(int i=1;i<=x;i++) {                 //row
				
				for(int j=1;j<=i;j++) {            //column
					
					System.out.print("* ");
					
				}
				System.out.println(" ");
			}
			
		}
		
	}


}