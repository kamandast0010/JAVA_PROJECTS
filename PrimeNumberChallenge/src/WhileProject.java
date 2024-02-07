public class WhileProject{
    public static void main(String[] args) {
        dayOfWeek(true,1);
        }
        public static void dayOfWeek(boolean isWeek,int day){
        while (isWeek){
            String week = switch(day){
                case 0 -> "Sunday";
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                default -> "Invalid day";
            };
            System.out.println(week);

            if (day == 5){
                break;
            }
        }


        }
    }
