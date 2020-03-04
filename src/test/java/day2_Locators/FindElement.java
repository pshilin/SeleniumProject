package day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
//Locator 1.ID
        //task
        //go to cybertek akta login page
        //write email to the box

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://cybertekschool.okta.com/");

        //write email to the box
        /*
        * 1.Find the text box first --> findElement() from WebDriver
        *
        * */
Thread.sleep(3000);
        WebElement emailBox = driver.findElement(By.id("okta-signin-username"));

        emailBox.sendKeys("pvshylin@gmail.com");


        Thread.sleep(3000);
        driver.findElement(By.id("okta-signin-password")).sendKeys("24Motuzi");
       // OR this way with storing  WebElement emailPassword = driver.findElement(By.id("okta-signin-password"))
        //emailPassword.sendKeys("24Motuzi");


       driver.findElement(By.id("okta-signin-submit")).click();



    }
}
