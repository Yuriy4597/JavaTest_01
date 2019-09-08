package Task_2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;


public class TestCalculator {


public static void main(String[] args){
    System.out.println("Написати програму Calculator з методами add, subtract, multiply, divide та написати 4 тести на кожен з методів.");

}
    public int addAD(int c, int d) {
        return c + d;
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("test: before test");
    }

    @BeforeMethod(enabled = false)
    public void disabledBeforeMethod() {
        System.out.println("this method is not enabled, this should not get called");
    }

    // ------


    @Test
    public  void add() {

        int a = 2;
        int b = 4;
        System.out.println("test 1 (add)");
        Assert.assertTrue(a + b == 6);

    }
    @Test
    public void subtract() {
        int a = 2;
        int b = 4;
        System.out.println("test 2 (subtract)");
        Assert.assertTrue(a - b == -2);
    }

    @Test
    public  void  multiply() {
        int a = 2;
        int b = 4;
        System.out.println("test 3 (multiply)");
        Assert.assertTrue(a * b == 8);
    }

    @Test //(enabled = false)
    public  void divide() {
        int a = 20;
        int b = 4;
        System.out.println("test 4 (divide)");
        Assert.assertTrue(a / b == 5);
    }


    // ---------
    @Test (priority = 0)
    public void testAddAdd() {
        int expectedResult = 10;
        Reporter.log("asserting add method: ", true);
        assertEquals(addAD(2, 3) + addAD(3, 2), expectedResult);
    }

    @AfterClass
    public void afterClass() {
        System.out.println("testClass: after class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("testClass: after test");
    }
}











