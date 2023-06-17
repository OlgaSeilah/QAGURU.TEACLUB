package seilah.qaguru.tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import seilah.qaguru.allure.TagConstants;
import seilah.qaguru.modalWindows.ModalAddedIntoCart;
import seilah.qaguru.pages.CartPage;
import seilah.qaguru.pages.ShopPage;

import static seilah.qaguru.allure.TagConstants.REGRESS;
import static seilah.qaguru.helpers.Endpoints.SHOP_PAGE;

@Tag(REGRESS)
public class PutItemIntoShoppingCartTest extends BaseTest {
    private ShopPage shopPage = new ShopPage();
    private CartPage cartPage = new CartPage();
    private ModalAddedIntoCart modalAddedIntoCart = new ModalAddedIntoCart();

    private String btnNamePutIntoCart = "В корзину";
    private String headerText = "Товар добавлен в корзину!";
    private String btnNameGotoCart = "Перейти в корзину";
    private String itemHeader;

    @BeforeEach
    public void precondition() {
        shopPage.openPage(SHOP_PAGE.getValue());
        Selenide.sleep(6000);
    }

    @DisplayName("Добавление товара в корзину")
    @Description("")
    @Test
    public void puttingItemIntoShoppingCart() {
        shopPage.clickAddToCartBtnOnFirstItem()
                .checkBtnAdded(btnNamePutIntoCart);
        itemHeader = shopPage.getItemName();
        modalAddedIntoCart.checkHeaderAdded(headerText)
                .clickBtn(btnNameGotoCart);
        cartPage.checkGoodsAmount(1)
                .checkItemName(itemHeader);

    }



}
