/**
 * Inspired by rosettacode.org
 * http://rosettacode.org/wiki/General_FizzBuzz
 */
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(getFizz(105));
    }

    public static String getFizz(final int value) {
        StringBuilder sb = new StringBuilder();
        if (value % 3 == 0) {
            sb.append("Fizz");
        }
        if (value % 5 == 0) {
            sb.append("Buzz");
        }
        if (value % 7 == 0) {
            sb.append("Bax");
        }
        return sb.length() > 0 ? sb.toString() : String.valueOf(value);
    }
}
