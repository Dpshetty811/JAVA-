import java.util.Scanner;

public class N$Compound$Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nwelcome to compound interest calculator");
        System.out.print("\nenter principle amount: ");
        int p = input.nextInt();
        System.out.print("enter time given in years: ");
        int t = input.nextInt();
        System.out.print("enter rate of interest: ");
        int r = input.nextInt();
        int compoundInterest = p*(1+r/100)*t;
        System.out.println("\ncompound interest is : " + compoundInterest);

    }
}
