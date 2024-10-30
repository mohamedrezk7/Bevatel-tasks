import com.shaft.validation.Validations;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.HidesKeyboard;
import org.testng.asserts.SoftAssert;

public class SignUpTests extends TestBase  {
  SplashPage splashpage;
  HomePage homepage;
  MyAccountPage myaccountpage;
  SignUpPage signuppage;

  @Test(priority = 1)
    public void test_RegisterUserWithValidData(){
      splashpage = new SplashPage(driver);
      homepage =new HomePage(driver);
      myaccountpage = new MyAccountPage(driver);
      signuppage =new SignUpPage(driver);
      splashpage.clickAllowButton();
      homepage.clickAccountButton();
      myaccountpage.clickSignUpButton();
      signuppage.sendUsernameText("mohamedRezk");
      signuppage.sendEmailText("moreeb235528@nestvia.com");
      signuppage.sendPhoneText("01099653580");
      signuppage.sendPasswordText       ("12345678");
      signuppage.sendConfirmPasswordText("12345678");
      signuppage.clickRegisterButton();
      signuppage.waitOtpVerificationWordToAssert();
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(driver.findElement(By.id
               ("com.eboutiques.app:id/txtGreet"))
              .getText(),"OTP Verification");
  }
  @Test(priority = 2)
  public void test_ValidationOfFields(){
    splashpage = new SplashPage(driver);
    homepage =new HomePage(driver);
    myaccountpage = new MyAccountPage(driver);
    signuppage =new SignUpPage(driver);
    splashpage.clickAllowButton();
    homepage.clickAccountButton();
    myaccountpage.clickSignUpButton();
    signuppage.sendUsernameText("mohamed");
    signuppage.clickRegisterButton();
    signuppage.waitFrameErrorMessage();
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertTrue(driver.findElement
            (By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]"))
                 .isDisplayed());
    signuppage.sendEmailText("mfnb@gmail.com");
    signuppage.clickRegisterButton();
    signuppage.waitFrameErrorMessage();
    softAssert.assertTrue(driver.findElement
                    (By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]"))
            .isDisplayed());
    signuppage.sendPhoneText("01099658741");
    signuppage.clickRegisterButton();
    signuppage.waitFrameErrorMessage();
    softAssert.assertTrue(driver.findElement
                    (By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]"))
            .isDisplayed());
    signuppage.sendPasswordText("12345678");
    signuppage.clickRegisterButton();
    signuppage.waitFrameErrorMessage();
    softAssert.assertTrue(driver.findElement
                    (By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]"))
            .isDisplayed());
    signuppage.sendConfirmPasswordText("12345678");
    signuppage.clickRegisterButton();
    signuppage.waitFrameErrorMessage();
    softAssert.assertTrue(driver.findElement
                    (By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]"))
            .isDisplayed());
  }

}