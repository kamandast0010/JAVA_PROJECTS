import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class SUl {
    public static void main(String[] args) {
        LocalDateTime currDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.now();
        System.out.println(currDateTime);
        System.out.println(date);
        int day = date.getDayOfMonth() + 3;
        System.out.println(day);

        if(day >= 10 && day <=11){
            System.out.println("Its Weekend");
        }else{
            System.out.println("not weekend");
        }
    }
}
