package POM_FeatureFile_nopCommerce_GroupID;

public class HomePageResultPage extends Utils
{
    LoadProps loadProps = new LoadProps();

    public void userIsOnHomePage()
    {
        assertURL(loadProps.getProperty("homePageValidation"));
    }
}
