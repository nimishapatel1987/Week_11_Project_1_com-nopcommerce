package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;
import java.time.Duration;

public class Project_1_EdgeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Maximise Window
        driver.manage().window().maximize();
        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + title);

        //Get Current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //Get page source
        System.out.println("Page source: " + driver.getPageSource());

        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();

        //Find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        //typeemail to email field
        emailField.sendKeys("test1234@gmail.com");

        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        //type password to password field
        passwordField.sendKeys("1234");


        //Close the browser
        driver.quit();

    }
}
