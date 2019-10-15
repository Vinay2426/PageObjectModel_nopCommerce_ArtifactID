package POM_FeatureFile_nopCommerce_GroupID;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AccountRegistrationResultPage extends Utils
{
    LoadProps loadProps = new LoadProps();

    private By _registerPage = By.xpath("//h1['Register']");
    private By _registerSuccessfully = By.xpath("//div[@class='result']");

    public void verifyUserIsOnRegisterPage()
    {
        Assert.assertEquals(getTextReturn(_registerPage), loadProps.getProperty("registerExpected"));
    }
    public void verifyUserIsRegisterSuccessfully()
    {
        Assert.assertEquals(getTextReturn(_registerSuccessfully),loadProps.getProperty("registerSuccessfulMessage"));
    }
}
