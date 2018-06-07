import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {
    private String email = "";
    private String password = "";

    void getEmailAndPassword() {
        Scanner reader = new Scanner(System.in);

        // get email from user
        System.out.println("Email: ");
        this.email = reader.next();

        // get password from user
        System.out.println("Password: ");
        this.password = reader.next();
    }

    void loginAndGetNotification() {
        // locate the chrome driver file
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        // create an instance of chromeDriver
        WebDriver driver = new ChromeDriver();

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        // navigate to facebook.com
        driver.get("https://www.facebook.com");

        // get reference to email input field
        WebElement email = driver.findElement(By.id("email"));

        // set user email into the email input field
        email.sendKeys(this.email);

        // get reference to password input field
        WebElement password = driver.findElement(By.id("pass"));

        // set user password into the password input field
        password.sendKeys(this.password);

        // click the login button
        driver.findElement(By.id("loginbutton")).click();

        // get notification element by id and get the value
        WebElement notification = driver.findElement(By.id("notificationsCountValue"));

        // parse the value into int
        int notificationCount = Integer.parseInt(notification.getText());

        // display the result
        System.out.println("Number of Notifications : " + notificationCount);
    }
}