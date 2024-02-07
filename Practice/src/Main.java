import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        //how to get the current Date and Time
       LocalDateTime now = LocalDateTime.now();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
       String formattedDateTime = now.format(formatter);
       System.out.println("The current DateTime: " +formattedDateTime);


       //how to get the current Time
       LocalTime nowTime = LocalTime.now();
       DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH-mm-ss");
       String formattedTime = nowTime.format(formatter1);
       System.out.println("The current Time: " +formattedTime);

       //how to get the current Date
        LocalDate justDate = LocalDate.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = justDate.format(formatter2);
        System.out.println("The current Date: " + formattedDate);
    }
}