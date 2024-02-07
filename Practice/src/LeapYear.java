import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid Year: ");
        int year = scan.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println(true);
        }else if(year % 100 == 0 && year % 400 == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}