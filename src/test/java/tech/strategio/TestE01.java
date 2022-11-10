package tech.strategio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class TestE01 {
    @DisplayName("FIXME")
    @ParameterizedTest(name = "{index} => {0} is {1}")
    @MethodSource("argumentStream")
    // replace int[] and Boolean with the appropriate types
    void argumentStream(int[] values, Boolean result) {
        E01 exercise = new E01();
        boolean val = exercise.FIXME(values);
        assertEquals(result, val);
    }

    private static Stream<Arguments> argumentStream() {
        return Stream.of(
                Arguments.arguments(new int[] { 1, 2 }, false),
                Arguments.arguments(new int[] { 1, 2, 1 }, true),
                Arguments.arguments(new int[] { 1 }, false),
                Arguments.arguments(new int[] { 1 }, false),
                Arguments.arguments(new int[] { 1, 2, 3, 4 }, false),
                Arguments.arguments(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }, true));
    }
}
