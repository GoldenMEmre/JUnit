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

public class C02 extends TestBaseBeforeClass{
    @Test
    public void test02() throws InterruptedException {

        String ilkWindowHandle = driver.getWindowHandle();

        //1. Open chrome browser
        driver.switchTo().newWindow(WindowType.TAB);
        //2. Go to “https://www.facebook.xn--com-9o0a
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@data-cookiebanner='accept_button']")).click();
        //3. Verify:
        driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();


        //● day dd has 31 day options
        WebElement dayElement = driver.findElement(By.id("day"));
        Select select = new Select(dayElement);

        int actualDaySize = select.getOptions().size();
        int expectedDaySize = 31;
        Assert.assertEquals(expectedDaySize,actualDaySize);

        //● month dd has 12 month options
        WebElement monthElement = driver.findElement(By.id("month"));
        select = new Select(monthElement);

        int actualMonthSize = select.getOptions().size();
        int expectedMonthSize = 12;
        Assert.assertEquals(expectedMonthSize,actualMonthSize);

        //● year dd has 115 year options
        WebElement yearElement = driver.findElement(By.id("year"));
        select = new Select(yearElement);

        int actualYearSize = select.getOptions().size();
        int expectedYearSize = 115;

        Assert.assertEquals(expectedYearSize,actualYearSize);

        //4. Select your date of birth

        select = new Select(dayElement);
        select.selectByVisibleText("24");

        select = new Select(monthElement);
        select.selectByValue("8");

        select = new Select(yearElement);
        select.selectByValue("1996");

        Thread.sleep(3000);

        //5. Quit browser
        driver.quit();
    }


}
