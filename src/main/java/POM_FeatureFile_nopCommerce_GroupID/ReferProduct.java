package POM_FeatureFile_nopCommerce_GroupID;

import org.openqa.selenium.By;

public class ReferProduct extends Utils
{
    ReferProductResultPage referProductResultPage = new ReferProductResultPage();
    private By _clickOnEmail = By.xpath("//input[@value='Email a friend']");
    private By _typeEmailAddress = By.id("FriendEmail");
    private By _personalMessageInEmail = By.name("PersonalMessage");
    private By _clickOnSend = By.name("send-email");

    public void referProductToFriend()
    {
        clickOnElement(_clickOnEmail);
        referProductResultPage.verifyUserIsOnEmailAFriendPage();
        sendText(_typeEmailAddress,"testtest123456@test.com");
        sendText(_personalMessageInEmail,"This is very good deal, if you are interested");
        clickOnElement(_clickOnSend);
    }
}
