import java.util.Scanner;
public class salarybonus1729{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        double bonus=0;
        System.out.print("Enter the grade of the employee :");
        char a1=input.next().charAt(0);
        System.out.print("Enter the salary of employee :");
        int b1=input.nextInt();
        if(a1=='A')
        {
            bonus=b1*(0.05);
            if(b1<10000)
            {
                bonus=bonus+b1*(0.02);
                
            }
            System.out.println("salary = "+b1);
            System.out.println("bonus = "+bonus);
            System.out.println("total to be paid ="+(b1+bonus));
            
        }
        else if(a1=='B')
        {
            bonus=b1*(0.1);
            if(b1<10000)
            {
                bonus=bonus+b1*(0.02);
                
            }
            System.out.println("salary = "+b1);
            System.out.println("bonus = "+bonus);
            System.out.println("total to be paid ="+(b1+bonus));
            
        }
        else {
            System.out.print("Enter valid grade");
            
        }
    }
}
