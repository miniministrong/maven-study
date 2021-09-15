package Study.Maven.Juint;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

public class StringUtilsTest {
    @ParameterizedTest
    // @MethodSource
    // @CsvSource({"abc, Abc", "app, App"})
    @CsvFileSource(resources = "/test.csv")
    public void testChangeStr(String input, String result) {
        Assertions.assertEquals(result, StringUtils.changeStr(input));
    }
    /*static List<Arguments> testChangeStr(){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments("abc", "Abc"));
        list.add(Arguments.arguments("aPP", "App"));
        return list;
    }*/
}
