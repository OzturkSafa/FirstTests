import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class pratik01 {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.trendyol.com");
    }

    @After
    public void tearDown() {
        //driver.close;
    }

    @Test
    public void test01() throws InterruptedException {
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@class='vQI670rJ']"));
        Thread.sleep(3000);
        aramaKutusu.sendKeys("Bilgisayar" + Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='fltr-cntnr-ttl-area'])[4]")).click();
        Thread.sleep(3000);
        WebElement fiyatAralıgı = driver.findElement(By.xpath("(//div[@class='radio-button'])[6]"));
        Thread.sleep(3000);
        fiyatAralıgı.click();
        Thread.sleep(3000);
        List<WebElement> fiyatList = driver.findElements(By.xpath("//div[@class='dscrptn']"));

        String fiyatStr;
        Double fiyatDouble;
        Double bizimfiyat = 149.999;

        for (WebElement each : fiyatList
        ) {
            fiyatStr = each.getText();
            fiyatDouble = Double.parseDouble(fiyatStr);

            if (fiyatDouble == bizimfiyat) {
                bizimfiyat = fiyatDouble;
            }
            System.out.print("");
            System.out.println("urun fiyatı:" + bizimfiyat);
        }


    }
}
