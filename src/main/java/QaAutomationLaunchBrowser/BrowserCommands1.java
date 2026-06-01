package QaAutomationLaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserCommands1 {
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
        driver.findElement(By.name("username")).sendKeys("Admin");
        System.out.println("Enter the useranme");
    }
    public void Enterpassword(){
        driver.findElement(By.name("password")).sendKeys("admin123");
        System.out.println("Enter the password");
    }
    public void ClickOnLogin(){
        driver.findElement(By.xpath("//button")).click();
        System.out.println("click on login button");
    }
   public void ImplicitWait(){
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

   }

    public void getUrl(){
        System.out.println("get current url : "+driver.getCurrentUrl());
    }
    public void getTitle(){
        System.out.println("get titles :"+driver.getTitle());
    }
    public void getPageSource(){
        System.out.println("get  page source :"+driver.getPageSource());
    }
    public void teardown(){
        driver.quit();
        System.out.println("closed the browser");
    }
    public static void main (String[] args){

        BrowserCommands1 b= new BrowserCommands1();
        b.launchBrowser();
        b.OpenWebsites();
        b.Enterusername();
        b.Enterpassword();
        b.ClickOnLogin();
        b.ImplicitWait();
        b.getTitle();
        b.getUrl();
        b.getPageSource();
        b.teardown();


    }

}