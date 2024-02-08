import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        //QUESTION1: CREATE TWO DIFFERENT NUMBERS(INT) VARIABLES (BETWEEN 1 AND 20)
//        calculateNumber();
//        replaceString();
        arrayExercise();

    }

    public static void calculateNumber() {
        //declared a scanner class to allow users to enter input for the value of num1 and num2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num1 Value :");
        int num1 = scanner.nextInt();
        System.out.println("Enter Num2 Value :");
        int num2 = scanner.nextInt();

        //checking to see which value is greater to the other and if they equal
        if (num1 > num2) {
            System.out.println("Num1 is greater than num2");
        } else if (num1 == num2) {
            System.out.println("Num1 and num2 are equal");
        } else {
            System.out.println("Num2 is greater than num2");
        }

        //printing the results for the different calculations(+,/,*,%)

        System.out.println("The sum of Num1 and Num2 is :" + (num1 + num2));
        System.out.println("The div of Num1 and Num2 is :" + (num1 / num2));
        System.out.println("The mul of Num1 and Num2 is :" + (num1 * num2));
        System.out.println("The modulo of Num1 and Num2 is :" + (num1 % num2));

    }

    public static void replaceString() {
        //created a string variable to hold the string value
        String ubuntuPhilosophy = "I am Because we are";
        //printing the length of ubuntuPhilosophy
        System.out.println("The Length of UbuntuPhilosophy: " + ubuntuPhilosophy.length());
        // replaced the spaces with wit an underscore
        System.out.println("The replaced value for UbuntuPhilosophy: " + ubuntuPhilosophy.replace(" ", "_"));
    }

    public static void arrayExercise() {
        int[] numbers = {5, 10, 7, 4, 15, 20};
        int lowestNum = numbers[0];
        for (int element : numbers) {
            if (element % 2 != 0) {
                System.out.println(element + ":Odd number");
            }
            if (element < lowestNum) {
                lowestNum = element;
            }
        }
        System.out.println(lowestNum + ": is the lowest number");
        System.out.println("---------------REVERSE ORDER--------------------- ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }

    public static void dateExcercise(){

    }
}
