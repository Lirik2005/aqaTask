package factorysingleton;

public enum EnumWebDriver {

    CHROME("webdriver.chrome.driver", "D:\\Andersen\\chromedriver.exe"),
    FIREFOX("webdriver.gecko.driver", "D:\\Andersen\\geckodriver.exe"),
    EDGE("webdriver.edge.driver", "D:\\Andersen\\msedgedriver.exe");

    private String instance;

    private String path;

    EnumWebDriver(String instance, String path) {
        this.instance = instance;
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public String getInstance() {
        return instance;
    }
}
