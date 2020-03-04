package day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUpTask2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver  = new ChromeDriver();

        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();

        // for verify title get title
        //   for verify URL ----->>

       // String expectedPartialURL = "cybertek-reservation";

       String actualURL = driver.getCurrentUrl();

        if(actualURL.contains("cybertek-reservation")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("we got "+actualURL);
        }
        driver.close();
    }
}
