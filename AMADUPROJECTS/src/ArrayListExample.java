import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> students = new ArrayList<String>();
        students.add("Sullaiman");
        students.add("Kamanda");
        students.add("Hawa");
        students.add("Aminata");

        System.out.println(students);

        System.out.println(students.get(2));

    }
}
