package QaAutomationLaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.security.PublicKey;
import java.time.Duration;

public class DropDownHandles {
    public static WebDriver driver;
    public void launchBrowser(){
        driver = new ChromeDriver();
        System.out.println("launch browser");
    }
    public void OpenWebsites(){
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("open website");
    }
    public void selectDropDownByIndex(){
       WebElement element= driver.findElement(By.id("oldSelectMenu"));
        Select select=new Select(element);
       select.selectByIndex(5);  // SelectByIndex
    }
    public void SelectVisibleText(){
     WebElement webelement=  driver.findElement(By.id("cars"));
     Select s=new Select(webelement);
     s.selectByVisibleText("Audi");
    }
    public void waitImplicity(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("to use implicitywait ");
    }
    public void teardown(){
        driver.close();
        System.out.println("browser closed");
}
    public static void main(String args[]){
        DropDownHandles dd=new DropDownHandles();
        dd.launchBrowser();
        dd.OpenWebsites();
        dd.selectDropDownByIndex();
        dd.SelectVisibleText();
        dd.waitImplicity();
        dd.teardown();
    }

}
