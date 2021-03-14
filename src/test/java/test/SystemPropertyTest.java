package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.jvm.hotspot.utilities.Assert;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SystemPropertyTest {

    @Test
    public void testSystemProperty()
    {
        assertThat(System.getProperty("browser")).isEqualTo("firefox");
    }
}
