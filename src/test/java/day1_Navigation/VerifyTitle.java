package day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
    public static void main(String[] args) {
        /*
        * 1.Go to cybertek practice web site
        * 2.Verify Title - should have expected title: Practice
        *
        * Actual Title?---->
        *
        * "http://practice.cybertekschool.com/"
        * */


        // connect browser and driver
        //setup browser

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        driver.manage().window().maximize();

        String expectedTitle = "Practice";


        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("I expected "+expectedTitle+" the actual title is "+actualTitle);
        }
        driver.close();



    }
}
