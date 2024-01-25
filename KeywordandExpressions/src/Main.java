public class Main {
    public static void main(String[] args) {
        /*
        double weigthLbs = 166.00 * 0.45;
        System.out.println(weigthLbs);
        double weightKg = 75 / 0.45;
        System.out.println(weightKg);
         */

        boolean gameOver = true;
        int score = 5500;
        int levelCompleted = 5;
        int bonus = levelCompleted >= 5 ? 100 : 50;

        if (score >= 4000) {
            System.out.println("Your top score is :" + score);
        } if ((levelCompleted == 5) && (gameOver == true)) {
            System.out.println("Congratulations you entered another level...");
        }else{
            System.out.println("Better Luck Next Time....");
        }

    }
}

