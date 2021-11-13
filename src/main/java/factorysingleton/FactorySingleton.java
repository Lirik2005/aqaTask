package factorysingleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;

public abstract class FactorySingleton {

    private static ChromeDriver chromeDriver;

    private static FirefoxDriver firefoxDriver;

    private static EdgeDriver edgeDriver;


    public static WebDriver getSingletonDriver(EnumWebDriver type) {
        switch (type) {
            case EDGE: {
                System.setProperty(EnumWebDriver.EDGE.getInstance(), EnumWebDriver.EDGE.getPath());
                return Objects.requireNonNullElseGet(edgeDriver, EdgeDriver::new);
            }
            case CHROME: {
                System.setProperty(EnumWebDriver.CHROME.getInstance(), EnumWebDriver.CHROME.getPath());
                return Objects.requireNonNullElseGet(chromeDriver, ChromeDriver::new);
            }
            default: {
                System.setProperty(EnumWebDriver.FIREFOX.getInstance(), EnumWebDriver.FIREFOX.getPath());
                return Objects.requireNonNullElseGet(firefoxDriver, FirefoxDriver::new);
            }
        }
    }
}
