package mobileFinal;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calc {

    private AndroidDriver <MobileElement> driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        String ambiente = "remoto";
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        URL remoteUrl;

        switch (ambiente) {

            case "remoto":
                desiredCapabilities.setCapability("platformName", "Android");
                desiredCapabilities.setCapability("platformVersion", "9.0");
                desiredCapabilities.setCapability("browserName", "");
                desiredCapabilities.setCapability("appiumVersion", "1.19.2");
                desiredCapabilities.setCapability("deviceName", "Samsung Galaxy S9 FHD GoogleAPI Emulator");
                desiredCapabilities.setCapability("deviceOrientation", "portrait");
                desiredCapabilities.setCapability("app", "storage:filename=Calculator_v7.8 (271241277)_apkpure.com.apk");
                desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
                desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
                desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
                desiredCapabilities.setCapability("SAUCE_USERNAME", "Tata15");
                desiredCapabilities.setCapability("SAUCE_ACCESS_KEY", "ecfc4470-b6a0-41bc-a735-8e5b27226b27");

                remoteUrl = new URL("https://Tata15:ecfc4470-b6a0-41bc-a735-8e5b27226b27@ondemand.us-west-1.saucelabs.com:443/wd/hub");
                break;
            default:
                remoteUrl = new URL("http://localhost:4723/wd/hub");
                break;
        }

        driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
    }

    @Test
    public void soma() {
        MobileElement el2 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_5");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("plus");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_3");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.google.android.calculator:id/result_final");
        el6.click();
    }

    @Test
    public void multiplicar() {
        MobileElement el2 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_8");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("multiply");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_2");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.google.android.calculator:id/result_final");
        el6.click();
    }

    @Test
    public void dividir() {
        MobileElement el2 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_6");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("divide");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_3");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.google.android.calculator:id/result_final");
        el6.click();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}