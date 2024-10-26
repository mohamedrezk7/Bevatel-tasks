package pages;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;
public class Home {
        protected AndroidDriver driver;
        public Home(UiAutomator2Options options) throws MalformedURLException {
            options.setDeviceName("1e872d04");
            options.setPlatformName("Android");
            options.setPlatformVersion("11");
            options.setAutomationName("UiAutomator2");
            options.setAppPackage("com.gameya.elgameya");
            options.setAppActivity("com.gameya.elgameya.MainActivity");
            driver =new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        }
//        public void openApp() throws MalformedURLException {
//            UiAutomator2Options options = new UiAutomator2Options();
//            options.setDeviceName("1e872d04");
//            options.setApp("C:\\apk\\True caller_ AI Call Blocker_14.27.7_APKPure.xapk");
//            options.setPlatformName("Android");
//            options.setPlatformVersion("11");
//            options.setAutomationName("UiAutomator2");
//            options.setAppPackage("com.gameya.elgameya");
//            options.setAppActivity("com.gameya.elgameya.MainActivity");
//            driver =new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        }
}
