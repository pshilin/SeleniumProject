package day1_Navigation;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver  = new ChromeDriver();

        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();

       // for verify title get title
        //   for verify URL ----->>

        String expectedURL = "https://www.etsy.com/";

        String actualURL = driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("I expected "+expectedURL+" but we got "+actualURL);
        }
        driver.close();
    }
}
