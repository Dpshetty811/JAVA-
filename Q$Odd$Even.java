import java.util.Scanner;
public class Q$Odd$Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nwelcome\n");
        System.out.print("\nenter the number");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("your number " + num + " is even");
        }else {
            System.out.println(" your number is odd");
        }

    }
}
