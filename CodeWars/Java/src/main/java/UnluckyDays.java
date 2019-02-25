import java.util.Calendar;
import java.util.stream.IntStream;

public final class UnluckyDays {
    // public static int unluckyDays(int year) {
    //     Calendar calendar = Calendar.getInstance();
    //     calendar.set(Calendar.YEAR, year);
    //
    //     int unluckyCount = 0;
    //     for (int i = 1; i <= 12; i++) {
    //         calendar.set(Calendar.MONTH, i);
    //         calendar.set(Calendar.DAY_OF_MONTH, 13);
    //
    //         if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
    //             unluckyCount++;
    //         }
    //     }
    //
    //     return unluckyCount;
    // }

    public static int unluckyDays(int year) {
        final Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_MONTH, 13);

        return IntStream.rangeClosed(0, 11).map(i -> {
            calendar.set(Calendar.MONTH, i);
            return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY ? 1 : 0;
        }).sum();
    }
}
