package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Amazon {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //1-C01_TekrarTesti isimli bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4- Sayfayi “refresh” yapin
        Thread.sleep(2000);
        driver.navigate().refresh();
        //5 Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String sayfaBasligi = driver.getTitle();
        String sayfaBasligindaArananKelime = "Spend less";
        if (sayfaBasligi.contains(sayfaBasligindaArananKelime)) {
            System.out.println("Sayfa başlığı içeriyor");
        } else System.out.println("İçermiyor");
        //6 Gift Cards sekmesine basin
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@data-csa-c-content-id='nav_cs_gc']")).click();
        //7 Birthday butonuna basin
        Thread.sleep(2000);
        WebElement birthdayButon = driver.findElement(By.xpath("//*[@alt='Birthday gift cards']"));
        birthdayButon.click();
        //8 Best Seller bolumunden ilk urunu tiklayin
        Thread.sleep(2000);
        //driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click(); // benim yaptığım 1. yol
        driver.findElement(By.xpath("//*[@alt='Amazon.com eGift Card']")).click(); // yahya hocamın yaptığı 2. yol
        //9- Gift card details’den 25 $’i secin
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@id='gc-mini-picker-amount-1'])[1]")).click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunUcreti = driver.findElement(By.xpath("(//*[@id='gc-live-preview-amount'])[1]"));
        if (urunUcreti.getText().contains("$25.00")) {
            System.out.println("Ürün fiyatı değişti");
        } else System.out.println("Ürün fiyatı değişmedi");
        //10-Sayfayi kapatin
        Thread.sleep(2000);
        driver.quit();
    }
}
