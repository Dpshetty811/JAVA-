import java.util.Scanner;

public class I$Arithmetic$Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to the calculator\n");
        System.out.print("please enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("please enter second number: ");
        int secondNumber = input.nextInt();
        int sum = firstNumber+secondNumber;
        int subtract = firstNumber-secondNumber;
        int multiplication = firstNumber*secondNumber;
        int division = firstNumber/secondNumber;
        int remainder = firstNumber%secondNumber;
        System.out.println("\n\nsum: " + sum);
        System.out.println("subtraction: " + subtract);
        System.out.println("multiplication: " + multiplication);
        System.out.println("division: " + division);
        System.out.println("remainder: " + remainder);
    }
}
