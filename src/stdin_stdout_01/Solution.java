// 3rd April, 2023

package stdin_stdout_01;
import java.util.Scanner;

public class Solution {
 
    public static void main(String args[]) {
         Scanner scanner = new Scanner(System.in);
         int num1, num2, num3;
 
         // nextInt() reads the next integer from the user
         num1 = scanner.nextInt();
 
         num2 = scanner.nextInt();
 
         num3 = scanner.nextInt();
 
         scanner.close(); // close the scanner
 
         // print the number
         System.out.println(num1);
         System.out.println(num2);
         System.out.println(num3);
 
     }
 }
 
