import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        calculateAge(true);
    }

    public static void calculateAge(boolean isAge) {
        while (isAge) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Current Year: ");
            int currentYear = scanner.nextInt();
            System.out.println("Enter Birth Year: ");
            int birthYear = scanner.nextInt();
            if (currentYear >= 2023) {
                int age = currentYear - birthYear;
                System.out.println("Your are " + age + " Years Old");
                break;
            } else {
                System.out.println("Sorry Please Enter the Current Year...");
            }
        }
    }
}
