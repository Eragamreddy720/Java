import java.util.Scanner;

public class reversenum{
    public static void main (String args[]){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n =input.nextInt();
        int rev=0;
        int rem;
        while(n!=0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println("reversed number = "+rev);
    }
}
