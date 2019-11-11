import java.util.HashSet;
import java.util.Set;

public final class Permutations {
    public static Set<String> singlePermutations(String str) {
        Set<String> perm = new HashSet<>();

        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        final char initial = str.charAt(0);
        final String rem = str.substring(1);
        final Set<String> words = singlePermutations(rem);
        for (final String strNew : words) {
            for (int i = 0; i <= strNew.length(); i++) {
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    private static String charInsert(String str, char c, int j) {
        final String begin = str.substring(0, j);
        final String end = str.substring(j);
        return begin + c + end;
    }
}
