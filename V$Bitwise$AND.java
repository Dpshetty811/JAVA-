import java.util.Scanner;

public class V$Bitwise$AND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nwelcome\n");
        System.out.print("enter first number: ");
        int n1 = input.nextInt();
        System.out.print("enter second number: ");
        int n2 = input.nextInt();
        int bitwiseAnd = n1 & n2;
        System.out.println("\nfinal result: " + bitwiseAnd);
    }
}
