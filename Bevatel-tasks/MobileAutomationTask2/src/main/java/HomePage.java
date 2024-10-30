import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {

    public HomePage(AppiumDriver appiumdriver) {
        super(appiumdriver);
    }
    @AndroidFindBy(accessibility = "My Account")
    WebElement myAccountButton;

    @AndroidFindBy(accessibility = "Offers")
    WebElement myOffersButton;

    @AndroidFindBy(id = "com.eboutiques.app:id/fabCenter")
    WebElement boutiqueButton;

    @AndroidFindBy(accessibility = "Categories")
    WebElement myCategoriesButton;

    @AndroidFindBy(accessibility = "Home")
    WebElement myHomeButton;

    @AndroidFindBy(id = "com.eboutiques.app:id/btnSearch")
    WebElement searchButton;

    @AndroidFindBy(id= "com.eboutiques.app:id/btnSeeAllCelebrities")
    WebElement seeAllBoutiqueButton;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.eboutiques.app:id/imgCelebrity\"])[1]")
    WebElement firstBoutiqueOnHomePage;

    public void clickAccountButton(){
        click(myAccountButton);
    }
}
