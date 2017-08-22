package com.ymt.monkey;

import io.appium.java_client.ios.IOSDriver;
import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

/**
 * Created by sunsheng on 2017/5/26.
 */
public class TestMonkey {

    @Test
    public void testMonkey() {

        Monkey monkey = new AndroidMonkey();

        boolean result = monkey.run();

        while (result) {

            result = monkey.run();

        }

    }

    @Test
    public void test() {

    }

    @Test
    public void testJsoup() {


    }

    @Test
    public void testIosMonkey() {

        Monkey monkey = new IOSMonkey();

        boolean result = monkey.run();

/*        while (result) {

            result = monkey.start();

        }*/

    }

    @Test
    public void testIOS() throws Exception {


        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");

        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone (3)");
        capabilities.setCapability("platformVersion", "9.3.1");

        capabilities.setCapability("bundleId", "com.ymatou.Shopping");
        capabilities.setCapability("udid", "d36d600b4ece53a8bde8daf869790012a46842c3");

        capabilities.setCapability("automationName", "XCUITest");

        capabilities.setCapability("unicodeKeyboard", "True");
        capabilities.setCapability("resetKeyboard", "True");

        IOSDriver driver = new IOSDriver (new URL("http://127.0.0.1:4723/wd/hub"),
                capabilities);


        Thread.sleep(5000);

        //System.out.println("page source:"+driver.getPageSource());

/*
           ymt app 返回 控件

           <XCUIElementTypeButton type="XCUIElementTypeButton" name="back" label="back" enabled="true" visible="true" x="5" y="26" width="39" height="30"/>
           <XCUIElementTypeButton type="XCUIElementTypeButton" name="返回" label="返回" enabled="true" visible="false" x="8" y="31" width="21" height="22"/>
*/





    }


}
