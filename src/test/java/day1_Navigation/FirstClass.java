package day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main (String[]args) throws InterruptedException {
        System.out.println("Hello Selenium");

        //binary the driver and browser
        WebDriverManager.chromedriver().setup();

        //WebDriver obj need to be created --> Interface
        //I have a driver

        WebDriver driver = new ChromeDriver();

        //I want to open Google home page

        //how do you launch/open a web page?
        //by using get() --> url as String
       // driver.get("https://www.google.com");

        //Navigations
        //navigate().to() --> also opens a web page
        driver.navigate().to("https://www.google.com");

        //get() vs navigate().to()
        //get --> wait to load the page
        //to() --> does not wait

        //navigate().back() -->
        //1.GO TO GOOGLE
        //2. go to cybertek practice website

        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().to("http://practice.cybertekschool.com/");
        Thread.sleep(3000);
        driver.navigate().back();

        //navigate().forward()
        //go to practice --> google -->back to practice --> forward to google
        //--> forward to google


    }
}
