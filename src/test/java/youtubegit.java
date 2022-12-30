import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubegit {
    public static void main(String[] args) {

        System.setProperty("werbdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver browser = new ChromeDriver();
        browser.get("https://www.youtube.com");

    }
}
