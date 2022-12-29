import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CatalogPage {
    private static final String BASE_URL = "https://catalog.onliner.by";
    public static ElementsCollection tabs = $$x("//li[@data-id]");
    public CatalogPage(){
        Selenide.open(BASE_URL);
    }
    public void clickOn (String Xpath){
        SelenideElement tab = $x(Xpath);
        tab.click();
    }

}
