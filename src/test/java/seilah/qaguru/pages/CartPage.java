package seilah.qaguru.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class CartPage extends BasePage{

    private ElementsCollection goodsInCart = $$("tbody tr.cart_item");
    private ElementsCollection productName = $$("tbody td.product-name");

    @Step("")
    public CartPage openPage() {
        open("");

        return this;
    }

    @Step("количество товаров в корзине равно {amount}")
    public CartPage checkGoodsAmount(int amount) {
        goodsInCart.shouldHave(CollectionCondition.size(amount));

        return this;
    }

    @Step("Название товара в корзине соответствует {amount}")
    public CartPage checkItemName(String itemName) {


        return this;
    }

}
