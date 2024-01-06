import java.util.Scanner;

public class O$Fahrenheit$To$Celsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nwelcome to fahrenheit to celsius convertor");
        System.out.print("\nenter the temperature in fahrenheits: ");
        int f = input.nextInt();
        int degreeCelsius = (f-32)*5/9;
        System.out.println("the degree celsius is : " + degreeCelsius);
    }
}
