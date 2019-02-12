import java.util.Arrays;

public final class FindUniqueNumber {
    public static double findUniq(double[] array) {
        // if (array[0] == array[1]) {
        //     double nonUnique = array[0];
        //     for (int i = 2; i < array.length; i++) {
        //         if (array[i] != nonUnique) {
        //             return array[i];
        //         }
        //     }
        // } else {
        //     return array[3] != array[0] ? array[0] : array[1];
        // }

        return array[0] == array[1] ?
                Arrays.stream(array).skip(2).filter(n -> n != array[0]).findFirst().getAsDouble() :
                array[2] != array[0] ? array[0] : array[1];
    }
}
