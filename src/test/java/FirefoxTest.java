import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxTest extends BrowserTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.bin", FIREFOX_APP_LOCATION);
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.selenium.dev/");
    }
}
