package cucumberglue;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;
    private int escenario = 0;

    @Before
    public void setUp(){
        escenario++;
        System.out.println("Se esta ejecutando el escenario nro: "+ escenario);
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After
    public void finalizar(){
        System.out.println("Ha finalizado el escenario "+ escenario +" correctacmente.");
        driver.quit();
    }

    public static ChromeDriver getDriver(){
        return driver;
    }
}
