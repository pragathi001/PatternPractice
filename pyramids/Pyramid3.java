package Pattern.pyramids;

import java.util.Scanner;

public class Pyramid3 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number");
	int no =sc.nextInt();
	System.out.println("Enter the character");
	char ch =sc.next().charAt(0);
	for(int j=no;j>=1;j--) {
		for(int i=j;i<=no;i++) {
			System.out.print(" ");
		}
		for(int k=1;k<=j;k++) {
			System.out.print(ch+" ");
		}
		System.out.println();
	}
	
}
}
