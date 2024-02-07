public class Sum3and5Challenge {
    public static void main(String[] args) {
        int totalCount = 0;
        for(int counter = 1;counter <= 100;counter++){
            if(counter % 3 == 0 && counter % 5 == 0){
                totalCount = counter += counter;
            }
        }
        System.out.println("Total Sum of 3 and 5 = " + totalCount);
    }
}
