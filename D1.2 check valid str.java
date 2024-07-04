import java.util.Scanner;

public class CheckValidString {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        String s1 = input.nextLine();

        
        String s2 = input.nextLine();

     
        if(s1.equals(s2)) {
            System.out.println("Username valid");
        } else {
            System.out.println("Username invalid");
        }

      
        input.close();
    }
}

