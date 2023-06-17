package seilah.qaguru.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ShopPage extends BasePage {

    private SelenideElement submitBtnOnFirstCard = $$(".custom-place-btn button.single_add_to_cart_button").get(0);
    private SelenideElement itemHeader = $$("li h2").first();
    private SelenideElement addedBtn = $(".custom-place-btn button.added");

    @Step("Нажать на кнопку \"Добавить в корзину\" у первого товара в списке")
    public ShopPage clickAddToCartBtnOnFirstItem() {
        submitBtnOnFirstCard.scrollIntoView(false).click();

        return this;
    }

    @Step("Отображена кнопка {btnName} с галочкой")
    public ShopPage checkBtnAdded(String btnName) {
        addedBtn.shouldHave(text(btnName)).shouldBe(visible);

        return this;
    }

    @Step("Запомнить название товара")
    public String getItemName() {
        return itemHeader.getText();
    }


}
