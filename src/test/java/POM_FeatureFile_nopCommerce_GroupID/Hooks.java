package POM_FeatureFile_nopCommerce_GroupID;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static POM_FeatureFile_nopCommerce_GroupID.Utils.randomDate;

public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();

    @Before   //take cucumber.api's dependency
    public void setUpBrowser() {
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public void tearDown(Scenario scenario)
    {
        if (scenario.isFailed())
        {
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
            File DestFile = new File("src\\test\\Resources\\ScreenShots" + randomDate() + ".png");
            //Copy file at destination
            try
            {
                FileUtils.copyFile(SrcFile, DestFile);
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        driver.quit();
    }
}
