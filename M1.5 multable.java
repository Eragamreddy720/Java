import java.util.Scanner;
public class multiplication1729{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter thr table num : ");
        
        int M = input.nextInt();
        System.out.print("Enter no of times : ");
        int N = input.nextInt();
        for(int i=1;i<=N;i++)
        {
            System.out.println(i+" x "+M+" = "+(i*M));
            
        }
    }
}
