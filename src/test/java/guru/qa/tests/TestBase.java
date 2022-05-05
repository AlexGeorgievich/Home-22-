package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import guru.qa.config.Credentials;
import guru.qa.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.concurrent.ExecutionException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static guru.qa.drivers.DeviceDriver.getDeviceDriver;
import static guru.qa.helpers.Attach.sessionId;
import static io.qameta.allure.Allure.step;

public class TestBase {
    private static final String deviceHost = System.getProperty("deviceHost");
    @BeforeAll
    public static void setup() {
        Configuration.browser = getDeviceDriver(deviceHost);
        Configuration.browserSize = null;
    }
    @BeforeEach
    public void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
        open();
    }
    @AfterEach
    public void afterEach() throws ExecutionException {
        String sessionId = sessionId();
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        step("Close driver", Selenide::closeWebDriver);

        if (Credentials.isBrowserStack()) {
            Attach.video(sessionId);
        }
    }
}
