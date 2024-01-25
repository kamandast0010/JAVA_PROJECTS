public class MainChallenge{
    public static void main(String[] args) {
        calculateScore(true,10000,8,"Ford");
        calculateScore(true,2000,10,"Sullaiman");
    }
    public static void calculateScore(boolean gameOver,int score,int levelCompleted,String name) {
        int bonus = levelCompleted >= 5 ? 200 : 50;
        int finalScore = score;

        if(gameOver == true){
            finalScore += levelCompleted * bonus;
            System.out.println("Your final score is : " + finalScore);
            System.out.println("Thanks for playing...");
        }else {
            System.out.println("Better luck next time....");
        }
    }
}