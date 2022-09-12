package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // 2- Add Element butonuna basin
        WebElement addElementButonu = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementButonu.click();
        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonu.isDisplayed()) {
            System.out.println("Delete butonu testi PASSED");
        } else System.out.println("Delete butonu testi FAILED");
        //Delete tusuna basin
        deleteButonu.click();
        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElements = driver.findElement(By.name("Add/Remove Elements"));
        if (addRemoveElements.isDisplayed()) {
            System.out.println("Add/Remove Elements testi PASSED");
        } else System.out.println("Add/Remove Elements testi FAILED");
    }
}