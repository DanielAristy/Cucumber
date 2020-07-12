package runner.browser_manager;


import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type){
        DriverManager driverManager = null;

        switch (type){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            default:
                System.out.println("Browser seleccionado es invalido");
        }

        return driverManager;
    }
}
