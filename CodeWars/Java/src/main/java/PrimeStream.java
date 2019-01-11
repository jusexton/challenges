import java.util.stream.IntStream;

public final class PrimeStream {
    public static IntStream stream() {
        return IntStream.rangeClosed(2, Integer.MAX_VALUE).filter(PrimeStream::isPrime);
    }

    private static boolean isPrime(int number) {
        if (number > 2 && number % 2 == 0) {
            return false;
        }

        int top = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < top; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Prime Supplier version one
    // public static class PrimeSupplier implements IntSupplier {
    //     private int current;
    //
    //     public PrimeSupplier() {
    //         this.current = 2;
    //     }
    //
    //     @Override
    //     public int getAsInt() {
    //         if (current == 2) {
    //             current += 1;
    //             return 2;
    //         } else if (current == 3) {
    //             current += 2;
    //             return 3;
    //         }
    //
    //         while (current < Integer.MAX_VALUE) {
    //             if (isPrime(current)) {
    //                 int ret = current;
    //                 current += 2;
    //                 return ret;
    //             }
    //
    //             current += 2;
    //         }
    //
    //         throw new IllegalStateException();
    //     }
    //
    //     private boolean isPrime(int number) {
    //         if (number > 2 && number % 2 == 0) {
    //             return false;
    //         }
    //
    //         int top = (int) Math.sqrt(number) + 1;
    //         for (int i = 3; i < top; i += 2) {
    //             if (number % i == 0) {
    //                 return false;
    //             }
    //         }
    //         return true;
    //     }
    // }
}
