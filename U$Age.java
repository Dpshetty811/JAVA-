import java.util.Scanner;
public class U$Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to the age segregation\n");
        System.out.print("\nenter your age: ");
        int age = input.nextInt();
        if (age < 13){
            System.out.print("you are in childhood");
        }else if (age < 20 && age >= 13) {
            System.out.println("you are in teenage");
        }else if (age < 60 && age >= 20) {
            System.out.println("you are in adulthood");
        }else {
            System.out.println("you are a senior citizen");
        }
    }
}

