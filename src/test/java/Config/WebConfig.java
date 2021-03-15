package Config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/users/credentials.properties",
        "classpath:${env}.properties"})
@Config.LoadPolicy(Config.LoadType.FIRST)
//@Config.LoadPolicy(Config.LoadType.MERGE)
public interface WebConfig extends Config {

    @Key("remote_driver")
    @DefaultValue("http://localhost:4444")
     String getWebDriverURL();

    @Key("browser")
    @DefaultValue("chrome")
    String getWebDriverBrowser();

    @Key("baseURL")
    @DefaultValue("http://testing.github.com")
    String getBaseURL();

    @Key("enabled")
    @DefaultValue("true")
    Boolean isEnabled();

}
