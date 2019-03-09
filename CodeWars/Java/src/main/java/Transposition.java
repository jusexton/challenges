public final class Transposition {
    public static String transpose(final String text) {
        final StringBuilder sb = new StringBuilder();
        char[] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            char character = characters[i];
            if (i % 2 == 0) {
                sb.insert(sb.length() / 2, character);
            } else {
                sb.append(character);
            }
        }

        return sb.toString();
    }
}
