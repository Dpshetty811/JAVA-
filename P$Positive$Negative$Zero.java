import java.util.Scanner;
public class P$Positive$Negative$Zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nwelcome\n");
        System.out.print("\nplease enter the number:");
        int number = input.nextInt();
        if (number>0) {
            System.out.println("\nyour number " + number + " is positive");
        }else if (number<0) {
            System.out.println("\nyour number " + number + " is negative");
        }else {
            System.out.println("\nyour number " + number + " is zero");
        }
    }
}
