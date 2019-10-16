package POM_FeatureFile_nopCommerce_GroupID;

import org.openqa.selenium.By;

public class GuestUserShopping extends Utils
{
    LoadProps loadProps = new LoadProps();

    private By _shoesCategory = By.xpath("//img[@title='Show products in category Shoes']");
    private By _clickOnShoes = By.xpath("//img[@alt='Picture of adidas Consortium Campus 80s Running Shoes']");
    private By _addToCartShoes = By.xpath("//input[@id='add-to-cart-button-25']");
    private By _greenInfoLine = By.xpath("//p[@class='content']");
    private By _shoppingCartGreenLine = By.xpath("//a[contains(text(),'shopping cart')]");
    private By _acceptTermsOfService = By.xpath("//input[@id='termsofservice']");
    private By _checkOut = By.xpath("//button[@class='button-1 checkout-button']");
    private By _checkOutAsGuest = By.xpath("//input[@class='button-1 checkout-as-guest-button']");
    private By _enterFirstName = By.xpath("//input[@data-val-required='First name is required.']");
    private By _enterLastName = By.xpath("//input[@data-val-required='Last name is required.']");
    private By _enterEmail = By.xpath("//input[@data-val-required='Email is required.']");
    //following methods are same as in ShoppingShoes
    private By _countryDropdown = By.xpath("//select[@data-trigger='country-select']");
    private By _selectCity = By.id("BillingNewAddress_City");
    private By _billingAddress = By.id("BillingNewAddress_Address1");
    private By _billingAddressZipCode = By.id("BillingNewAddress_ZipPostalCode");
    private By _phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    private By _continueShopping = By.xpath("//input[@onclick='Billing.save()']");
    private By _continueShopping2 = By.xpath("//input[@onclick='ShippingMethod.save()']");
    private By _selectPaymentMethod = By.xpath("//input[@id='paymentmethod_1']");
    private By _continuePaymentPage = By.xpath("//input[@class='button-1 payment-method-next-step-button']");
    private By _selectPaymentCardType = By.id("CreditCardType");
    private By _cardHolderName = By.xpath(("//input[@data-val-required='Enter cardholder name']"));
    private By _cardNumber = By.xpath("//input[@name='CardNumber']");
    private By _cardExpiryMonth = By.xpath("//select[@id='ExpireMonth']");
    private By _cardExpiryYear = By.id("ExpireYear");
    private By _cardCode = By.xpath("//input[@name='CardCode']");
    private By _clickContinuePaymentStage = By.xpath("//input[@class='button-1 payment-info-next-step-button']");
    private By _confirmShopping = By.xpath("//input[@class='button-1 confirm-order-next-step-button']");


    public void guestShopsShoes() {
        clickOnElement(_shoesCategory);
        clickOnElement(_clickOnShoes);
        clickOnElement(_addToCartShoes);
        waitForElementVisible(_greenInfoLine, 5);
        clickOnElement(_shoppingCartGreenLine);
        clickOnElement(_acceptTermsOfService);
        clickOnElement(_checkOut);
        clickOnElement(_checkOutAsGuest);
        sendText(_enterFirstName,"Venus");
        sendText(_enterLastName,"Patel");
        sendText(_enterEmail,"testauto@alperton.com");
        //following methods are same as in RegisteredUserShopping
        selectByValue(_countryDropdown, "233");
        sendText(_selectCity,"Croydon");
        sendText(_billingAddress, "37, Park Lane");
        sendText(_billingAddressZipCode, "CR0 1DY");
        sendText(_phoneNumber,"07825122425");
        clickOnElement(_continueShopping);
        waitForElementVisible(_continueShopping2,5);
        clickOnElement(_continueShopping2);
        clickOnElement(_selectPaymentMethod);
        clickOnElement(_continuePaymentPage);
        selectByVisibleText(_selectPaymentCardType,loadProps.getProperty("cardType"));
        sendText(_cardHolderName,loadProps.getProperty("name"));
        sendText(_cardNumber,loadProps.getProperty("cardNumber"));
        selectByValue(_cardExpiryMonth,loadProps.getProperty("expiryDate"));
        selectByValue(_cardExpiryYear,loadProps.getProperty("expiryYear"));
        sendText(_cardCode,loadProps.getProperty("CVV_Code"));
        clickOnElement(_clickContinuePaymentStage);
        waitForElementVisible(_confirmShopping,5);
        clickOnElement(_confirmShopping);
    }
}
