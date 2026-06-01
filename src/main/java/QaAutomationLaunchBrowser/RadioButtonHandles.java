package QaAutomationLaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButtonHandles {
    public static WebDriver driver;
    public void launchBrowser(){
        driver = new ChromeDriver();
        System.out.println("launch browser");
    }
    public void OpenWebsites(){
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("open website");
    }
    public void RadioButtonHanlde(){
       WebElement element= driver.findElement(By.xpath("(//label[text()='Male'])[1]"));
       element.click();
       System.out.println("to click on male radio button");
        if(element.isSelected()){
            System.out.println("Element is Selected ");
        }else{
            System.out.println("Element is Not Selected ");
        }
    }
    public void validateIsDisplay(){
       WebElement webelement= driver.findElement(By.xpath("(//label[text()='Female'])[1]"));
       if(webelement.isDisplayed()){
           System.out.println("Webelement is displayed");
       }else{
           System.out.println("Webelement is not displayed ");
       }
    }
    public void validateIsEnableButton(){
        WebElement enableElement=driver.findElement(By.xpath("(//label[text()='Male'])[2]"));
        if(enableElement.isEnabled()){
            System.out.println("Element is abled");
        }else {
            System.out.println("Element is  disabled ");
        }
    }
    public void teardown(){
        driver.quit();
        System.out.println("closed the browser");
    }
    public static void main(String[] args){
        RadioButtonHandles rb= new RadioButtonHandles();
        rb.launchBrowser();
        rb.OpenWebsites();
        rb.RadioButtonHanlde();
        rb.validateIsDisplay();
        rb.validateIsEnableButton();
        rb.teardown();






    }
}
