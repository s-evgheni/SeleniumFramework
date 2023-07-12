import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxTest extends BrowserTest {
    public static final String FIREFOX_APP_LOCATION = "/Applications/Firefox Developer Edition.app/Contents/MacOS/firefox-bin";
    public static final String FIREFOX_DRIVER_LOCATION = "src/drivers/geckodriver_macos_arm64";

    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.bin", FIREFOX_APP_LOCATION);
        System.setProperty("webdriver.gecko.driver", String.format("%s/%s", PROJECT_PATH, FIREFOX_DRIVER_LOCATION));
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.selenium.dev/");
    }
}
