import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Reverse or Rotate Tests")
public class ReverseOrRotateTests {
    @DisplayName("Should return the correctly partitioned string")
    @ParameterizedTest()
    @ArgumentsSource(ReverseOrRotateTests.PartitionArgumentProvider.class)
    public void testPartition(String value, int chunkSize, String[] expected) {
        assertArrayEquals(expected, ReverseOrRotate.getPartitions(value, chunkSize).toArray());
    }

    @DisplayName("Should return the cubed sum of all the digits in a given string")
    @ParameterizedTest()
    @ArgumentsSource(ReverseOrRotateTests.DigitCubeSumArgumentProvider.class)
    public void testDigitCube(String value, int expected) {
        assertEquals(expected, ReverseOrRotate.sumCubeOfDigits(value));
    }

    @DisplayName("Should return the correct transformation of a given string")
    @ParameterizedTest()
    @ArgumentsSource(ReverseOrRotateTests.StringTransformationArgumentProvider.class)
    public void testStringTransformation(String value, String expected) {
        assertEquals(expected, ReverseOrRotate.transform(value));
    }

    @DisplayName("Should return the correct concatenation of partitions and their transformations")
    @ParameterizedTest()
    @ArgumentsSource(ReverseOrRotateTests.ReverseOrRotationArgumentProvider.class)
    public void testReverseOrRotation(String value, int chunkSize, String expected) {
        assertEquals(expected, ReverseOrRotate.revrot(value, chunkSize));
    }

    public static class PartitionArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of("abcd", 2, new String[]{"ab", "cd"}),
                    Arguments.of("abcde", 2, new String[]{"ab", "cd"})
            );
        }
    }

    public static class DigitCubeSumArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of("1", 1),
                    Arguments.of("5", 125),
                    Arguments.of("6", 216),
                    Arguments.of("0", 0),
                    Arguments.of("56", 341),
                    Arguments.of("123", 36)
            );
        }
    }

    public static class StringTransformationArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of("123456", "234561"),
                    Arguments.of("", "")
            );
        }
    }

    public static class ReverseOrRotationArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of("123456987654", 6, "234561876549"),
                    Arguments.of("123456987653", 6, "234561356789"),
                    Arguments.of("", 8, ""),
                    Arguments.of("12346", 0, "")
            );
        }
    }
}
