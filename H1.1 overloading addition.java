import java.util.Scanner;

public class overloading1729{
    public int add(int a, int b) {
        return a + b;
    }


    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
    //public class overloading1729{
    public static void main(String[] args) {
        overloading1729 addition = new overloading1729();

        System.out.println("Sum of 2 and 3: " + addition.add(2, 3));
        System.out.println("Sum of 1, 2, and 3: " + addition.add(1, 2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + addition.add(2.5, 3.5));
        
    }
}
