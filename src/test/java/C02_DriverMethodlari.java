import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com.tr/");
        // Kaynak kodlarının içinde "Gateway" ifadesinin olduğunu test ediniz
        // System.out.println(driver.getPageSource()); // Sayfadaki kaynak kodlarını verir.
        String istenenKelime = "Gateway";
        if (driver.getPageSource().contains(istenenKelime)) {
            System.out.println("PageSources testi PASSED");
        } else {
            System.out.println("PageSources testi FAILED");
        }
        driver.close(); // Sayfayı kapatır.
        // driver.quit(); Birden fazla sayfa varsa hepsini kapatır.
    }
}