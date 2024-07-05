import java.util.Scanner;

public class factorial1729{
    public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int fact=1;
    for(int i=1;i<=n;i++)
    {
        fact=fact*i;
        
    }
    System.out.print("Factorial = "+fact);
    
}
}
