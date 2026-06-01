package QaAutomationLaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlednyamicWebTables {
    public static WebDriver driver;
    public static void main(String[] args){
        driver = new ChromeDriver();
        System.out.println("launch browser");
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("open website");
        // Find the web table element
        WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
        //get all rows in table
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for(WebElement row:rows){
             List<WebElement>  col   =row.findElements(By.tagName("td"));
             for(WebElement column :col){
                 System.out.println(column.getText()+" | ");
             }
             System.out.println();
        }
      //  driver.close();

    }

}
