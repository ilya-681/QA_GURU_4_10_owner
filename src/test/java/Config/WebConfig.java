package Config;

import org.aeonbits.owner.Config;

public interface WebConfig extends Config {

    @Key("remote_driver")
     String getWebDriverURL();

    @Key("browser")
    String getWebDriverBrowser();

    @Key("baseURL")
    String getBaseURL();

    @Key("enabled")
    Boolean isEnabled();

}
