import java.util.ArrayList;
import java.util.List;

record GroceryList(String name, int age, String dept){
    public GroceryList(String name){
        this(name,20,"Comssu");
    }
}
public class AnotherArrayList{
    public static void main(String[] args) {

        ArrayList<GroceryList> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryList("Sullaiman Kamanda"));
        groceryItems.add(new GroceryList("Mariama Mansaray",30,"Law"));

        String [] items = {"Ford","Kam","Mam"};
        List<String> list = List.of(items);
        System.out.println(list);

    }
}
