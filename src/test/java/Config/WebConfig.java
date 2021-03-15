package Config;

import org.aeonbits.owner.Config;

@Config.Sources({
        //    "file:/users/credentials.properties",
        "classpath:${env}.properties"})
@Config.LoadPolicy(Config.LoadType.FIRST)
//@Config.LoadPolicy(Config.LoadType.MERGE)
public interface WebConfig extends Config {


    @Key("browser")
    @DefaultValue("chrome")
    String getWebDriverBrowser();

    @Key("browserVersion")
    String getWebDriverBrowserVersion();

    @Key("remote_driver")
    String getWebDriverURL();

    @Key("baseURL")
    @DefaultValue("https://demoqa.com/automation-practice-form")
    String getBaseURL();

//    @Key("enabled")
//    @DefaultValue("true")
//    Boolean isEnabled();

}
