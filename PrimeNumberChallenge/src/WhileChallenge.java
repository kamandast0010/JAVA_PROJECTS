public class WhileChallenge{
    public static void main(String[] args) {
        System.out.println(isEven(3));
    }
    public static boolean isEven(int num){
        int loopValue = 5;
        while(loopValue <= 20){
            if(num % 2 == 0){
                return true;
            }
        }return false;

    }

}
