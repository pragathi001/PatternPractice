import java.util.Scanner;
import java.lang.Math;
public class pattern1{
    public static void main(String args[]){
        int a , i, j,b ;
        Scanner my_scanner = new Scanner(System.in);
        System.out.print("Enter the size : ");
        a = my_scanner.nextInt();
        System.out.println();
        b = 2 * a - 1;
        for( i = 1; i <= b; i++)
        {
            System.out.print("* ");

            for( j = 1; j <= b; j++)
            {
                System.out.print(Math.max(Math.abs(i -a), Math.abs(j - a)) + 1 + "");
            }

            System.out.print(" ");
            System.out.println("*");
        }
    }
}