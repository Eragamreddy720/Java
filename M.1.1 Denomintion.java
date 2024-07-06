import java.util.Scanner;

public class Denomination1729{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the no.of 2000 notes : ");
        int d1=input.nextInt();
        System.out.print("Enter the no.of 500 notes : ");
        int d2=input.nextInt();
        System.out.print("Enter the no.of 200 notes : ");
        int d3=input.nextInt();
        System.out.print("Enter the no.of 100 notes : ");
        int d4=input.nextInt(); 
        int Total=(2000*d1)+(500*d2)+(200*d3)+(100*d4);
         System.out.print("Total Available Balance in ATM: "+Total);

    }
    
}
