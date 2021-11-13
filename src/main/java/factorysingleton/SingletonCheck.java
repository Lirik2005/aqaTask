package factorysingleton;

import org.openqa.selenium.WebDriver;

public class SingletonCheck {

    public static void main(String[] args) {

       WebDriver driver = FactorySingleton.getSingletonDriver(EnumWebDriver.CHROME);

    //   driver.get("https://www.selenium.dev/documentation/");

    }

}
