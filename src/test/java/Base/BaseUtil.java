package Base;

import Steps.SetupTeardown;
import Utility.ReadProperties;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class BaseUtil {

    public static WebDriver driver;

    public BaseUtil()  {
        this.driver = SetupTeardown.driver;

    }
}





