public class Main1 {
    public static void main(String[] args) {
        printEqual(1,0,3);
    }
    public static void printEqual(int num1,int num2,int num3){
        if (num1 <= 0 || num2 <= 0 || num3 <= 0){
            System.out.println("Invalid value");
        }
    }
}
