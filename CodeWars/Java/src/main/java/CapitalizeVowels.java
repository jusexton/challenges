public final class CapitalizeVowels {
    public static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};

    public static String capitalize(final String string) {
        final char[] characters = string.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            final char character = characters[i];
            if (isVowel(character)) {
                characters[i] = Character.toUpperCase(character);
            }
        }

        return new String(characters);
    }

    private static boolean isVowel(final char character) {
        for (final char vowel : VOWELS) {
            if (vowel == character) {
                return true;
            }
        }

        return false;
    }
}
