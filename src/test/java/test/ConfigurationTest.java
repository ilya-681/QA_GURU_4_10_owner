package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConfigurationTest {

    @Test
    @DisplayName("Config_owner_test")
    public void configurationTest()
    {
        final String localWebDriverURL = "http://localhost:4444";
        final String companyWebDriverURL = "https://user1:1234@selenoid.autotests.cloud:4444/wd/hub/";

        final String webDriverBrowserChrome = "chrome";
        final String webDriverBrowserFirefox = "firefox";

        final String testingBaseURL = "http://testing.github.com";
        final String devBaseURL = "http://dev.github.com";

        assertThat(localWebDriverURL).isEqualTo("http://localhost:4444");
        assertThat(webDriverBrowserChrome).isEqualTo("chrome");
        assertThat(testingBaseURL).isEqualTo("http://testing.github.com");
    }
}
