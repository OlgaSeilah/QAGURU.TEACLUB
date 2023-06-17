package seilah.qaguru.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

/**
 * класс описывает общие элементы, встречающиеся на любой странице сайта
 */
public class BasePage {
    @Step("открыть страницу {}")
    public BasePage openPage(String endpoint) {
        open(endpoint);
        return this;
    }

}
