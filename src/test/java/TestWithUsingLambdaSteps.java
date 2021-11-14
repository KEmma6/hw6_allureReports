import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestWithUsingLambdaSteps extends TestBase {

    private static final String ACCOUNT_URL = "https://github.com/KEmma6";
    private static final String ISSUE_NAME = "using Listener";

    @Test
    public void testIssueWithLambda() {

        step("Открываем аккаунт " + ACCOUNT_URL + " в Github", () -> {
            open(ACCOUNT_URL);
        });

        step("Ищем вкладку репозитории и кликаем на нее", () -> {
            $(byText("Repositories")).click();
        });

        step("Кликаем на репозиторий", () -> {
            $(byText("hw6_allureReports")).click();
        });

        step("Переходим во вкладку Issues", () -> {
            $("[data-content=Issues]").click();
        });

        step("Проверяем, что во вкладке Issues есть вопрос с названием " + ISSUE_NAME, () -> {
            $("#issue_1_link").shouldHave(Condition.text(ISSUE_NAME));
        });
    }
}
