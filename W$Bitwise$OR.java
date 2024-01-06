import java.util.Scanner;

public class W$Bitwise$OR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nwelcome\n");
        System.out.print("enter first number: ");
        int x = input.nextInt();
        System.out.print("enter second number: ");
        int y = input.nextInt();
        int bitwiseOr = x | y;
        System.out.println("result:" + bitwiseOr);
    }
}
