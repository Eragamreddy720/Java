import java.util.Scanner;

public class vowels1729{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+i);
                
            }
            System.out.println();
            
        }
    }
}
