import java.util.Scanner;

public class H$Perimeter$Of$Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the perimeter calculator");
        System.out.print("\nenter the length one dimension: ");
        int lengthOne = input.nextInt();
        System.out.print("\nenter the length two dimension: ");
        int lengthTwo = input.nextInt();
        System.out.print("\nenter the length three dimension: ");
        int lengthThree = input.nextInt();
        System.out.print("\nenter the length four dimension: ");
        int lengthFour = input.nextInt();
        int perimeter = lengthOne+lengthTwo+lengthThree+lengthFour;
        System.out.print("\nthe perimeter of rectangle is: " + perimeter);
    }
}
