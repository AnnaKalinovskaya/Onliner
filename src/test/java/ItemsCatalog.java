import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ItemsCatalog {
    private final static SelenideElement title = $x("//h1");

    public String getTitle(){
        return title.getText();
    }
}
