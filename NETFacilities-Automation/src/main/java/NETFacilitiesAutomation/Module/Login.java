package NETFacilitiesAutomation.Module;

import NETFacilitiesAutomation.utils.Reporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    public static void execute(WebDriver driver, ExtentTest test) throws Exception {
        //Login Flow


        //System.out.println("I am in login screen.");
        try{
            driver.get("https://mvc.netfacilities.com/");
            driver.findElement(By.xpath("//img[@id='dnn_Header1_LOGO1_imgLogo']")).isDisplayed();
            test.log(LogStatus.PASS,"Able to navigate to Login page.");
        }
        catch(Exception e){
            test.log(LogStatus.FAIL,"Unable to navigate to Login page.");
            Reporter.endReporter();
            Reporter.closeReporter();
            driver.close();
        }

        Thread.sleep(5000);
        driver.manage().window().maximize();
       // System.out.println("Window maximized");
        test.log(LogStatus.PASS,"Window is maximized.");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin1@nf.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tdksk23kdiKsel");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();
        Thread.sleep(3000);
        //System.out.println("Login completed. Now I am in myhome screen.");
        try{
            driver.findElement(By.xpath("//*[@class='dropbtn' and contains(text(),'Home')]")).isDisplayed();
                test.log(LogStatus.PASS,"Login complete! From here you can go to any module and perform any task.");
        }
        catch(Exception e){
            test.log(LogStatus.INFO,"Login complete but you are not in myhome screen!");
            driver.findElement(By.xpath("//img[@src='/Images/hut.png']")).click();
            driver.findElement(By.xpath("//*[@class='dropbtn' and contains(text(),'Home')]")).isDisplayed();
            test.log(LogStatus.PASS,"Login complete! From here you can go to any module and perform any task.");
        }
    }
}
