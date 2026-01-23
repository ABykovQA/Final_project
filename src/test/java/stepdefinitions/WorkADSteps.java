package stepdefinitions;

import datatest.ScenarioContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;

public class WorkADSteps {

    private ScenarioContext scenarioContext;

    public WorkADSteps(ScenarioContext context) {
        this.scenarioContext = context;
    }


    @When("open page create new AD")
    public void openCreateADPage(){
        StartPage startPage = new StartPage();
        startPage.clickNewAdButton();
    }

    @When("create new AD")
    public void createNewAD(){
        String name = (String) scenarioContext.getContext("randomName");
        int price = (int) scenarioContext.getContext("randomPrice");
        CreateADPage createADPage = new CreateADPage();
        createADPage.createNewAD(name, price);
    }

    @When("search ad and editing")
    public void openAD(){
        String name = (String) scenarioContext.getContext("randomName");
        int price = (int) scenarioContext.getContext("randomPrice");
        StartPage startPage = new StartPage();
        startPage.searchAd(name, price);
        startPage.checkADClick(name);
    }

    @When("open editing ad")
    public void openEditingAD(){
        ADPage adPage = new ADPage();
        adPage.edinigAD();
    }

    @When("editing AD")
    public void editingAD(){
        String editName = (String) scenarioContext.getContext("randomEditName");
        EditingADPage editingADPage = new EditingADPage();
        editingADPage.editingAD(editName);
    }

    @Then("checking saved changes")
    public void checkSaveChanges(){
        String editName = (String) scenarioContext.getContext("randomEditName");
        int price = (int) scenarioContext.getContext("randomPrice");
        StartPage startPage = new StartPage();
        startPage.searchAd(editName, price);
        startPage.checkAD(editName);
    }

    @When("del ad")
    public void delAD(){
        ADPage adPage = new ADPage();
        adPage.delAD();
    }

    @Then("search ad and close")
    public void searchAD(){
        String name = (String) scenarioContext.getContext("randomName");
        int price = (int) scenarioContext.getContext("randomPrice");
        StartPage startPage = new StartPage();
        startPage.searchAd(name, price);
        startPage.checkAD(name);

    }

    @Then("search del ad and close")
    public void searchDelAD(){
        String name = (String) scenarioContext.getContext("randomName");
        int price = (int) scenarioContext.getContext("randomPrice");
        StartPage startPage = new StartPage();
        startPage.searchAd(name, price);
        startPage.checkDelAD(name);
    }
}
