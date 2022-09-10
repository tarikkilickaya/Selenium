package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com.tr");
        // navigate().to methodu sayfada ileri geri yapacaksak kullanılır.
        // get() methodu gibi istenen URL'e götürür.

        driver.navigate().to("https://techproeducation.com");

        // Tekrar amazon sayfasına dönelim.
        Thread.sleep(3000);
        driver.navigate().back();

        // Tekrar techpro sayfasına dönelim.
        Thread.sleep(3000);
        driver.navigate().forward();

        // techpro sayfasını yenileyelim.
        Thread.sleep(3000);
        driver.navigate().refresh();

        // Son olarak sayfayı kapatalım.
        driver.close();

    }
}