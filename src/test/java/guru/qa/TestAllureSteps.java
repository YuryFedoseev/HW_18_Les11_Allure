package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestAllureSteps {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1220x880";
        Configuration.holdBrowserOpen = true;
    }



    @Test
    void TestLambdaSteps() {
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.openIssue();
        steps.searchPage();
    }
}
