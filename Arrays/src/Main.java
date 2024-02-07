import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] cars = {{"Volvo","Lamborgini","Benz","Mustang"},{"Biomin","Corola","Amie Kallon","ChatGpt"}};
        for(int i = 0; i < cars.length;i++){
            for(int j = 0; j< cars[i].length;j++){
                System.out.println(cars[i][j]);
            }
        }
    }
}
