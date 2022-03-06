package co.com.android.certification.app.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    public static WebDriver getDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("appPackage", "com.experitest.ExperiBank");
        capabilities.setCapability("appActivity", "com.experitest.ExperiBank.LoginActivity");
        capabilities.setCapability("noReset", "true");
        return new AppiumDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }
}

/*
adb devices

Tener la app abierta
adb shell
dumpsys window windows | grep -E 'mCurrentFocus'
*/