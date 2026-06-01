package QaAutomationLaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckBoxHandle {
    public static WebDriver driver;
    public void launchBrowser(){
        driver = new ChromeDriver();
        System.out.println("launch browser");
    }
    public void OpenWebsites(){
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("open website");
    }
public void scrollDown(){
       WebElement element= driver.findElement(By.xpath("//label[text()='Sports']"));
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView(true);", element);
       System.out.println("scroll down");
}
public void CheckBox(){
      WebElement webElement=   driver.findElement(By.xpath("//label[text()='Reading']"));
      webElement.click();
      System.out.println("handle checkbox to click methods");
}
public void UnchekBox(){
    WebElement webElement=   driver.findElement(By.xpath("//label[text()='Reading']"));
    webElement.click();
    System.out.println("handle Uncheckbox to click methods");
}
public void ValidateIsDisplayed(){
   WebElement webelement=driver.findElement(By.xpath("//label[text()='Music']"));
        webelement.click();
        if(webelement.isDisplayed()){
            System.out.println("Is Displayed");
        }else{
            System.out.println("IS Not Dispalyed");
    }
}
public void validateIsSelected(){
    WebElement Isselectedelement=driver.findElement(By.xpath("//label[text()='Male']"));
       Isselectedelement.click();
    if(Isselectedelement.isSelected()){
        System.out.println("The element is Selected ");
    }else{
        System.out.println("The element is Not Selected ");
    }
}
public void ValiadteIsEnabled(){
      WebElement IsEnabledElement  = driver.findElement(By.id("submit"));
            IsEnabledElement.click();
            if(IsEnabledElement.isEnabled()){
                System.out.println("Is Enabled Element");
            }else{
                System.out.println("Is not Enabled Element ");
            }
}
public void teardown(){
        driver.quit();
        System.out.println("teardown the browser");
}
public static void main(String[] args){CheckBoxHandle ch= new CheckBoxHandle();
     ch.launchBrowser();
     ch.OpenWebsites();
     ch.scrollDown();
     ch.CheckBox();
     ch.CheckBox();
     ch.ValidateIsDisplayed();
     ch.validateIsSelected();
     ch.ValiadteIsEnabled();
     ch.teardown();



}














}
