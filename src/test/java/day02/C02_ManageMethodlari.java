package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        /*
        Yeni bir Class olusturalim.C06_ManageWindow
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfayi simge durumuna getirin
        simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        Sayfayi fullscreen yapin
        Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // 1) Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");
        // 2) Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Pencere konumu : " + driver.manage().window().getPosition()); // Açılan browserın konumunu verir.
        System.out.println("Pencere ölçüleri : " + driver.manage().window().getSize()); // Açılan browserın ölçülerini verir.
        // 3)  Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        // 4) Simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        // 5) Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Maximize olduktan sonra pencere konumu : " + driver.manage().window().getPosition());
        System.out.println("Maximize olduktan sonra pencere ölçüleri : " + driver.manage().window().getSize());
        // 6) Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        // 7) Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Fullscreen olduktan sonra pencere konumu : " + driver.manage().window().getPosition());
        System.out.println("Fullscreen olduktan sonra pencere ölçüleri : " + driver.manage().window().getSize());
        // 8) Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}