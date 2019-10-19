package POM_FeatureFile_nopCommerce_GroupID;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@test") //@register, @referProduct, @referProductWithoutRegistration, @registeredCustomer, @guestCustomer
public class RunTest
{
}