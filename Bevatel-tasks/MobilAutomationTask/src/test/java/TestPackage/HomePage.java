package TestPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

public class HomePage extends TestPackage.TestBase {
        public HomePage() throws MalformedURLException {
        }
        // open the app for first time function
        @Test(priority = 1)
        public void openApp() throws MalformedURLException {
        }
        // Click on start button
        @Test(priority = 2)
        public void ClickStartButton() throws MalformedURLException {
                driver.findElement(By.xpath("//android.widget.TextView[@text=\"ابدء دلوقتى\"]"))
                        .click();
                WebElement logo = driver.findElement(By.id("com.gameya.elgameya:id/action_bar_root"));
                Assert.assertEquals(logo.isDisplayed(),true);
        }
        // login With Invalid Data
        @Test(priority = 3)
        public void logInWithInvalidPhoneNumber(){
                WebElement TextBox=driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]"));
                TextBox.sendKeys("01099210147");
                WebElement message = driver.findElement(By.xpath("android.widget.FrameLayout"));
                Assert.assertEquals(message,"رقم هاتف خاطىء");
        }
        //login With valid Data
        @Test(priority = 4)
        public void LogInWithValidPhoneNumber(){
                WebElement TextBox=driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]"));
                TextBox.sendKeys("01099653207");
                WebElement LogInmButton = driver.findElement(By.xpath("driver.findElement(By.xpath(\"//android.widget.FrameLayout[@resource-id=\\\"android:id/content\\\"]\"));"));
                LogInmButton.click();
                WebElement TextShow = driver.findElement(By.id("com.gameya.elgameya:id/action_bar_root"));
                Assert.assertEquals(TextShow,"إثبات هويتك");

        }
}
