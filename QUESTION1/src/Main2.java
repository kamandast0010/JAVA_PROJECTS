public class Main2{
    public static void main(String[] args) {
        /*
        * if we forget to put a break statement in a switch statement will result to an overlap and the remaining cases
        * will also be printed because there is no break satement to terminate the program when the condition is met
        * --------------------------------EXAMPLE--------------------------------------
        * */
        dayOfWeek(1);
    }
    public static void dayOfWeek(int day){
        switch(day){
            case 1:
                System.out.println("Sunday");
                // break;
            case 2:
                System.out.println("Monday");
                // break;
            case 3:
                System.out.println("Tuesday");
                // break;
            case 4:
                System.out.println("Wednesday");
                // break;
            case 5:
                System.out.println("Thursday");
                // break;
            case 6:
                System.out.println("Friday");
                // break;
            case 7:
                System.out.println("Saturday");
                // break;
            default:
                System.out.println("Invalid day...");
        }
    }
}
