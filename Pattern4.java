package Pattern.pyramids;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int no = sc.nextInt();
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		
		
		for (int i = 1; i <= no; i++) {          

			for (int k = no - i; k >= 1; k--) {     
				System.out.print(" ");

			}

			for (int j = 1; j <= 2*i-1; j++) {            
				if(j==1 || i==no || j==2*i-1 ) {
					System.out.print(ch + "");
					}
					else {
						System.out.print(" ");
					}
			}
			System.out.println();

	}

}
}
