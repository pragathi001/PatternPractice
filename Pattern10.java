package Pattern.pyramids;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int no = sc.nextInt(); 
		
		System.out.println("Enter the symbol : ");
		char ch = sc.next().charAt(0);
		
		for(int i=1;i<=no;i++) {
			
			for(int j=1;j<=no+1-i;j++) {
				System.out.print(ch);
			}
			
			for (int k=1; k<= 2*i-2 ;k++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=no+1-i;j++) {
				System.out.print(ch);
			}
			
	System.out.println();
}
		
		for(int i=no;i>=1;i--) {
			
			for(int j=1;j<=no+1-i;j++) {
				System.out.print(ch);
			}
			
			for (int k=1; k<= 2*i-2 ;k++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=no+1-i;j++) {
				System.out.print(ch);
			}
			
	System.out.println();
}
	}

}
