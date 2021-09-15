package Study.Maven.Juint;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    /**
     * 现在看来我们在进行实例方法测试的时候总是需要进行创建对象，因此我们需要采用@BeforeEach和@AfterEach注解
     */
    static Calculator calculator;

    /**
     * 创建对象使其在调用该类中的方法时不会创建对象，不用在写一个测试方法就需要去创建一个对象
     * @BeforeEach 每一个测试方法在使用的时候就会运行一遍setUp()方法，不管你测试几个方法，测试几个运行几遍
     * @BeforeAll 测试方法执行之前只会运行一遍setUp()方法，即不管你一次性测试几个方法，该方法只会运行一遍
     */
    // @BeforeEach
    @BeforeAll
    public static void setUp() {
        System.out.println("setUp begin");
        calculator = new Calculator();
        System.out.println("setUp over");
    }

    /**
     * 将对象赋值为null以达到清空对象的作用。有开有合方为生存之道。
     * @AfterEach 每一个测试方法在使用的时候就会运行一遍clear()方法
     * @AfterAll 测试方法不管执行几个，该方法只会执行一遍
     */
    // @AfterEach
    @AfterAll
    public static void clear(){
        System.out.println("clear begin");
        calculator = null;
        System.out.println("clear over");
    }

    /**
     * @Disabled 加了这个注解条件，我们就会发现运行全部的测试方法时，当前测试方法不会运行
     */
    @Disabled
    @Test
    public void testAdd(){
        // Calculator calculator = new Calculator();
        Factorial factorial = new Factorial();
        Assertions.assertEquals(19, calculator.add(12, 7));
        Assertions.assertEquals(22, calculator.add(12, 10));
        // Assertions.assertThrows(IllegalArgumentException.class, () -> factorial.fact(-1));
    }
    @Test
    public void testSub(){
        // Calculator calculator = new Calculator();
        Assertions.assertEquals(10, calculator.sub(98, 88));
        Assertions.assertEquals(20, calculator.sub(78, 58));
    }
}
