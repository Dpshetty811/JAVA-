import java.util.Scanner;

public class Za$Right$Shift$Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nwelcome to RSO\n");
        System.out.print("enter first number: ");
        int x = input.nextInt();
        System.out.print("enter second number: ");
        int y = input.nextInt();
        int right$Shift$Operator = x >> y;
        System.out.println("final result: " + right$Shift$Operator);
    }
}
