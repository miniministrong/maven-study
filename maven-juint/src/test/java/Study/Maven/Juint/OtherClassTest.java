package Study.Maven.Juint;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class OtherClassTest {
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 5, 100})
    void testAbs(int x) {
        Assertions.assertEquals(x, Math.abs(x));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -5, -100})
    void testAbsNegative(int x) {
        Assertions.assertEquals(-x, Math.abs(x));
    }
}
