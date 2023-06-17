package seilah.qaguru.modalWindows;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ModalAddedIntoCart {
    private SelenideElement modalWindowContent = $("#continueshopping .modal-content");
    private ElementsCollection modalBtns = $$("#continueshopping .modal-content button");

    @Step("Отображена модалка {headerText} с галочкой")
    public ModalAddedIntoCart checkHeaderAdded(String headerText) {
        modalWindowContent.shouldHave(text(headerText));

        return this;
    }

    @Step("Нажать на кнопку {btnName}")
    public ModalAddedIntoCart clickBtn(String btnName) {
        modalBtns.findBy(text(btnName)).click();

        return this;
    }
}

