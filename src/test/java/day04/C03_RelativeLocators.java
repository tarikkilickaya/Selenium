package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


import java.time.Duration;

public class C03_RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html sayfasına gidiniz
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        // 2) Relative locator kullanarak Berlin web elementini tıklayınız.
        WebElement nyc = driver.findElement(By.id("pid3_thumb"));
        WebElement bayArea = driver.findElement(By.id("pid8_thumb"));
        WebElement berlin = driver.findElement(RelativeLocator.with(By.tagName("img")).below(nyc).toLeftOf(bayArea));
        berlin.click();

    }
}