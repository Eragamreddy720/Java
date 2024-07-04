import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter a string to reverse:");
        String name = input.nextLine();

        
        String empty = "";

        int len = name.length();

        
        for (int i = len - 1; i >= 0; i--) {
            
            empty = empty + name.charAt(i);
        }

        
        System.out.print(empty);

        
        input.close();
    }
}
