package day1_Navigation;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //I want to see full window open on full screen
        driver.manage().window().maximize();

        String practiceWebURL = "http://practice.cybertekschool.com/";
        //go to practice

        driver.get(practiceWebURL);
        Thread.sleep(3000);
        //go to google
        String gglURL = "https://www.google.com";
        driver.navigate().to(gglURL);

        //back to practice
        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        driver.navigate().refresh();

        //to close drive - browser

        driver.close();
        driver.quit();


    }
}
