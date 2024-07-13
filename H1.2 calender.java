import java.util.Scanner;
public class calener1729{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
       int num=input.nextInt();
       int years=num/365;
       System.out.println("years: "+years);
       int weeks=num/7;
       System.out.println("weeks: "+weeks);
       int days=num;
       System.out.println("Days: "+days);
    }
}
