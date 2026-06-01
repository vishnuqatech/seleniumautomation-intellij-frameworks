package QaAutomationLaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigationCommands {
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
   public void  RefreshPage(){
        driver.navigate().refresh();
        System.out.println("refresh the page");
   }
   public void BackPage(){
        driver.navigate().back();
       System.out.println(" back the page ");
   }
   public void ForwardPage(){
        driver.navigate().forward();
        System.out.println("Forward page ");
   }
   public void ToUrl(){
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("torul");
   }
    public void teardown(){
        driver.quit();
        System.out.println("closed the browser");
    }
    public static void main(String[] args){
        NavigationCommands n = new NavigationCommands();
        n.launchBrowser();
        n.OpenWebsites();
        n.Enterpassword();
        n.Enterpassword();
        n.ClickOnLogin();
        n.ImplicitWait();
        n.RefreshPage();
        n.BackPage();
        n.ForwardPage();
        n.ToUrl();
        n.teardown();


    }
}
