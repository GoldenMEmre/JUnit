package day08_testBase__JSalerts_iframe;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_TestBaseIlkClass extends TestBase{
//Obje oluşturarak, extends yaparak,methodu static yapararak "TestBase"deki methodlar kullanılabilir.Bunun
//icin TestBase'deki methodlarin access modifier'i "protected" yapilmalidir.
    @Test
    public void test01() {
        // amazon'a gidelim
        driver.get("https://www.amazon.com");

        // Nutella icin arama yapalim
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("Nutella" + Keys.ENTER);

        // arama sonuclarinin Nutella icerdigini test edelim
        String expectedicerik="Nutella";
        String actualAramaSonucYazisi= driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]")).getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedicerik));
    }

}

