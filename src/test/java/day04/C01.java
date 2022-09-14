package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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
        List<WebElement> deleteButonListesi = driver.findElements(By.xpath("//*[text()='Delete'"));
        int beklenenDeleteButonSayisi = 10;
        int olanDeleteButonSayisi = deleteButonListesi.size();
        if (olanDeleteButonSayisi == beklenenDeleteButonSayisi) {
            System.out.println("PASSED");
        } else System.out.println("FAILED");
        // 4- Delete butonuna görünmeyene kadar basınız
        for (int i = 0; i < 10; i++) {
            driver.findElement(By.xpath("(//*[text()='Delete')[1]"));
        }
        // 5- Delete butonunun görünmediğini test ediniz
        WebElement anaSayfa = driver.findElement(By.className("no-js"));
        String deleteButonu = "Delete";
        if (!anaSayfa.getText().contains(deleteButonu)){
            System.out.println("TEST PASSED");
        } else System.out.println("TEST FAILED");
        // 6- Sayfayı kapatın

        driver.close();
    }
}