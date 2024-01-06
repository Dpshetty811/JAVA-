import java.util.Scanner;

public class M$Simple$Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nwelcome to interest calculator");
        System.out.print("\nenter the principle amount in lak: ");
        int p = input.nextInt();
        System.out.print("enter the time given in years: ");
        int t = input.nextInt();
        System.out.print("enter the rate in percent: ");
        int r = input.nextInt();
        int simpleInterest = (p*t*r)/100;
        System.out.println("\nsimple interest :" + simpleInterest);


    }
}
