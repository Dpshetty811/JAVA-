import java.util.Scanner;
public class J$Product$Of$Float {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the product calculator");
        System.out.print("enter first number: ");
        float firstNumber = input.nextFloat();
        System.out.print("enter second number: ");
        float secondNumber = input.nextFloat();
        float product = firstNumber*secondNumber;
        System.out.print("product is: " + product);
    }
}
