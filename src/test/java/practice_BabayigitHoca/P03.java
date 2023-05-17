package practice_BabayigitHoca;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
    static WebDriver driver;
    WebElement searchbox;
    /*    Exercise-1:

BeforeClass ile driver'i oluşturun ve class icinde static yapin
Maximize edin ve 10 sn bekletin
http://www.qooqle.com adresine gidin
1-arama kutusuna "12 Angry Men" yaz ip, cikan sonuc şayisini yazdinin
2-arama kutusuna "Vizontele" yaz ip, cikan sonuc şayisini yazdirin
3-arama kutusuna "Saving Private Ryan" yazıp, cikan sonuc şayisini yazdirin
AfterClass ile kapatin.
     */
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Before
    public void before(){
        driver.get("https://www.google.com");
        searchbox=driver.findElement(By.xpath("//*[@title='Ara']"));
    }
    @Test
    public void test01(){
        //driver.findElement(By.xpath("//div[text()='Tümünü reddet']")).click(); // Cookie den kurtulduk
        searchbox.sendKeys("12 Angry Men"+ Keys.ENTER);
    }
    @Test
    public void test02(){
        searchbox.sendKeys("Vizontele"+ Keys.ENTER);
    }
    @Test
    public void test03(){
        searchbox.sendKeys("Saving Private Ryan"+ Keys.ENTER);
    }
}
