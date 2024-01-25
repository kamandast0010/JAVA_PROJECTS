public class Main {
    public static void main(String[] args) {
        calculateScore("Ford",500);
    }
    public static int calculateScore(String player,int score){
        System.out.println("player " + player + " scored " + score + " points");
        return score;
    }
}
