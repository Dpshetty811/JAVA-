import java.util.Scanner;
public class R$Greatest$Of$Three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to great of 3");
        System.out.print("\nenter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("enter second number: ");
        int secondNumber = input.nextInt();
        System.out.print("enter third number: ");
        int thirdNumber = input.nextInt();
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber){
            System.out.println(firstNumber + " is the greatest of three numbers");
        }else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println(secondNumber + " is the greatest of three numbers");
        }else {
            System.out.println(thirdNumber + " is the greatest of three numbers");
        }
    }
}
