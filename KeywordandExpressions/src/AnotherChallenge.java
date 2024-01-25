public class AnotherChallenge {
    public static void main(String[] args) {
        int highScore = calculateHighScore(1000);
        displayHighScore("Sullaiman",highScore);
        highScore = calculateHighScore(500);
        displayHighScore("BOB",highScore);
        highScore = calculateHighScore(100);
        displayHighScore("ZEE",highScore);
        highScore = calculateHighScore(25);
        displayHighScore("FANTA",highScore);


    }
    public static void displayHighScore(String name,int highScore) {

        System.out.println(name + " Managed to get into position : " + highScore);
    }
    public static int calculateHighScore(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100){
            return 3;
        } else {
            return 4;
        }
    }
}
