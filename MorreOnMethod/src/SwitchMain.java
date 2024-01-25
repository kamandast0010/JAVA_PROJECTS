public class SwitchMain{
    public static void main(String[] args) {
        switchTest(2);
    }
    public static void switchTest(int value){
        switch (value) {
            case 1, 2, 3 -> {
                System.out.println("A value between 1 and 3");
                System.out.println("It was a " + value);
            }
            default -> System.out.println("None of the above...");
        }
    }
}
