package tests;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class TestArgumentsProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
    return Stream.of(
            Arguments.of(2, 4),
            Arguments.of(3, 8),
            Arguments.of(50, 11),
            Arguments.of(42, 2),
            Arguments.of(2, 12)
    );
}
}
