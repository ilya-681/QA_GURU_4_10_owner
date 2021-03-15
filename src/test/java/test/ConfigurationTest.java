package test;

import Config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConfigurationTest {

    @Test
    @DisplayName("Config_owner_test")
    public void configurationTest()
    {
        final WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

        /*final String localWebDriverURL = "http://localhost:4444";
        final String companyWebDriverURL = "https://user1:1234@selenoid.autotests.cloud:4444/wd/hub/";

        final String webDriverBrowserChrome = "chrome";
        final String webDriverBrowserFirefox = "firefox";

        final String testingBaseURL = "http://testing.github.com";
        final String devBaseURL = "http://dev.github.com";*/

        assertThat(config.getWebDriverURL()).isEqualTo("http://localhost:4444");
        assertThat(config.getWebDriverBrowser()).isEqualTo("chrome");
        assertThat(config.getBaseURL()).isEqualTo("http://testing.github.com");
        assertThat(config.isEnabled()).isEqualTo(true);
    }
}
