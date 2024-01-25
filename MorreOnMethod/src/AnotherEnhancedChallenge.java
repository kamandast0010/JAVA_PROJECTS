public class AnotherEnhancedChallenge {
    public static void main(String[] args) {
    printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
    }
//    public static void printDayOfWeek(int day){
//      String dayOfWeek = switch(day){
//          case 0 -> "Sunday";
//          case 1 -> "Monday";
//          case 2 -> "Tuesday";
//          case 3 -> "Wednesday";
//          case 4 -> "Thursday";
//          case 5 -> "Friday";
//          case 6 -> "Saturday";
//          default -> "Invalid Day...";
//      };
//        System.out.println(dayOfWeek);
//    }

    //TRADITIONAL SWITCH
//    public static void printDayOfWeek(int day){
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid Day...");
//        }
//    }

    public static void printDayOfWeek(int day){
        String dayofWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friiday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day + " stands for " + dayofWeek);
    }
}
