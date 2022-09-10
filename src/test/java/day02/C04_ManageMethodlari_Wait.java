package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethodlari_Wait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://techproeducation.com");
        driver.close();
        /*
        İleride wait konusunu daha geniş olarak ele alacağız. Bir sayfa açılırken ilk etapta sayfanın içerisinde bulunan elementlere göre
        bir yükleme süresine ihtiyaç vardır. Veya bir web elementin kullanılabilmesi için zamana ihtiyaç olabilir.
        implicitlyWait() methodu bize sayfanın yüklenmesi ve sayfadaki elementlere ulaşım için beklenecek
        max süreyi belirleme fırsatı verir.
         */
    }
}