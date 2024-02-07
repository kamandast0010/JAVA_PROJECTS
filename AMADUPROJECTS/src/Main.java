import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] numbers = {2,4,5,18,9,50,7};
        Arrays.sort(numbers);
        int totalSum = 0;
        double avg = 0;
        for (int element : numbers){

            System.out.println(element + ",");
            totalSum += element;
            avg = totalSum / numbers.length;
        }
        System.out.println("Total Sum: " + totalSum);
        System.out.println("Average : " + avg);
    }
}
