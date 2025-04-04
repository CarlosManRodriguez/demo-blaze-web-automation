package tests;

import driver.MyDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected static MyDriver myDriver;

    //notation testNG
    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser", "url"})
    public void beforeSuite(String browser, String url) {
        myDriver = new MyDriver(browser);
        myDriver.getDriver().get(url);
        myDriver.getDriver().manage().window().maximize();
        //aqui inicializa la primera pagina...falta desarrollar
    }

    //aqui se cierra la pagina luego de correr los tests
    @AfterSuite(alwaysRun = true)
    public void afterSuite() {

    }

}
