import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class PageBase {

    AppiumDriver driver;
    public static final long WAIT = 10 ;

    public PageBase(AppiumDriver appiumdriver){
        PageFactory.initElements(new AppiumFieldDecorator(appiumdriver),this);
    }
    public void waitForVisibility (WebElement element) {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(WAIT));
        wait.until(ExpectedConditions.visibilityOf(element));
    };
    public void clear(WebElement element){
        waitForVisibility(element);
        element.clear();
    }
    public void click (WebElement element){
        waitForVisibility(element);
        element.click();
    }
    public void sendText(WebElement element , String text){
        waitForVisibility(element);
        element.sendKeys(text);
    }
    public String getAttribute(WebElement element , String Attribute){
        waitForVisibility(element);
        return  element.getDomAttribute(Attribute);
    }
    public void switchToAlert (WebElement element){
        waitForVisibility(element);
        driver.switchTo().alert().accept();
    }
    public String getText(WebElement element){
        return element.getText();
    }
}
