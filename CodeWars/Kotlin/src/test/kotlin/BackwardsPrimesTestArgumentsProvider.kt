import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import java.util.stream.Stream

class BackwardsPrimesTestArgumentsProvider : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
            Arguments.of(2, false),
            Arguments.of(5, false),
            Arguments.of(11, false),
            Arguments.of(13, true),
            Arguments.of(31, true),
            Arguments.of(17, true),
            Arguments.of(71, true),
            Arguments.of(15, false),
            Arguments.of(12, false),
            Arguments.of(90, false)
    )
}
