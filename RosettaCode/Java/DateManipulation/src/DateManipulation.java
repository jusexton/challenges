import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Inspired by Rosetta code.org
 * http://rosettacode.org/wiki/Date_manipulation
 */
public class DateManipulation {
    public static void main(String[] args){
        LocalDateTime dateTime = LocalDateTime.of(2009, Month.MARCH, 7, 19, 30, 0).plusHours(12);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd h:mma")));
    }
}
