package QaAutomationLaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserCommands2 {
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
    public void getText(){
    WebElement element=    driver.findElement(By.name("username"));
        System.out.println(" getting the text"+element.getText());
    }
    public void getSize(){
        WebElement element=    driver.findElement(By.name("username"));
        System.out.println(" getting the text"+element.getSize());
    }
    public void getcssValue(){
        WebElement elementLogin= driver.findElement(By.xpath("//button"));
        System.out.println("getcssvalue:"+elementLogin.getCssValue("background colour"));
    }
   public void gettagName(){
       WebElement elementpass= driver.findElement(By.name("password"));
       System.out.println("gettagname "+elementpass.getTagName());
   }
    public void getAttribute(){
        WebElement elementpass= driver.findElement(By.name("password"));
        System.out.println("gettagname "+elementpass.getAttribute("name"));
    }

    public void teardown(){
        driver.quit();
        System.out.println("close the browser");
    }
    public static void main(String[] args){
        BrowserCommands2 bc = new BrowserCommands2();
        bc.launchBrowser();
        bc.OpenWebsites();
        bc.getText();
        bc.gettagName();
        bc.getcssValue();
        bc.getSize();
        bc.getAttribute();

    }

}
