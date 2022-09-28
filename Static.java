//Java program to demonstrate static variables, methods, and blocks.

public class Static {

    //This is static variables
    static int n;
    static  String s;

    //This is a static block
    static
    {
        n = 18;
        s = "I Am Devika";
    }

    //This is static method
    public static void main(String[] args) {
        System.out.println("Number is: "+ n);
        System.out.println("String is: "+ s);
    }
}
