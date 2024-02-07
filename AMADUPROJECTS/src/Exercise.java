public class Exercise{
    public static void main(String[] args) {
        oddNumInArray();
    }

    public static void oddNumInArray(){
        int[] numbers = {2,4,5,18,9,50,7};
        for(int element : numbers){
            if(element % 2 != 0){
                System.out.println(element + " is a Odd Number");
            }
        }
    }

    public static void averageNumInArray(){

    }
}
