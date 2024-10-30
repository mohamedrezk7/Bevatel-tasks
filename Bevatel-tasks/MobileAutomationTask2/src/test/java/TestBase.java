import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    public static AndroidDriver driver;
    AppiumVideoRecording appiumRecord = new AppiumVideoRecording();
    @BeforeMethod
    public  void AndroidSetUp() throws MalformedURLException {
        UiAutomator2Options caps = new UiAutomator2Options();
        caps.setPlatformName("Android")
                .setPlatformVersion("14")
                .setAutomationName("uiAutomator2")
                .setDeviceName("emulator-5554")
                .setApp(System.getProperty("user.dir")+"/apps/eboutiques.apk");
        driver = new AndroidDriver(new URL ("http://127.0.0.1:4723"), caps);
        AppiumVideoRecording.startRecording(driver);
    }

    @AfterMethod
    public static void TearDown(ITestResult result) throws InterruptedException {
        AppiumVideoRecording.stopAndSaveRecording(result.getName()+".mp4" , driver);
        if(null != driver){
            driver.quit();
        }
    }
}
