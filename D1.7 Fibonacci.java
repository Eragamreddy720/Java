import java.util.Scanner;

public class Fibonacci1729 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = input.nextInt();
        
        int t1 = 0;
        int t2 = 1;
        
       System.out.print("Fibonacci Series: " + t1 + " " + t2);
        
        for (int i = 3; i <= n; i++) {
            int nextTerm = t1 + t2;
            System.out.print(" " + nextTerm);
            t1 = t2;
            t2 = nextTerm;
        }
       
    }
    
}
