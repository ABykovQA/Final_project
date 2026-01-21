package stepdefinitions;

import api.UserAPI;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import datatest.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class UserRegistrationSteps {

    private ScenarioContext scenarioContext;

    public UserRegistrationSteps(ScenarioContext context) {
        this.scenarioContext = context;
    }

    private SelenideElement exitBtn = $(By.xpath(".//button[text()='Выйти']"));

    @Given("open regPage")
    public void openRegPage(){
        StartPage startPage = new StartPage();
        startPage.regPage();
    }

    @Given("reg new user API")
    public void regNewUserAPI(){
        String email = (String) scenarioContext.getContext("randomEmail");
        String pass = (String) scenarioContext.getContext("randomPass");
        Map<String, String> body = new HashMap<>();
        body.put("email", email);
        body.put("password", pass);
        UserAPI userAPI = new UserAPI();
        userAPI.createrUser(body);
    }

    @When("registr new user")
    public void registrNewUser(){
        String email = (String) scenarioContext.getContext("randomEmail");
        String pass = (String) scenarioContext.getContext("randomPass");
        RegPage regPage = new RegPage();
        regPage.regUser(email, pass);
    }

    @Then("Reg OK and close")
    public void regOK(){
        exitBtn.should(exist);
    }

    @Then("fail reg user and close")
    public void failReg(){
        exitBtn.shouldNot(exist);
    }
}
