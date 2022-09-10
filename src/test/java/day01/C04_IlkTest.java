package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        1 - Amazon sayfasını gidiniz.
        2 - Başlığın "Amazon" içerdiğini test ediniz.
        3 - URL'in "amazon" içerdiğini test ediniz.
        4 - Sayfayı kapatınız.
         */

        driver.manage().window().maximize();

        // 1 - Amazon sayfasını gidiniz.
        driver.get("https://www.amazon.com.tr");

        // 2 - Başlığın "Amazon" içerdiğini test ediniz.
        String actualTitle = driver.getTitle();
        String istenenKelime = "Amazon";
        if (actualTitle.contains(istenenKelime)) {
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title testi FAILED");
        }

        // 3 - URL'in "amazon" içerdiğini test ediniz.
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "amazon";
        if (actualUrl.contains(arananKelime)) {
            System.out.println("URL testi PASSED");
        } else {
            System.out.println("URL testi FAILED");
        }

        // 4 - Sayfayı kapatınız.
        driver.close();
    }
}