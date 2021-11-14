import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTestWithListener extends TestBase{

    private static final String ACCOUNT_URL = "https://github.com/KEmma6";
    private static final String ISSUE_NAME = "https://github.com/KEmma6";


    @Test
    @Description("Проверка наличия Issues")
    public void testIssue(){

        open (ACCOUNT_URL);

        $(byText("Repositories")).click();
        $(byText("hw6_allureReports")).click();
        $("[data-content=Issues]").click();
        $("#issue_1_link").shouldHave(Condition.text(ISSUE_NAME));

    }
}
