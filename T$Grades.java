import java.util.Scanner;
public class T$Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nwelcome to the grade calculator");
        System.out.print("\nenter your percentage: ");
        float p = input.nextFloat();
        if (p >= 90) {
            System.out.print("your grade is A");
        }else if (p >= 75 && p < 90) {
            System.out.print("your grade is B");
        }else if (p >= 60 && p < 75) {
            System.out.print("your grade is C");
        }else if (p >= 30 && p < 60){
            System.out.print("your grade is D");
        }else {
            System.out.print("your grade is F");
        }
    }
}


