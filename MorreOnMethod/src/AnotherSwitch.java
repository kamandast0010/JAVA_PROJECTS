public class AnotherSwitch{
    public static void main(String[] args) {
        String month = "";
        System.out.println(month + " IS IN THE " + switchCase("VHSJXKS") + " QUARTER ");
    }
    public static String switchCase(String month){
        return switch(month){
            case "JANUARY","FEBRUARY","MARCH" -> "1ST";
            case "APRIL", "MAY","JUNE" -> "2ND";
            case "JULY", "AUGUST","SEPTEMBER" -> "3RD";
            case "OCTOBER","NOVEMBER","DECEMBER" -> "4TH";
            default -> {
                String badResponse = month + "is bad";
                yield badResponse;
            }
        };
    }
}
