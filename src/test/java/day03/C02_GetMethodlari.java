package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_GetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Amazon sayfasına gidiniz
        driver.get("https://amazon.com.tr");
        //Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //Arama kutusunun tagName'inin input olduğunu test ediniz
        if (aramaKutusu.getTagName().equals("input")) {
            System.out.println("Arama kutusu tagName testi PASSED");
        } else System.out.println("Arama kutusu tagName testi FAILED");
        //Arama kutusunun name attritube değerinin "field-keywords" olduğunu test ediniz
        String beklenenName = "field-keywords";
        String asilName = aramaKutusu.getAttribute("name");
        if (beklenenName.equals(asilName)) {
            System.out.println("Attribute testi PASSED");
        } else System.out.println("Attribute testi FAILED");

        // Arama kutusunun konumunu yazdırınız
        System.out.println("Arama kutusunu konumu : " + aramaKutusu.getLocation());

        // Sayfayı kapatınız
        driver.quit();
    }
}