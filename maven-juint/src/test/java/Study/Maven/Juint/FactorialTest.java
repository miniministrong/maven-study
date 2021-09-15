package Study.Maven.Juint;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    public void testFact(){
        Factorial factorial = new Factorial();
        Assertions.assertEquals(1, factorial.fact(1));
        Assertions.assertEquals(2, factorial.fact(2));
        Assertions.assertEquals(6, factorial.fact(3));
        Assertions.assertEquals(24, factorial.fact(4));
    }
}
