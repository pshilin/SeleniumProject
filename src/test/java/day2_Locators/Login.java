package day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://app.vytrack.com/user/login");
driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager52");
        Thread.sleep(1000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        Thread.sleep(1000);
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(3000);


        String expectedURL = "https://app.vytrack.com/";
        String actualURL = driver.getCurrentUrl();
        if(actualURL.equals(expectedURL)){
            System.out.println("PASS - Home Page VERIFIED");
        }else{
            System.out.println("Fail!!!  expected to see "+expectedURL+" but see "+actualURL);
        }



        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        if(actualURL.equals(expectedURL)){
            System.out.println("PASS - Home Page VERIFIED");
        }else{
            System.out.println("Fail!!!  expected to see "+expectedURL+" but see "+actualURL);
        }
        Thread.sleep(4000);
        driver.close();

    }
}
