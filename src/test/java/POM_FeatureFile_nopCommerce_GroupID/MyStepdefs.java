package POM_FeatureFile_nopCommerce_GroupID;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs
{
    HomePage homePage = new HomePage();
    AccountRegistration accountRegistration = new AccountRegistration();
    AccountRegistrationResultPage accountRegistrationResultPage = new AccountRegistrationResultPage();
    ReferProduct referProduct = new ReferProduct();
    ReferProductResultPage referProductResultPage = new ReferProductResultPage();
    HomePageResultPage homePageResultPage = new HomePageResultPage();
    RegisteredUserShopping registeredUserShopping = new RegisteredUserShopping();
    GuestUserShopping guestUserShopping = new GuestUserShopping();
    ShoppingResultPage shoppingResultPage = new ShoppingResultPage();

    @Given("^user is on register page$")
    public void userIsOnRegisterPage()
    {
        homePage.clickOnRegisterButton();
    }

    @When("^user fill all the mandatory fields and click on continue$")
    public void userFillAllTheMandatoryFieldsAndClickOnContinue()
    {
        accountRegistrationResultPage.verifyUserIsOnRegisterPage();
        accountRegistration.userEnterRegistrationDetail();
    }

    @Then("^user should able to register successfully$")
    public void userShouldAbleToRegisterSuccessfully()
    {
        accountRegistrationResultPage.verifyUserIsRegisterSuccessfully();
    }

    @Given("^user is on homepage$")
    public void userIsOnHomepage()
    {
        homePage.clickOnNopCommerceLogo();
        homePageResultPage.userIsOnHomePage();
    }

    @And("^select product and refer it to a friend$")
    public void selectProductAndReferItToAFriend()
    {
        homePage.clickOnNopCommerceLogo();
        homePageResultPage.userIsOnHomePage();
        homePage.clickOnFeaturedProductMacBookPro();
        referProductResultPage.verifyUserIsOnAppleMacBookProPage();
        referProduct.referProductToFriend();
    }

    @Then("^user should get successful message of referring product$")
    public void userShouldGetSuccessfulMessageOfReferringProduct()
    {
        referProductResultPage.verifyEmailHasBeenSentSuccessfully();
    }

    @Then("^verify user should not able to refer product to friend$")
    public void verifyUserShouldNotAbleToReferProductToFriend()
    {
        referProductResultPage.verifyUserShouldNotAbleToSendEmailWithoutRegistration();
    }

    @And("^go to homepage$")
    public void goToHomepage()
    {
        homePage.clickOnNopCommerceLogo();
    }

    @And("^user select product and buy$")
    public void userSelectProductAndBuy() //registered user
    {
        homePage.clickOnApparelLink();
        registeredUserShopping.userShopsShoes();
    }

    @Then("^verify user placed successful order$")
    public void verifyUserPlacedSuccessfulOrder()
    {
        shoppingResultPage.verifyUserSeeSuccessfulOrderMessage();
    }

    @When("^guest user select product and buy$")
    public void guestUserSelectProductAndBuy()
    {
        homePage.clickOnApparelLink();
        guestUserShopping.guestShopsShoes();
    }

    @When("^user fill all the mandatory fields and click on continue abcd$")
    public void userFillAllTheMandatoryFieldsAndClickOnContinueAbcd()
    {
        accountRegistrationResultPage.verifyUserIsOnRegisterPage();
        accountRegistration.userEnterRegistrationDetail();
    }

    @When("^user fill all the mandatory fields and click on continue xyz$")
    public void userFillAllTheMandatoryFieldsAndClickOnContinueXyz()
    {
        accountRegistrationResultPage.verifyUserIsOnRegisterPage();
        accountRegistration.userEnterRegistrationDetail();
    }
}
