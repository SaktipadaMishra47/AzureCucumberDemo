package Steps;

import Utility.LoggerHelper;
import Utility.ReadProperties;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;


public class SetupTeardown {

    public static WebDriver driver;
    Logger log = LoggerHelper.getLogger(SetupTeardown.class);
    ReadProperties readProperties = new ReadProperties();
    String url;


    @Before
    public void Setup(Scenario scenarios) throws Exception {
        String browser = readProperties.getBrowser("browser");
                  if (browser.equals("chrome")) {
                //set path to chrome.exe
                System.setProperty("webdriver.chrome.driver", readProperties.getBrowserDriverPath("chromeDriverPath"));
                //create chrome instance
                driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            //set path to Firefox.exe
            System.setProperty("webdriver.gecko.driver", readProperties.getBrowserDriverPath("firefoxDriverPath"));
            //create firefox instance
           /* FirefoxOptions options = new FirefoxOptions();
            options.setCapability("marionette", true);
            driver = new FirefoxDriver(options);*/
           driver= new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            //set path to Edge.exe
            System.setProperty("webdriver.edge.driver", readProperties.getBrowserDriverPath("edgeDriverPath"));
            //create Edge instance
            driver = new EdgeDriver();
        } else {
            //If no browser passed throw exception
            throw new Exception("Browser is not correct");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        url = readProperties.getUrl("url");
        driver.get(url);

    }

    @After
    public void TearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                log.info(scenario.getName() + " is Failed");
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                log.info(scenario.getName() + " is Passed");
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        driver.quit();
    }
}
