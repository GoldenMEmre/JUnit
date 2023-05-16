package day10_actionsClass_Faker_FileTestleri;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C05_FileDownloadTest extends TestBase{

    @Test
    public void test01() throws InterruptedException {

        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");
        //3. n.png dosyasını indirelim
        WebElement fotoElementi= driver.findElement(By.linkText("n.png"));
        fotoElementi.click();
        Thread.sleep(3000);
        //4. Dosyanın başarıyla indirilip indirilmediğini test edelim

        // Dosyayi İndirilenler klasorune indirecek

        //String dosyaYolu="C:\Users\hasba\Downloads\n.png";


        //Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

        // herkesin bilgisayarinda farkli bir dosya hiyerarsisi oldugundan
        // herkesin dosya yolu birbirinden farkli olur
        // Dosya yolunu dinamik hale getirmek icin Java'dan yardim alacagiz
        //C:\Users\emre.cigit\Downloads\foto.png"
        //"C:\Users\Berke\Downloads\foto.png"

        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));

    }



}
