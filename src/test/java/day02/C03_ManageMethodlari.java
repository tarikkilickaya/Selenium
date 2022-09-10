package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        /*
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // 1) Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");
        // 2) Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın konumu : " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları : " + driver.manage().window().getSize());
        // 3) Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(20, 20)); // Sayfanın konumunu istenen şekilde ayarlar.
        driver.manage().window().setSize(new Dimension(600, 300)); // Sayfanın boyutlarını istenen şekilde ayarlar
        // 4) Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Sayfanın yeni konumu : " + driver.manage().window().getPosition());
        System.out.println("Sayfanın yeni boyutları : " + driver.manage().window().getSize());
        // 5) Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();
    }
}