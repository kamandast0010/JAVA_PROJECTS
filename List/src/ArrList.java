import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

record GroceryItems(String name, String type, int count){
    public GroceryItems(String name){
        this(name,"Dairy",1);
    }
    @Override
    public String toString(){
        return String.format("%d %s in %s", count,name.toUpperCase(),type);
    }
}
public class ArrList{
    public static void main(String[] args) {
        GroceryItems[] groceryArray = new GroceryItems[3];
        groceryArray[0] = new GroceryItems("MILK");
        groceryArray[1] = new GroceryItems("MANGO","FRUITS",2);
        groceryArray[2] = new GroceryItems("BUTTER","GROCERY",1);
//        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItems> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItems("MILK"));
        groceryList.add(new GroceryItems("MANGO","FRUIT",2));
        groceryList.add(new GroceryItems("NISSAN","CARS",4));
        groceryList.add(0, new GroceryItems("APPLE","FRUITS",10));

        System.out.println(groceryList);
    }
}
