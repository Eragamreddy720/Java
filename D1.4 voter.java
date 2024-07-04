import java.util.Scanner;

public class voterR1729{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the age : ");
        int a = input.nextInt();
        if (a > 18){
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Not eligible for vote");
            System.out.println("you are eligible to vote after "+(18-a)+"years");
        }
    }
}
