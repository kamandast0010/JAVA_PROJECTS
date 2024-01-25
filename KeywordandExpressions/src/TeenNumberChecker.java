public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println( hasTeen(13,20,30));
    }
    public static boolean hasTeen(int age1,int age2,int age3){
        if (age1 >= 13 && age1 <=19){
            return true;
        }if (age2 >= 13 && age2 <=19){
            return true;
        }if (age3 >= 13 && age3 <=19){
            return true;
        } else return false;
    }
    public static boolean isTeen(int num1){
        if (num1 >= 13 && num1 <=19){
            return true;
        } else return false;
    }
}
