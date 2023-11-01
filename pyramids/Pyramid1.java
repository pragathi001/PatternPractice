package Pattern.pyramids;

import java.util.Scanner;

public class Pyramid1 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int no = sc.nextInt();
    for(int i= 1;i<=no;i++) {
    	for(int k= no-i;k>=1;k--) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=i;j++) {
    		System.out.print(i + " ");
    	}
    	System.out.println();
    }
	}

}
