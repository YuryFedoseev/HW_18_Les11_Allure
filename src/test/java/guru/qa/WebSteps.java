package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {
    private static final int Issue = 1;

    @Step("Открываем страницу гитхаба со своей домашней работой")
    public void openMainPage() {
        open("https://github.com/YuryFedoseev/HW_18_Les11_Allure");
    }

    @Step("Переходим на вкладку issues")
    public void openIssue() {
        $("#issues-tab").click();
    }


    @Step("Проверяем наличие нужной записи с номером ")
    public void searchPage() {

        $(withText("#" + Issue)).should(Condition.exist);

    }

}
