import java.util.Scanner;

public class LeftAngledtri1729 {
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter the number of rows :");
        int n = input.nextInt();

      
        for (int i = 1; i <= n; i++) {
            
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }