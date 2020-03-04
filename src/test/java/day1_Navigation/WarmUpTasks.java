package day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUpTasks {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");

        //driver.manage().window().maximize();

        String expectedTitle = "bookit";

        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("Fail");
            System.out.println("I Expected to see "+expectedTitle+ " but this what i see "+actualTitle);
        }
        driver.close();
    }
}
