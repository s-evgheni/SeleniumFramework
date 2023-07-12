import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest extends BrowserTest {
    public static final String CHROME_DRIVER_LOCATION = "src/drivers/chromedriver_macos_arm64";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", String.format("%s/%s", PROJECT_PATH, CHROME_DRIVER_LOCATION));
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
    }
}
