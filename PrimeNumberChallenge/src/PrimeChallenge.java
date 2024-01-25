public class PrimeChallenge {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }

    public static boolean isPrime(int num1) {
        if (num1 / num1 == 0 && num1 % 1 == num1 ) {
            return true;
        } else return false;
    }
}
