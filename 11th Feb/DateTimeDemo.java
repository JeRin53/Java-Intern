import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeDemo{
    public static void main(String[] args){
        LocalTime t = LocalTime.now(ZoneId.of("GMT"));
        System.out.print(t);
        Instant i = Instant.now();
        System.out.println(i);
    }
}