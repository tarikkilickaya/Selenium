package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_SinifCalismasi {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        //b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();
        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement password = driver.findElement(By.id("session_password"));
        WebElement signIn = driver.findElement(By.name("commit"));
        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signIn.click();
        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement expectedUserId = driver.findElement(By.className("navbar-text"));
        if (expectedUserId.isDisplayed()) {
            System.out.println("ExpectedUser testi PASSED : " + expectedUserId.getText());
        } else System.out.println("ExpectedUser testi FAILED");
        // Bir web elementin üzerindeki yazıyı konsolda yazdırabilmek için getText() methodu kullanılır.

        // ***************** 2. Yol *****************

        String istenenUserYazisi = "testtechproed@gmail.com";
        String actualUserYazisi = expectedUserId.getText();
        if (actualUserYazisi.equals(istenenUserYazisi)) {
            System.out.println("TEST PASSED");
        } else System.out.println("TEST FAILED");

        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adres = driver.findElement(By.linkText("Addresses"));
        WebElement signOut = driver.findElement(By.linkText("Sign out"));

        if (adres.isDisplayed()) {
            System.out.println("Addresses testi PASSED");
        } else System.out.println("Addresses testi FAILED");

        if (signOut.isDisplayed()) {
            System.out.println("Sign Out testi PASSED");
        } else System.out.println("Sign Out testi FAILED");
        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Sayfada " + linklerListesi.size() + " tane link var.");

        // 4. Linkleri yazdırınız
        for (WebElement each : linklerListesi) {
            System.out.println("Linkler : " + each.getText());
        }

        //5. Linkleri lambda yazdırınız
        linklerListesi.forEach(t-> System.out.println(t.getText()));

        // 6. Sayfayı kapatın
        driver.quit();
    }
}