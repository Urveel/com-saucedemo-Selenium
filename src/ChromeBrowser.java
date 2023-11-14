import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://www.saucedemo.com/";
       //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        driver.manage().window().maximize();

        //Print the title of the page
        System.out.println("Print the Title of the page : "+ driver.getTitle());

        //print the current URL
        System.out.println("Print the URL : "+ driver.getCurrentUrl());

        //Enter the email ID
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("Prime");

        //Enter the password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("1234");

        //Click on login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        Thread.sleep(5000);

        //Print the current URL
        System.out.println("Print the current URL : "+ driver.getCurrentUrl());

        //Navigate to baseUrl
        driver.navigate().to(baseUrl);

        //refresh the page
        driver.navigate().refresh();

        //Close the Browser
        driver.close();





    }
}
