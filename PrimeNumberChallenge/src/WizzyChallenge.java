public class WizzyChallenge {
    public static void main(String[] args) {
        for (int wizzy = 1; wizzy <= 100; wizzy++) {
            if (wizzy % 4 == 0 && wizzy % 6 == 0) {
                System.out.println(wizzy + " : Computer Software");
            }
            if (wizzy % 4 == 0) {
                System.out.println(wizzy + " : computer");
            }
            if (wizzy % 6 == 0) {
                System.out.println(wizzy + " : Software");
            } else {
                System.out.println(wizzy + " : University");
            }
        }
    }
}
