import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SplashPage extends PageBase  {


    public SplashPage(AppiumDriver appiumdriver) {
        super(appiumdriver);
    }
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    WebElement allowButton;

    public void clickAllowButton(){
        click(allowButton);
    }

}
