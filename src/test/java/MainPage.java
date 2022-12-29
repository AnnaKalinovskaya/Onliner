import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public MainPage(){
        Selenide.open("https://www.onliner.by/");
    }
    private final SelenideElement catalogTab = $x("//li[@class='b-main-navigation__item']/a[@href='https://catalog.onliner.by']");
    public CatalogPage goToCatalog(){
        catalogTab.click();
        return new CatalogPage();
    }
}
