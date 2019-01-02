import java.util.HashMap;

public final class VasyaClerk {
    private static final int TICKET_PRICE = 25;

    // public static String tickets(int[] peopleInLine) {
    //     int total = 0;
    //     for (int person : peopleInLine) {
    //         if (person != 25) {
    //             int requiredChange = person - TICKET_PRICE;
    //             if (total >= requiredChange) {
    //                 total += TICKET_PRICE;
    //             } else {
    //                 return "NO";
    //             }
    //         } else {
    //             total += person;
    //         }
    //     }
    //
    //     return "YES";
    // }

    public static String tickets(int[] peopleInLine) {
        HashMap<Integer, Integer> bills = new HashMap<>();

        for (int person : peopleInLine) {
            int requiredChange = person - TICKET_PRICE;
            if (requiredChange == 0) {
                bills.merge(25, 1, Integer::sum);
            } else if (requiredChange == 25 && bills.getOrDefault(25, 0) != 0) {
                bills.merge(25, -1, Integer::sum);
                bills.merge(50, 1, Integer::sum);
            } else if (requiredChange == 75 && bills.getOrDefault(25, 0) != 0 && bills.getOrDefault(50, 0) != 0) {
                bills.merge(25, -1, Integer::sum);
                bills.merge(50, -1, Integer::sum);
                bills.merge(100, 1, Integer::sum);
            } else {
                return "NO";
            }
        }

        return "YES";
    }
}
