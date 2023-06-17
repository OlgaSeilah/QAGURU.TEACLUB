package seilah.qaguru.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CommonPage extends BasePage {

    private ElementsCollection productCards = $$("li.product");
    private SelenideElement searchInput = $("input.search-input");
    private SelenideElement quickSearchDropdown = $("[id^='searchwp_live_search_results']");
    private ElementsCollection itemInQuickSearchDropdown = $$(".searchwp-live-search-result a");
    private SelenideElement searchedProductCard = $(".product");
    private SelenideElement searchedProductCardHeader = $(".product h2");



    //				Gift Sertificate 100 »

//    @Step("")
//    public CommonPage openPage() {
//        open("");
//
//        return this;
//    }

    @Step("Ввести значение {text} в поле поиска")
    public CommonPage setValueIntoSearchInput(String text) {
        searchInput.setValue(text);

        return this;
    }

    @Step("Ввести значение {text} в поле поиска и нажать enter")
    public CommonPage findItemWithSearch(String text) {
        searchInput.setValue(text).pressEnter();

        return this;
    }

    @Step("")
    public CommonPage checkResultIsInQuickSearchList(String text) {
        itemInQuickSearchDropdown.findBy(text(text)).shouldBe(visible);

        return this;
    }

    @Step("")
    public CommonPage checkCardForProductIsVisible(String itemName) {
        searchedProductCardHeader.shouldBe(visible).shouldHave(text(itemName));

        return this;
    }

}
