package POM_FeatureFile_nopCommerce_GroupID;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserSelector extends Utils
{
    LoadProps loadProps = new LoadProps();

    public void setUpBrowser()
    {
        //
        // String browser = System.getProperty("browser");
        String browser = loadProps.getProperty("browser");

        if (browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("ie"))
        {
            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDrivers\\IEDriverServer.exe");
            driver= new InternetExplorerDriver();
        }
        else if (browser.equalsIgnoreCase("opera"))
        {
            System.setProperty("webdriver.opera.driver", "src\\test\\Resources\\BrowserDriver\\operadriver.exe");
            driver = new OperaDriver();
        }
        else
        {
            System.out.println("Browser name is empty or typed wrong : " + browser);
        }
    }
}
