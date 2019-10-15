package POM_FeatureFile_nopCommerce_GroupID;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingResultPage extends Utils
{
    LoadProps loadProps = new LoadProps();

    private By _successfulShoppingMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public void verifyUserSeeSuccessfulOrderMessage()
    {
        Assert.assertEquals(getTextReturn(_successfulShoppingMessage),loadProps.getProperty("shoppingResultSuccessfulValidation"));
    }
}
