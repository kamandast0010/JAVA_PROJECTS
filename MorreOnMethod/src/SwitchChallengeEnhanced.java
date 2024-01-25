public class SwitchChallengeEnhanced{
    public static void main(String[] args) {
        System.out.println(switchChallenge('Z'));
    }
    public static String switchChallenge(char nato){
        return switch(nato){
            case 'A' -> "Able";
            case 'B' -> "Bakar";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> "Letter " + nato + " was not found";
        };
    }
}
