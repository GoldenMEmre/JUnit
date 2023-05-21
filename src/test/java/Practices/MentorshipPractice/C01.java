package Practices.MentorshipPractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;
import utilities.TestBaseBeforeClass;

import java.util.List;

public class C01 extends TestBaseBeforeClass{

    @Test
    public void test01() {
        //TC1: Amazon link count:

        //2. Go to “https://www.amazon.com/”
        driver.get("https://www.amazon.com/");
        //3. Get all links
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //4. Get number of links that has text
        List<WebElement> linksWithText = driver.findElements(By.xpath("(//a[@class='nav_a'])"));
        System.out.println(linksWithText.size());

        List<WebElement> navFooter = driver.findElements(By.xpath("(//span[@class='navFooterDescText'])"));


        //5. Print to console only the links that has text

        for (WebElement eachlinksWithText : linksWithText
        ) {
            System.out.println(eachlinksWithText.getText());
        }

    }
}
