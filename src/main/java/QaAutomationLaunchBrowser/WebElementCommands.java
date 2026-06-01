package QaAutomationLaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElementCommands {
    public static WebDriver driver;
    public void launchBrowser(){
        driver = new ChromeDriver();
        System.out.println("launch browser");
    }
    public void OpenWebsites(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("open website");
    }
    public void Enterusername(){
       WebElement element =driver.findElement(By.name("username"));
       element.sendKeys("Admin");
        System.out.println("Enter the useranme");
        System.out.println("gettext "+element.getText());
        if(element.isDisplayed()){
        System.out.println("element is displayed ");
        }else{
            System.out.println("element is Not displayed");
        }
    }
    public void Enterpassword(){
       WebElement elementpass= driver.findElement(By.name("password"));
        elementpass.sendKeys("admin123");
        System.out.println("Enter the password");
        if(elementpass.isSelected()){
            System.out.println("Element is Selected ");
        }else{
            System.out.println("Element is Not Selected ");
        }
    }
    public void ClickOnLogin(){
       WebElement elementLogin= driver.findElement(By.xpath("//button"));
        elementLogin.click();
        System.out.println("click on login button");
        if(elementLogin.isEnabled()){
            System.out.println("the element is Enabled ");
        }else{
            System.out.println("The element is Not Enabled");
        }
    }
    public void ImplicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void main(String[] args){
        WebElementCommands wc = new WebElementCommands();
        wc.launchBrowser();
        wc.OpenWebsites();
        wc.Enterusername();
        wc.Enterpassword();
        wc.ClickOnLogin();
        wc.ImplicitWait();






    }


}
