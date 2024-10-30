import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends PageBase {

    public MyAccountPage(AppiumDriver appiumdriver) {
        super(appiumdriver);
    }

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id=\"com.eboutiques.app:id/btnCart\"]/android.widget.ImageView")
    WebElement cartButton;

    @AndroidFindBy(id = "com.eboutiques.app:id/txtGreet")
    WebElement greatMessage;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.eboutiques.app:id/btnRegister\"]/android.widget.ImageView")
    WebElement signUpButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.eboutiques.app:id/btnLogin\"]/android.widget.ImageView")
    WebElement loginButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.eboutiques.app:id/btnCountry\"]/android.widget.ImageView[3]")
    WebElement countryButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.eboutiques.app:id/btnLanguage\"]/android.widget.ImageView[2]")
    WebElement languageButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.eboutiques.app:id/btnNotifications\"]/android.widget.ImageView[2]")
    WebElement notificationButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.eboutiques.app:id/btnHelp\"]/android.widget.ImageView[2]")
    WebElement helpButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.eboutiques.app:id/btnContact\"]/android.widget.ImageView[2]")
    WebElement contactUsButton;

    @AndroidFindBy(id = "com.eboutiques.app:id/btnFb")
    WebElement facebookIcon;

    @AndroidFindBy(id = "com.eboutiques.app:id/btnInsta")
    WebElement instagramIcon;

    @AndroidFindBy(id = "com.eboutiques.app:id/btnLinked")
    WebElement linkedinIcon;

    @AndroidFindBy(id = "com.eboutiques.app:id/btnTwitter")
    WebElement xIcon;

    @AndroidFindBy(id = "com.eboutiques.app:id/btnAbout")
    WebElement aboutUsButton;

    @AndroidFindBy(id = "com.eboutiques.app:id/btnPrivacy")
    WebElement privacyPolicyButton;

    @AndroidFindBy(id = "com.eboutiques.app:id/btnTerms")
    WebElement termAndConditionsButton;

    public void clickSignUpButton(){
        click(signUpButton);
    }

}
