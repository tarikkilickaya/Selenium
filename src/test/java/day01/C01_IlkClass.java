package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {
        /*
        En temel haliyle bir otomasyon yapmak adına classa otomasyon için gerekli olan web driverın yerini göstermek gerekir.
        Bunun için Java kütüphanesinden System.setProperty() methodunu kullanılır ve methodun içine ilk olarak driver yazılır.
        İkinci olarak onun fiziki yolu kopyalanır.
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("Actual Title : " + driver.getTitle()); // Gidilen sayfanın başlığını getirir.
        System.out.println("Actual URL : " + driver.getCurrentUrl()); // Gidilen sayfanın URL'ini getirir.
    }
}