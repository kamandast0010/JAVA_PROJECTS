import java.util.LinkedList;
import java.util.ListIterator;

public class Main1 {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sullaiman");
        placesToVisit.add("Rapasco");
        placesToVisit.add("Junior");
        placesToVisit.add("Sahr");
        placesToVisit.add("Alima");
        placesToVisit.add("Fatu");
        System.out.println(placesToVisit );

        ListIterator<String> iterator = placesToVisit.listIterator();

        System.out.println("Forward iterations");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Backward iterations");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        }
    }

