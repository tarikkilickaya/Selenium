package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Amazon sayfasına git
        driver.get("https://amazon.com");
        // Sayfa başlığını yazdır
        System.out.println("Sayfa başlığı : " + driver.getTitle());
        // Sayfa başlığının "Amazon" içerdiğini test edin
        String actualTitle = driver.getTitle();
        String istenenKelime = "Amazon";
        if (actualTitle.contains(istenenKelime)) {
            System.out.println("Title testi PASSED");
        } else System.out.println("Title testi FAILED");
        // Sayfa adresiniz yazdırın
        System.out.println("Sayfa adresi : " + driver.getCurrentUrl());
        // Sayfa URL'inin "amazon" içerip içermediğini test edin
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "amazon";
        if (actualUrl.contains(arananKelime)) {
            System.out.println("URL testi PASSED");
        } else System.out.println("URL testi FAILED");
        // Sayfanın handle değerini yazdırın
        System.out.println("Handle değeri : " + driver.getWindowHandle());
        // Sayfa HTML kodlarında "Gateway" kelimesinin geçtiğini test edin
        String actualPageSources = driver.getPageSource();
        String htmlArananKelime = "Gateway";
        if (actualPageSources.contains(htmlArananKelime)) {
            System.out.println("Sourcecode testi PASSED");
        } else System.out.println("Sourcecode testi FAILED");
        // Sayfayı kapatın
        driver.close();
    }
}