package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {

    @Test(priority = 1)
    public void test1() {
        System.out.println("Exitoso");
    }

    @Test(priority = 2)
    public void failTest() {
        System.out.println("Test Fallido");
        Assert.fail("Error manejado por TestNG: Fallido");
    }

    @Test(dependsOnMethods = "failTest")
    public void testSkip() {
        System.out.println("Test Skipeado");

    }

}
