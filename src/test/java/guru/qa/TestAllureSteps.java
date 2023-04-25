package guru.qa;

import org.junit.jupiter.api.Test;

public class TestAllureSteps extends TestBase {

    @Test
    void TestLambdaSteps() {
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.openIssue();
        steps.searchPage();
    }
}
