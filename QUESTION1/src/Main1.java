import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        System.out.println("Enter a valid day value: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        dayOfWeek(day);
    }
    public static void dayOfWeek(int day){
        Scanner scanner = new Scanner(System.in);


       String dayOfWeek = switch(day){
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
           default -> "Invalid day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
