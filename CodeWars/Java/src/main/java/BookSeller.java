import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class BookSeller {
    public static class Book {
        private final String category;
        private final String code;
        private final int quantity;

        public Book(String label) {
            String[] codeAndQuantity = label.split(" ");

            this.category = codeAndQuantity[0].substring(0, 1);
            this.code = codeAndQuantity[0].substring(1);
            this.quantity = Integer.parseInt(codeAndQuantity[1]);
        }
    }

    public static String stockSummary(String[] bookLabels, String[] categories) {
        if (bookLabels.length == 0 || categories.length == 0) {
            return "";
        }

        // Group each category and sum the quantities of all books with the same category.
        Map<String, Integer> categoryQuantities = Arrays.stream(bookLabels)
                .map(Book::new)
                .collect(Collectors.groupingBy(book -> book.category,
                        Collectors.summingInt(book -> book.quantity)));

        // Map each given category to the sum of all those categories.
        return Arrays.stream(categories)
                .map(category -> String.format("(%s : %d)",
                        category, categoryQuantities.getOrDefault(category, 0)))
                .collect(Collectors.joining(" - "));
    }

    // public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
    //     if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
    //         return "";
    //     }
    //
    //     HashMap<String, HashMap<String, Integer>> bookCategoryGroupings = groupBooksByCategory(lstOfArt);
    //     return Arrays.stream(lstOf1stLetter)
    //             .map(category -> sumBookEntriesByCategory(bookCategoryGroupings, category))
    //             .collect(Collectors.joining(" - "));
    // }
    //
    // public static HashMap<String, HashMap<String, Integer>> groupBooksByCategory(String[] librarySet) {
    //     HashMap<String, HashMap<String, Integer>> categoryGroups = new HashMap<>();
    //
    //     for (String stock : librarySet) {
    //         String[] codeAndCount = stock.split(" ");
    //         String category = codeAndCount[0].substring(0, 1);
    //
    //         HashMap<String, Integer> bookEntries = categoryGroups.getOrDefault(category, new HashMap<>());
    //         int bookStock = bookEntries.getOrDefault(codeAndCount[0], 0);
    //         bookEntries.put(codeAndCount[0], Integer.parseInt(codeAndCount[1]) + bookStock);
    //         categoryGroups.put(category, bookEntries);
    //     }
    //
    //     return categoryGroups;
    // }
    //
    // private static String sumBookEntriesByCategory(HashMap<String, HashMap<String, Integer>> categoryGroupings,
    //                                                String category) {
    //     HashMap<String, Integer> bookEntries = categoryGroupings.get(category);
    //     int sum = bookEntries == null ? 0 : bookEntries.entrySet().stream().mapToInt(Map.Entry::getValue).sum();
    //     return String.format("(%s : %d)", category, sum);
    // }
}
