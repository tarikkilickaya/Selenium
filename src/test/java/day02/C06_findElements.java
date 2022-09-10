package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class C06_findElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Amazon sayfasına gidiniz.
        driver.get("https://amazon.com");
        // Amazon sayfasındaki tagları a olanların sayısını yazdırınız
        List<WebElement> tag = driver.findElements(By.tagName("a"));
        System.out.println("a tagının sayısı : " + tag.size());
        driver.quit();
    }
}