import java.util.Stack;

public final class TimeFormatter {
    public static String formatDuration(int totalSeconds) {
        if (totalSeconds == 0) {
            return "now";
        }

        String[] formats = {
                formatUnit("year", totalSeconds / 31536000),
                formatUnit("day", (totalSeconds % 31536000) / 86400),
                formatUnit("hour", (totalSeconds % 86400) / 3600),
                formatUnit("minute", (totalSeconds % 3600) / 60),
                formatUnit("second", totalSeconds % 60)
        };

        Stack<String> stackedFormats = new Stack<>();
        for (String format : formats) {
            if (!format.equals("")) {
                stackedFormats.push(format);
            }
        }

        String topFormat = stackedFormats.pop();
        return stackedFormats.isEmpty() ?
                topFormat :
                String.format("%s and %s", String.join(", ", stackedFormats), topFormat);
    }

    private static String formatUnit(String unit, int unitAmount) {
        if (unitAmount >= 2) {
            return String.format("%s %ss", unitAmount, unit);
        } else if (unitAmount == 1) {
            return String.format("%s %s", unitAmount, unit);
        } else {
            return "";
        }
    }
}
