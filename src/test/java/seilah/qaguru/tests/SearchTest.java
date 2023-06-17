package seilah.qaguru.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import seilah.qaguru.pages.CommonPage;

import static seilah.qaguru.allure.TagConstants.REGRESS;
import static seilah.qaguru.helpers.Endpoints.COMMON_PAGE;

@Tag(REGRESS)
public class SearchTest extends BaseTest {
    private CommonPage commonPage = new CommonPage();

    private String giftSertificate100 = "Gift Sertificate 100";

    @BeforeEach
    public void precondition() {
        commonPage.openPage(COMMON_PAGE.getValue());
    }

    @DisplayName("Товар 'Gift Sertificate 100' отображается в дропдауне быстрого поиска")
    @Description("")
    @Test
    public void checkQuickSearch() {
        commonPage.setValueIntoSearchInput(giftSertificate100)
                .checkResultIsInQuickSearchList(giftSertificate100);
    }

    @DisplayName("Товар 'Gift Sertificate 100' отображается в результатах поиска")
    @Description("")
    @Test
    public void checkCommonSearch() {
        commonPage.findItemWithSearch(giftSertificate100)
                .checkCardForProductIsVisible(giftSertificate100);
    }

}
