import java.util.Arrays;
import java.util.stream.Collectors;

public final class IpAddressCounting {
    public static long ipsBetween(String start, String end) {
        long startingIpValue = ipToInt(start);
        long endingIpValue = ipToInt(end);
        return endingIpValue - startingIpValue;
    }

    private static long ipToInt(String ip) {
        String[] octets = ip.split("\\.");
        return Long.parseLong(Arrays.stream(octets)
                .map(Integer::parseInt)
                .map(Integer::toBinaryString)
                .map(binary -> String.format("%8s", binary).replace(' ', '0'))
                .collect(Collectors.joining("")), 2);
    }
}
