package QaAutomationLaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDownHandles2 {
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
    public void IsMultiSelect() {
        WebElement webelement = driver.findElement(By.id("cars"));
        Select s = new Select(webelement);
        if (s.isMultiple()) {
            s.selectByIndex(3);
            s.selectByValue("saab");
            s.selectByVisibleText("Volvo");
            // print all selected element
            WebElement getfirstseleted= s.getFirstSelectedOption();
            System.out.println("get first selectedoptions"+getfirstseleted.getText());
            // to getalloptions
            List <WebElement> getoptions =s.getOptions();
            for(WebElement getOptionss :getoptions){
                System.out.println("getoptions :"+getOptionss.getText());
            }
            //getAllSelectedoptions
            List<WebElement> listWebElement=s.getAllSelectedOptions();
            for(WebElement options :listWebElement)
            System.out.println("cars list selected : "+options.getText());
            // Use Implicitty wait for wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            System.out.println("to use implicitywait ");
            // DeselectOptions
            s.deselectByIndex(3);
            s.deselectByValue("saab");
            s.deselectByVisibleText("Volvo");
        }
    }
    public void implicitwait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("to use implicitywait ");
    }
    public void teardown(){
        driver.quit();
        System.out.println("closed the browser");
    }
    public static void main(String[] args){
        DropDownHandles2 dd= new DropDownHandles2();
        dd.launchBrowser();
        dd.OpenWebsites();
        dd.IsMultiSelect();
        dd.implicitwait();
        dd.implicitwait();
    }

}
