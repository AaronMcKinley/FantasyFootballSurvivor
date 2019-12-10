import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public String getDate() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println(formattedDate);
        return formattedDate;
    }
}