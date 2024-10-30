import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SignUpPage extends PageBase {
    public SignUpPage(AppiumDriver appiumdriver) {
        super(appiumdriver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Hello! Register to get started\"]")
    WebElement welcomeMessage;

    @AndroidFindBy(id = "com.eboutiques.app:id/etName")
    WebElement usernameTextFiled;

    @AndroidFindBy(id = "com.eboutiques.app:id/etMail")
    WebElement emailAddressTextFiled;

    @AndroidFindBy(id = "com.eboutiques.app:id/etPhone")
    WebElement phoneNumberTextFiled;

    @AndroidFindBy(id = "com.eboutiques.app:id/etPassword")
    WebElement passwordTextFiled;

    @AndroidFindBy(id = "com.eboutiques.app:id/etPasswordConfirm")
    WebElement confirmPasswordTextFiled;

    @AndroidFindBy(id = "com.eboutiques.app:id/btnRegister")
    WebElement registerButton;

    @AndroidFindBy(id = "com.eboutiques.app:id/btnLogin")
    WebElement loginLink;

    @AndroidFindBy(id = "android:id/autofill_save_no")
    WebElement savePasswordPopUp;

    @AndroidFindBy(id = "com.eboutiques.app:id/txtGreet")
    WebElement otpVerification;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]")
    WebElement frameErrorMessage;

    public void getGreatMessageAttribute(String text){
        getAttribute(welcomeMessage, text);
    }

    public void sendUsernameText(String text) {
        clear(usernameTextFiled);
        sendText(usernameTextFiled, text);
    }

    public void sendEmailText(String text) {
        clear(emailAddressTextFiled);
        sendText(emailAddressTextFiled, text);
    }

    public void sendPhoneText(String text) {
        clear(phoneNumberTextFiled);
        sendText(phoneNumberTextFiled, text);
    }

    public void sendPasswordText(String text) {
        clear(passwordTextFiled);
        sendText(passwordTextFiled, text);
    }

    public void sendConfirmPasswordText(String text) {
        clear(confirmPasswordTextFiled);
        sendText(confirmPasswordTextFiled, text);
    }

    public void clickRegisterButton(){
        click(registerButton);
    }
    public void clickLoginButton(){
        click(loginLink);
    }
    public void clickNeverSavePassword(){
        click(savePasswordPopUp);
    }
    public void getTextWordAfterSuccessfulRegister(){
        getText(otpVerification);
    }
    public void waitOtpVerificationWordToAssert(){
        waitForVisibility(otpVerification);
    }
    public void waitFrameErrorMessage(){
        waitForVisibility(frameErrorMessage);
    }

}
