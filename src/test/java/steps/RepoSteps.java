package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RepoSteps {

    @Step ("Открываем аккаунт в Github")
    public void openPage(){
        open("https://github.com/KEmma6");
    }

    @Step ("Ищем вкладку 'Репозитории' и кликаем на нее")
    public void clickOnTabRepositories(){
        $(byText("Repositories")).click();
    }

    @Step ("Кликаем на репозиторий")
    public void clickOnNameOfRepo(){
        $(byText("hw6_allureReports")).click();
    }

    @Step ("Переходим во вкладку Issues")
    public void goToIssuesTab(){
            $("[data-content=Issues]").click();
    }

    @Step ("Проверяем, что во вкладке Issues есть вопрос с названием {issueName} ")
    public void  checkThatTheTabHasIssueName(String issueName){
        $("#issue_1_link").shouldHave(Condition.text(issueName));
    }
}
