package POM_FeatureFile_nopCommerce_GroupID;

import org.openqa.selenium.By;

public class HomePageResultPage extends Utils
{
    LoadProps loadProps = new LoadProps();

//    private ComputerPage = "https://demo.nopcommerce.com/computers";
//    private ApparelPage = "https://demo.nopcommerce.com/apparel";



    public void userIsOnHomePage()
    {
        assertURL(loadProps.getProperty("homePageValidation"));
    }
    public void userIsOnComputerPage()
    {
//        assertEqualURL();
    }

    public void userIsOnApparelPage()
    {

    }
}
