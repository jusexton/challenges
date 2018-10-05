package backwardPrime

import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import java.util.stream.Stream

class PrimesTestArgumentsProvider : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
            Arguments.of(0L, false),
            Arguments.of(1L, false),
            Arguments.of(2L, true),
            Arguments.of(3L, true),
            Arguments.of(4L, false),
            Arguments.of(5L, true),
            Arguments.of(11L, true),
            Arguments.of(100L, false),
            Arguments.of(1009L, true),
            Arguments.of(1373L, true),
            Arguments.of(1931L, true),
            Arguments.of(1472L, false)
    )
}