public class Isograms {
//     Old Version
//    public static Boolean isIsogram(String value) {
//        value = value.toLowerCase();
//        String distinctCharacters = value.codePoints()
//                .distinct()
//                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                .toString();
//
//        return value.equals(distinctCharacters);
//    }

    public static Boolean isIsogram(final String value) {
        return value.toLowerCase().chars().distinct().count() == value.length();
    }
}
