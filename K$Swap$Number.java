import java.util.Scanner;

public class K$Swap$Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to swap station\n\n");
        System.out.print("enter value of A: ");
        int a = input.nextInt();
        System.out.println("enter value of B: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b= c;
        System.out.println("swapping done...");
        System.out.println("value of A is: " + a);
        System.out.println("value of B is: " + b);




    }
}
