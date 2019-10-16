package POM_FeatureFile_nopCommerce_GroupID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Utils extends BasePage
{
    //it will click on elements
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    //Clear Text form inout box/area
    public static void clearInputText(By by)
    {
        driver.findElement(by).clear();
    }

    // to enter text of element
    public static void sendText (By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //Clear and enter text in input field
    public static void clearAndInputText(By by, String text)
    {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    //to get the text for expected and actual result
    public static String getTextReturn(By by)
    {
        return driver.findElement(by).getText();
    }

    //Checking WebElement present/exist in DOM
    public static boolean webElementPresent(By by)
    {
        return driver.findElements(by).size()!=0;
    }

    //Checking WebElemnt displayed or not
    public boolean webElementDisplayedInDOM(By by)
    {
        return driver.findElement(by).isDisplayed();
    }

    //implicit wait
    public static void implicitWaitTime(long time)
    {
        driver.manage().timeouts().implicitlyWait(time, SECONDS);
    }

    //Wait until element is visible
    public static void waitForElementVisible(By by,long time)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    //Wait until element is invisible
    public static void waitUntilElementInvisible(By by, long time)
    {
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    //wait until element is clickable
    public static void waitUntilElementClickable(long time, By by)
    {
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //fluent wait
    public static void fluentWait(long time, int frequency)
    {
        Wait wait = new FluentWait(driver)
                .withTimeout(time, TimeUnit.SECONDS)
                .pollingEvery(frequency, TimeUnit.SECONDS)
                .ignoring(Exception.class);
//        WebElement foo = wait.until(new Function<WebDriver, WebElement>);
//        {
//            public WebElement apply(WebDriver driver)
//            {
//                return driver.findElement(By.id("foo"));
//            }
//        }
    }

    //Try to click element multiple if not available in first go
    public static void clickingMultipleTimes(By by, int index)
    {
        driver.findElements(by).get(index).click();
    }

    //is dropdown present
    public static void dropDownPresent(By by, String text)
    {
        Select select = new Select(driver.findElement(by));
        select.getOptions();
    }

    //wait till certain alert message/window appears which no locator
    public static void waitForAlertPresent(By by,long time)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.alertIsPresent());
    }

    //select from visible text DROPDOWN
    public static void selectByVisibleText(By by, String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //Select by Index number DROPDOWN
    public static void selectByIndex(By by, int index)
    {
        Select select = new Select (driver.findElement(by));
        select.selectByIndex(index);
    }

    //Select from the value DROPDOWN
    public static void selectByValue(By by, String value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    //Select from first selected option
    public static void selectByFirstSelectedOption(By by, String value)
    {
        Select select = new Select(driver.findElement(by));
        select.getFirstSelectedOption();
    }

    //Assert method to compare results
    public static void assertMethod(By actual, String expected)
    {
       // Assert.assertEquals(getTextReturn(actual),expected);
    }

    //Scroll to view element
    public static void scrollWebPageToViewElement(By by)
    {
        Actions actions = new Actions(driver);
        driver.findElement(by);
        actions.moveToElement((WebElement) driver);
        actions.perform();
    }

    //Scroll to element and click
    public static void scrollWebPageToViewElementAndClick(By by)
    {
        //Actions actions = new Actions(driver);
        //driver.findElement(by).actions.moveToElement().actions.perform().Click();
        Actions actions = new Actions(driver);
        driver.findElement(by);
        actions.moveToElement((WebElement) driver);
        actions.click();
    }

    //Wait for alert to display
    public static void waitForAlert(int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().getText();
    }

    //get attribute of element
    public static String getAttributeElement(By by, String text)
    {
        return driver.findElement(by).getAttribute(text);
    }

    //get CSS value of element
    public static String getCssValueElement(By by, String text)
    {
        return driver.findElement(by).getCssValue(text);
    }

    //date stamp short
    public static String shortDateStamp()
    {
        SimpleDateFormat dateFormat1 = new SimpleDateFormat();
        return new SimpleDateFormat("dd.MM.yyyy").format(new Date());
    }

    //date stamp long
    public static String longDateStamp()
    {
        SimpleDateFormat dateFormat1 = new SimpleDateFormat();
        return new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date());
    }
    //RandomDate method to make email address dynamic
    public static String randomDate() {
        DateFormat format = new SimpleDateFormat("ddMMyyHHmmss");
        return format.format(new Date());
    }
    //This method determines if an element is enabled or not
    public static boolean ifWebElementIsEnabledOrNot(By by)
    {
        return driver.findElement(by).isEnabled();
    }

    //get location false or true
    public static boolean getLocation(By by)
    {
        Point location = driver.findElement(by).getLocation();
        return false;
    }

    //get the url
    public static void getUrl(String key)
    {
        LoadProps loadProps = new LoadProps();
        driver.get(loadProps.getProperty(key));
    }

    //hover mouse
    public static void hoverCursor(By by)
    {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(by)).build().perform();
    }

    //hover and click
    public static void hoverAndClick(By by)
    {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(by)).click().build().perform();
    }

    //captureScreenShot when test case fails
    public static void captureScreenShot(WebDriver driver, String screenShotName)
    {
        try
        {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("src\\test\\Resources\\ScreenShots" + screenShotName + ".png"));
            System.out.println("***ScreenShot is taken***");
        }
        catch (IOException e)
        {
            System.out.println("Exception while taking ScreenShot" +e.getMessage());
        }
    }
    //assert URL
    public void assertURL(String text)
    {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    //capture screenshot method
//    public void tearDown(Scenario scenario) {
//        if (scenario.isFailed()) {
//            // Take a screenshot...
//
//            // final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            TakesScreenshot scrShot = ((TakesScreenshot) driver);
//            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
//            File DestFile = new File("src\\test\\Resources\\ScreenShots" + randomDate() + ".png");
//
//            //Copy file at destination
//            try {
//                FileUtils.copyFile(SrcFile, DestFile);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

}
