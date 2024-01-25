public class calculateAge {
    public static void main(String[] args) {
        System.out.println(calculateAge(1996,2024,"Sullaiman Kamanda"));

    }
    public static int calculateAge(int birthYear,int currentYear,String name){
        int age = currentYear - birthYear;
        return age;
    }
}
