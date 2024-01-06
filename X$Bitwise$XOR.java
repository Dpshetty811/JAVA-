import java.util.Scanner;

public class X$Bitwise$XOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nwelcome to XOR\n");
        System.out.print("enter first number: ");
        int x = input.nextInt();
        System.out.print("enter second number: ");
        int y = input.nextInt();
        int bitwiseXor = x ^ y;
        System.out.print("\nfinal result: " + bitwiseXor);
    }

}
