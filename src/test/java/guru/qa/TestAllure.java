package guru.qa;

import com.codeborne.selenide.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

import com.codeborne.selenide.logevents.SelenideLogger;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class TestAllure {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1220x880";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void TestIssueSearch() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com/YuryFedoseev/HW_18_Les11_Allure");
        $("#issues-tab").click();
        $(withText("#2")).should(Condition.exist);

    }
}
