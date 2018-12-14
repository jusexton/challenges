public final class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        if (names.length > 3) {
            return String.format("%s, %s and %s others like this", names[0], names[1], names.length - 2);
        } else if (names.length == 3) {
            return String.format("%s, %s and %s like this", names[0], names[1], names[names.length - 1]);
        } else if (names.length == 2) {
            return String.format("%s and %s like this", names[0], names[1]);
        } else if (names.length == 1) {
            return String.format("%s likes this", names[0]);
        } else {
            return "no one likes this";
        }
    }
}
