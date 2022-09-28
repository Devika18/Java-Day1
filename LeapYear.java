import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the Year: ");
        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();
        boolean leap;

        //if the year is divided by 4
        if (year % 4 == 0) {

            //if the year is century
            if (year % 100 == 0) {

                //if year is divided by 400, then it is a leap year

                if (year % 400 == 0)
                    leap = true;
                else leap = false;
            }
            //if the year is not century
            else leap = true;
        }

        else
            leap = false;
        if(leap)
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is not Leap Year");

    }
}
