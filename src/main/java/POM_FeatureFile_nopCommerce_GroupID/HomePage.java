package POM_FeatureFile_nopCommerce_GroupID;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    private By _registerLink =  By.xpath("//a[@class='ico-register']");
    private By _computerLink = By.linkText("Computer");
    private By _appleMacBookPro = By.xpath("//img[@title='Show details for Apple MacBook Pro 13-inch']");
    private By _nopCommerceLogo = By.xpath("//img[@alt='nopCommerce demo store']");
    private By _apparelLink = By.linkText("Apparel");

    public void clickOnRegisterButton()
    {
        clickOnElement(_registerLink);
    }
    public void clickOnFeaturedProductMacBookPro()
    {
        clickOnElement(_appleMacBookPro);
    }
    public void clickOnNopCommerceLogo()
    {
        clickOnElement(_nopCommerceLogo);
    }
    public void clickOnApparelLink()
    {
        clickOnElement(_apparelLink);
    }
    public void clickOnComputerLink() {clickOnElement(_computerLink);}
    public void clickOnCategory(String category)
    {
        clickOnElement(By.linkText(category));
    }
}
