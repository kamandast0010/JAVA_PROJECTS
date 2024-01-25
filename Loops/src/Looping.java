public class Looping {
    public static void main(String[] args) {
        for(double rate = 7.5;rate <= 10; rate += 0.25){
            double interestAmount = calculateInterest(100,rate);
            System.out.println("100 at " + rate + " is = " + interestAmount);
            if(interestAmount >= 8.5){
                break;
        }
        }
//        System.out.println("10000 at 2% interest = " + calculateInterest(10000,2));
        }
        public static double calculateInterest(double amount,double interestRate){
        double interest = (amount * (interestRate / 100));
        return interest;
        }
    }

