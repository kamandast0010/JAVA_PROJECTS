import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Exercise 1 ----------------------------");
//        Exercise 1:
//        Create two differents numbers (int) variables (between 1 and 20):
//              - Show by console which one is the highest or if they are equal
//              - Calculate and print in the console the sum
//              - Calculate and print in the console the subtraction
//              - Calculate and print in the console the multiplication
//              - Calculate and print in the console the division

        //I declared two variables to hold the value of num1 and num2
        int num1 = 20;
        int num2 = 10;

        // calculate for the different mathematical operations and assigned them to different variables to hold the
        //results of the calculations
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;

        //created an if else statement to check which of the value is the highest and if they are equal
        if(num1 > num2){
            System.out.println("Num1 is the Highest value: " + num1);
        }else if(num1 == num2){
            System.out.println("Num1 and Num2 are equal");
        }else{
            System.out.println("Num2 is the highest value: " + num2);
        }

        //and i printed the result of mathematic operation
        System.out.println("The sum of Num1 and Num2 is: " + sum);
        System.out.println("The div of Num1 and Num2 is: " + sub);
        System.out.println("The mul of Num1 and Num2 is: " + mul);




        System.out.println("/--------------------------------------");

        System.out.println("Exercise 2 ----------------------------");
//        Exercise 2:
//        Create a string with the value “Ubuntu: I am because we are”.
//              - Show in the console how many characters has
//              - Replace the spaces for the character ‘_’ and show the result in the console

        //created a string variable to hold the string value
        String ubuntuPhilosophy = "Ubuntu: I am because we are";

        //I used one of the string methods to replace the spaces with the undescore
        String result = ubuntuPhilosophy.replace(" ", "_");
        System.out.println(ubuntuPhilosophy.length());
        System.out.println(result);



        System.out.println("/--------------------------------------");

        System.out.println("Exercise 3 ----------------------------");
//        Exercise 3
//        Create a 6 numbers array (values from 1 to 100) and do the following:
//              - Show by console the odd numbers
//              - Show in the console which number is the lowest
//              - Show the reverse order of the array

        //created and initialize the numbers array to six elements
        int [] numbers = {20,5,10,30,40,15};
        //created another variable to hold and assume the first element in the array is the lowest
        int lowestNum = numbers[0];
        for(int element:numbers){
            if(element % 2 != 0){
                System.out.println(element + " is an odd number");
                //created an if statement to check and assign the lowest value to lowestNum variable in each iteration
            }if(element < lowestNum){
                lowestNum = element;
            }
        }
        System.out.println(lowestNum + " is the lowest number in the array");
        //created another forloop to print the reverse order of the array
        for(int i = numbers.length -1;i>=0;i--){
            System.out.println(numbers[i]);
        }



        System.out.println("/--------------------------------------");

        System.out.println("Exercise 4 ----------------------------");
//        Exercise 4
//        Create a variable date and show the date and time from now.
//              - Sum three days at the date and show by console if it is weekend or not

        //created a date object to hold the current date and time and added 3 days to its
        LocalDateTime currentDate = LocalDateTime.now().plusDays(3);

        //used a dateformatter to format the date and Time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-mm-dd HH:mm:ss");
        System.out.println(formatter.format(currentDate));

        if(currentDate.getDayOfWeek() == DayOfWeek.SATURDAY || currentDate.getDayOfWeek() == DayOfWeek.SUNDAY){
            System.out.println(currentDate.getDayOfWeek() + " is a Weekend");
        }else {
            System.out.println(currentDate.getDayOfWeek() + " is not weekend");
        }



        System.out.println("/--------------------------------------");

        System.out.println("Exercise 5 ----------------------------");
//        Exercise 5
//        Create a 6 number array (values from 1 to 10), and do the following
//              - Print the average in the console
//              - Check number by number if are higher than 5 and show by console

        double [] numberArray = {9,1,5,4,6,2};
        double totalSumOfArray = 0;
        for(double elements: numberArray){
            totalSumOfArray += elements;
            if(elements > 5){
                System.out.println(elements + " is higher than 5");
            }
        }

        double average = totalSumOfArray / numberArray.length;
        System.out.println("The average of array is: "+ average);





    }
}
