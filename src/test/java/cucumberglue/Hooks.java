package cucumberglue;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    private static WebDriver driver;
    private static int escenario = 0;
    private DriverManager driverManager;

    @Before
    public void setUp(){
        escenario++;
        System.out.println("Se esta ejecutando el escenario nro: "+ escenario);
        driverManager =  DriverManagerFactory.getManager(DriverType.FIREFOX);
        driver = driverManager.getDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("Ha finalizado el escenario "+ escenario +" correctacmente.");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
