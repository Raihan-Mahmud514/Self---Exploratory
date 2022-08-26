package NETFacilitiesAutomation.Module;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Myhome {
    public static void execute(WebDriver driver, ExtentTest test){

        try{
            driver.findElement(By.xpath("//img[@src='/Images/watch.png']")).isDisplayed();
                    test.log(LogStatus.PASS, "Found the Recent Visited Records icon.");
        }
        catch (Exception e)
        {
            test.log(LogStatus.FAIL, "Could not found the Recent Visited Records icon.");
        }

        try{
            driver.findElement(By.xpath("//a[@href='/shortcut/list']//img")).isDisplayed();
            test.log(LogStatus.PASS, "Found the Shortcuts icon.");
        }
        catch (Exception e)
        {
            test.log(LogStatus.FAIL, "Could not found the Shortcuts icon.");
        }
        try{
            driver.findElement(By.xpath("//img[@src='/Images/piechart.png']")).isDisplayed();
            test.log(LogStatus.PASS, "Found the Dashboard icon.");
        }
        catch (Exception e)
        {
            test.log(LogStatus.FAIL, "Could not found the Dashboard icon.");
        }
        try{
            driver.findElement(By.xpath("//img[@src='/Images/hut.png']")).isDisplayed();
            test.log(LogStatus.PASS, "Found the Myhome icon.");
        }
        catch (Exception e)
        {
            test.log(LogStatus.FAIL, "Could not found the Myhome icon.");
        }
        try{
            driver.findElement(By.xpath("//div[@id='MessageNotification']//button[@class='dropbtn23']")).isDisplayed();
            test.log(LogStatus.PASS, "Found the Message icon.");
        }
        catch (Exception e)
        {
            test.log(LogStatus.FAIL, "Could not found the Message icon.");
        }
    }
}
