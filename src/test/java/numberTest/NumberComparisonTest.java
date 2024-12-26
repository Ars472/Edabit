package numberTest;

import number.NumberComparison;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class NumberComparisonTest {
    // Это будет выполняться перед запуском всех тестов в классе
    @BeforeClass
    public void beforeClass() {
        System.out.println("Этот метод выполняется один раз перед всеми тестами в классе.");
    }
    // Это будет выполняться перед каждым тестом
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Этот метод выполняется перед каждым тестом.");
    }
    // Тест 1: Проверка для чисел 4 и 8
    @Test
    public void testIsSameNum_1() {
        System.out.println("Запуск теста 1");
        Assert.assertFalse(NumberComparison.isSameNum(4, 8)); // Ожидаем false, так как 4 != 8
    }
    // Тест 2: Проверка для чисел 2 и 2
    @Test
    public void testIsSameNum_2() {
        System.out.println("Запуск теста 2");
        Assert.assertTrue(NumberComparison.isSameNum(2, 2));   // Ожидаем true, так как 2 == 2
    }
    // Тест 3: Проверка для чисел 42 и 32
    @Test
    public void testIsSameNum_3() {
        System.out.println("Запуск теста 3");
        Assert.assertFalse(NumberComparison.isSameNum(42, 32)); // Ожидаем false, так как 42 != 32
    }
}