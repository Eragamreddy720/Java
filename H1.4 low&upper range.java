import java.util.Scanner;
public class low and up range1729 {
 public static void main(String[] args){
     Scanner input=new Scanner(System.in);
     int lower=input.nextInt();
     int upper=input.nextInt();
     int i=0,x=1;
     while(i<upper)
     {
         int sum=0;
         int y=x*x;
         int t=y;
         while(y!=0)
         {
             int rem=y%10;
             sum=sum+rem;
             y=y/10;
         }
         if(sum<10)
         {
             System.out.print(t+" ");
        }
        i=x*x;
        x++;
     }
 }
}
