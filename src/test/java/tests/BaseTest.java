package tests;

import driver.MyDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import pages.HomePage;

public class BaseTest {
    protected static MyDriver myDriver;

    protected HomePage homePage;


    //notation testNG
    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser", "url"})
    public void beforeSuite(String browser, String url) {
        myDriver = new MyDriver(browser);
        myDriver.getDriver().get(url);
        myDriver.getDriver().manage().window().maximize();
        homePage = new HomePage(myDriver.getDriver());
    }

    //aqui se cierra la pagina luego de correr los tests
    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        if (homePage != null) {
            homePage.dispose();
        }
        if (myDriver != null) {
            myDriver.getDriver().quit();
        }
    }

}
