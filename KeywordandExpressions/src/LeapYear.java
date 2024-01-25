public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1800));
    }

    public static boolean isLeapYear(int year) {
        int leapYear;
        int result = 0;
        if (year >= 1 && year <= 9999) {
            leapYear = year % 4;
            result += leapYear;
        }
        if (year <= 0 || year > 9999) {
            return false;
        }
        if (result == 0 && year % 400 == 0) {
            return true;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else return false;
    }
}