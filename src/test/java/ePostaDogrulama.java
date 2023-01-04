import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ePostaDogrulama {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trendyol.com");
        driver.findElement(By.id("Combined-Shape")).click();
        driver.findElement(By.xpath("(//*[@class='link-text'])[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/button[2]/span")).click();
        WebElement mailKutusu = driver.findElement(By.id("register-email"));
        mailKutusu.click();
        mailKutusu.sendKeys("deneme-2@gmail.com");
        mailKutusu.sendKeys(Keys.TAB);
        WebElement sifreKutusu = driver.findElement(By.id("register-password-input"));
        sifreKutusu.sendKeys("deneme12345");

        driver.findElement(By.xpath("(//div[@class='ty-mgr-2 ty-relative ty-checkbox-container'])[1]")).click();
        driver.findElement(By.xpath("(//div[@class='ty-mgr-2 ty-relative ty-checkbox-container'])[2]")).click();

        driver.findElement(By.xpath("//button[@class='q-primary q-fluid q-button-medium q-button submit']")).click();


        WebElement dogrulamaSayfa = driver.findElement(By.xpath("(//div[text()])[1]"));

        Assert.assertTrue(dogrulamaSayfa.isDisplayed());



        driver.close();


    }
}
