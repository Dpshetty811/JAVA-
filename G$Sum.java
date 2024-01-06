import java.util.Scanner;

public class G$Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("enter second number; ");
        int secondNumber = input.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("final result: " + sum);
    }
}
