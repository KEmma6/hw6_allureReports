import org.junit.jupiter.api.Test;
import steps.RepoSteps;

public class TestWithSteps extends TestBase {

    RepoSteps steps = new RepoSteps();
    private static final String ISSUE_NAME = "using Listener";

    @Test
    public void testIssueWithSteps() {
        steps.openPage();
        steps.clickOnTabRepositories();
        steps.clickOnNameOfRepo();
        steps.goToIssuesTab();
        steps.checkThatTheTabHasIssueName(ISSUE_NAME);
    }
}
