package stepdefinitions;

import datatest.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AuthUserSteps {

    private ScenarioContext scenarioContext;

    public AuthUserSteps(ScenarioContext context) {
        this.scenarioContext = context;
    }

    @Given("open enterPage")
    public void openEnterPagee(){
        StartPage startPage = new StartPage();
        startPage.enterPage();
    }

    @When("Auth user")
    public void authUser(){
        String email = (String) scenarioContext.getContext("randomEmail");
        String pass = (String) scenarioContext.getContext("randomPass");
        EnterPage enterPage = new EnterPage();
        enterPage.enterAcc(email, pass);
    }
}
