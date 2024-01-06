import java.util.Scanner;

public class L$Area$Of$Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nwelcome to the area calculator");
        System.out.print("\nenter breadth in metres: ");
        double b = input.nextDouble();
        System.out.print("enter depth in metres: ");
        double d = input.nextDouble();
        double area = 0.5*b*d;
        System.out.print("\narea of triangle is: " + area);
    }


}
