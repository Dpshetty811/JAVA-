import java.util.Scanner;

public class Y$Bitwise$Compliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nwelcome to Bitwise$Compliment\n");
        System.out.print("enter the number: ");
        int x = input.nextInt();
        int bitwise$Compliment = ~x;
        System.out.println(" final result: " + bitwise$Compliment);
    }
}
