package Study.Maven.Juint;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ConfigTest {

    static Config configTest;

    @BeforeAll
    static void setUp() {
        configTest = new Config();
    }

    @AfterAll
    static void afterAll() {
        configTest = null;
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testWindows(){
        Assertions.assertEquals("C:\\test.ini", configTest.getConfigFile("test.ini"));
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC})
    public void testOtherOS() {
        Assertions.assertEquals("/usr/local/test.cfg", configTest.getConfigFile("test.cfg"));
    }
}