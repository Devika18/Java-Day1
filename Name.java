import java.util.Scanner;

public class Name {
    public static void main (String[] args) {
        System.out.println("Enter Your Name: ");
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        System.out.println("Your Name is: " + name);
    }

}
