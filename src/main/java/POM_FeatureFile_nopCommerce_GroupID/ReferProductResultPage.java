package POM_FeatureFile_nopCommerce_GroupID;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferProductResultPage extends Utils
{
    LoadProps loadProps = new LoadProps();

    private By _macBookProPage = By.xpath("//h1[@itemprop='name']");
    private By _emailAFriendPage = By.xpath("//h1['Email a friend']");
    private By _emailSuccessfulMessage = By.xpath("//div[@class='result']");
    private By _emailErrorMessageIfTriesWithoutRegistration = By.xpath("//span[@id='YourEmailAddress-error']");

    public void verifyUserIsOnAppleMacBookProPage()
    {
        Assert.assertEquals(getTextReturn(_macBookProPage),loadProps.getProperty("macBookProPageValidation"));
    }

    public void verifyUserIsOnEmailAFriendPage()
    {
        Assert.assertEquals(getTextReturn(_emailAFriendPage),loadProps.getProperty("emailPageValidation"));
    }

    public void verifyEmailHasBeenSentSuccessfully()
    {
        Assert.assertEquals(getTextReturn(_emailSuccessfulMessage),loadProps.getProperty("emailHasBeenSentValidation"));
    }
    public void verifyUserShouldNotAbleToSendEmailWithoutRegistration()
    {
        Assert.assertEquals(getTextReturn(_emailErrorMessageIfTriesWithoutRegistration),loadProps.getProperty("shoppingResultUnsuccessfulValidation"));
    }
}
