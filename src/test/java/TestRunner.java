import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestRunner {
    WebDriver driver;
    @BeforeTest
    void setup() {
        driver = WebDriverManager.chromedriver().create();
        Configuration.browserSize = "1200x1800";
    }
    @AfterTest
    void teardown() {
        driver.quit();
    }


    @Test (dataProvider = "itemsCategory", dataProviderClass = TestDataProvider.class)
    public void itemsListHasRespectiveTitle(String dropdownItem, String expectedTitle) {
        MainPage mainPage = new MainPage();
        CatalogPage catalog = mainPage.goToCatalog();
        CatalogPage.tabs.get(1).click();
        catalog.clickOn(TestDataProvider.asideCategory);
        catalog.clickOn(dropdownItem);
        ItemsCatalog itemsCatalog = new ItemsCatalog();
        Assert.assertTrue(itemsCatalog.getTitle().contains(expectedTitle));
    }
}
