import java.util.Scanner;
public class sumofarray1729{
    public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      System.out.print("Enter the size : ");
      int n=input.nextInt();
      int [] array=new int[n];
      System.out.print("Enter the elements:");
      int i;
      int sum=0;
      for(i=0;i<n;i++){
          array[i]=input.nextInt();
      }
      for(i=0;i<n;i++){
          sum=sum+array[i];
      }
      System.out.print("The sum = "+sum);

    }
}
