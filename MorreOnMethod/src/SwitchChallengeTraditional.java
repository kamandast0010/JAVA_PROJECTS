import java.util.Scanner;

public class SwitchChallengeTraditional {
    public static void main(String[] args) {
        Scanner dayOfWeek = new Scanner(System.in);
        System.out.println("Enter the value :");
        mainChallenge(dayOfWeek.nextInt());
    }

    public static void mainChallenge(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day...");
        }
    }
//    public static void switchChallenge(int day){
//        String dayOfWeek = switch(day){
//            case 0 -> "Sunday";
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> "Wednesday";
//            case 4 -> "Thursday";
//            case 5 -> "Friday";
//            case 6 -> "Saturday";
//            default -> "Invalid day";
//
//        };
//    }
}
