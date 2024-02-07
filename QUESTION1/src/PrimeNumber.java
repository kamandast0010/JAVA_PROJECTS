import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int num = scan.nextInt();
            for(int i = 2
                ;i < num; i++){
                if(num <=1){
                    System.out.println(false);
                }if(num % i == 0){
                    System.out.println(false);
                }else{
                    System.out.println(true);
                }
            }


    }
}
