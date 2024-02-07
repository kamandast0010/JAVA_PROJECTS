public class SumCallenge {
    public static void main(String[] args) {
       int totalCount = 0;
       for(int count = 1;count <= 100;count++){
           if(count % 3 == 0 && count % 5 == 0){
               totalCount += count;
               System.out.println(count);
           }
       }
        System.out.println("Total Sum of divisible Matches :" + totalCount);

    }
}
