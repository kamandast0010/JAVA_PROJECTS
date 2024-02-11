import java.util.LinkedList;
import java.util.ListIterator;

record Places(String name, int distance){}
public class LinkedListChallenge{
    public static void main(String[] args) {
        LinkedList<Places> placesToVisit = new LinkedList<>();
        placesToVisit.add(new Places("Kono",1234));
        placesToVisit.add(new Places("Freetown",5067));
        placesToVisit.add(new Places("Kabala",2345));
        placesToVisit.add(new Places("Bonth",6778));

        ListIterator<Places> iterator = placesToVisit.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()  );
        }

    }
}
