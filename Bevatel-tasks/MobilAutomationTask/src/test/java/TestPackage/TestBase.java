package TestPackage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class TestBase {
    //create object for androidDriver
    public static AndroidDriver driver;

    // create UiAutomator capabilities
    public static UiAutomator2Options options = new UiAutomator2Options();
    @BeforeSuite
    public void startDriver() throws MalformedURLException {
        options.setDeviceName("1e872d04");
//        options.setApp("C:\\apk\\Truecaller_ AI Call Blocker_14.27.7_APKPure.xapk");
        options.setPlatformName("Android");
        options.setPlatformVersion("11");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.gameya.elgameya");
        options.setAppActivity("com.gameya.elgameya.MainActivity");
        driver =new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }
    @AfterSuite
    public void stopDriver(){
        driver.quit();
    }
}
