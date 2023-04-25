package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestAllureStepsName extends TestBase {

    private static final int Issue = 1;

    @Test
    void TestLambdaSteps() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем страницу гитхаба со своей домашней работой", () -> {
            open(baseUrl);
        });
        step("Переходим на вкладку issues", () -> {
            $("#issues-tab").click();
        });
        step("Проверяем наличие нужной записи с номером " + Issue, () -> {
            $(withText("#" + Issue)).should(Condition.exist);
        });
    }
}
