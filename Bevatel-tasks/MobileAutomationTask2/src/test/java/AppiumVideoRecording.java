import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

public class AppiumVideoRecording{
    private AndroidDriver driver;
    public static void startRecording(AndroidDriver driver) {
        driver.startRecordingScreen();
    }
    public static void stopAndSaveRecording(String fileName , AndroidDriver driver) {
        String video = driver.stopRecordingScreen();
        byte[] videoData = Base64.getDecoder().decode(video);
        try (FileOutputStream fos = new FileOutputStream(new File(fileName))) {
            fos.write(videoData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}