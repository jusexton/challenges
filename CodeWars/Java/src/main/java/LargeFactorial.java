import java.math.BigInteger;

public final class LargeFactorial {
    public static String factorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = n; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial.toString();
    }
}
