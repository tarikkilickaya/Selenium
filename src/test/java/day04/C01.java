package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // 2- Add Element butonuna 10 kez basin
        WebElement addElementButonu = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        int a = 1;
        while (a <= 10) {
            addElementButonu.click();
            a++;
        }
        // 3- Add Element butonuna 10 kez basıldığını test ediniz

        // 4- Delete butonuna görünmeyene kadar basınız
        WebElement deleteButonu = driver.findElement(By.xpath("//button[@class='added-manually']"));
        int b = 1;
        while (b <= 10) {
            deleteButonu.click();
            b++;
        }
        // 5- Delete butonunun görünmediğini test ediniz
        // 6- Sayfayı kapatın

    }
}