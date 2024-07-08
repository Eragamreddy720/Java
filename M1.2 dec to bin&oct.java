import java.util.Scanner;
public class decconvert1729{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
    
        int dec=input.nextInt();
        String bin=Integer.toBinaryString(dec);
        String oct=Integer.toOctalString(dec);
        System.out.println("Binary number = "+bin);
        System.out.print("octal number = "+oct);
    }
}
