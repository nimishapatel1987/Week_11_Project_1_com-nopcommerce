package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Project_1_ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Launchthe the URL
        driver.get(baseUrl);
        //Maximum Window
        driver.manage().window().maximize();
        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + title);

        //Get Current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //Get page saurce
        System.out.println("Page source: " + driver.getPageSource());

        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();

        //Find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        //Type email to email field
        emailField.sendKeys("test1234@gmail.com");

        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("test1234");

        //Close the browser
        driver.quit();
    }


}
