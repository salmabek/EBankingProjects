package AppHooks;


import com.qa.ConfigReader;
import com.qa.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assume;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class ApplicationHooks {
    Properties prop;

    private WebDriver driver;
    @Before(value="@Skip", order = 0)
    public void skip_scenario(Scenario scenario){
        System.out.println("Skipped scenario is :"+ scenario.getName());
        Assume.assumeTrue(false);

    }
    @Before(order = 1)
    public void getProperty(){
        ConfigReader configReader = new ConfigReader();
        prop = configReader.initProp();

    }
    @Before(order = 2)
    public void launchBrowser(){
        String browserName = prop.getProperty("browser");
        DriverFactory driverFactory = new DriverFactory();
        driver = driverFactory.initDriver(browserName);
    }



    @After(order = 0)
    public void quitBrowser(){{
        if (driver!=null)
        driver.quit();
    } }
}
