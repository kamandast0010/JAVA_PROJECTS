public class PrimeChallenge {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int primeNumber = scanner.nextInt();
//        boolean isPrime = false;
        int count = 0;

        for(int counter = 1;counter <= 20;counter++){
           count = counter += counter;

        }
        System.out.println(count);
    }
}
