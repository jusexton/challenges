import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Inspired by Rosetta code.org
 * http://rosettacode.org/wiki/Date_format
 */
public class DateFormatting {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2007, 11, 23);

        System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        // Displays friday, instead of Sunday for some reason.
        System.out.println(date.format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy")));
    }
}
