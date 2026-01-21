//package stepdefinitions;
//
//import api.UserAPI;
//import com.codeborne.selenide.Selenide;
//import com.codeborne.selenide.SelenideElement;
//import com.github.javafaker.Faker;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//
//import java.util.HashMap;
//import java.util.Locale;
//import java.util.Map;
//
//import static com.codeborne.selenide.Condition.*;
//import static com.codeborne.selenide.Selectors.byAttribute;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.open;
//
//
//public class StepDefinitions {
//
//    private SelenideElement exitBtn = $(By.xpath(".//button[text()='Выйти']"));
//    private SelenideElement ad = $(By.xpath(".//div[@class='card']"));
//    private String randomEmail;
//    private String randomPass;
//    private String randomName;
//    private String randomEditName;
//    private int randomPrice;
//
//
//    public StepDefinitions() {
//    }
//
//    @Given("create random AD data")
//    public void creatRandomADData(){
//        Faker faker = new Faker(new Locale("en"));
//        randomName = faker.commerce().productName();
//        randomPrice = faker.number().numberBetween(1, 10000);
//        randomEditName = faker.commerce().productName();
//    }
//
//    @Given("create random user data")
//    public void creatRandomData(){
//        Faker faker = new Faker(new Locale("en"));
//        randomEmail = faker.internet().emailAddress();
//        randomPass = faker.internet().password();
//    }
//
//    @Given("reg new user API")
//    public void regNewUserAPI(){
//        Map<String, String> body = new HashMap<>();
//        body.put("email", randomEmail);
//        body.put("password", randomPass);
//        UserAPI userAPI = new UserAPI();
//        userAPI.createrUser(body);
//    }
//
//    @Given("open start page")
//    public void openStartPage(){
//        StartPage startPage = new StartPage();
//        startPage.openStarPage();
//    }
//
//    @Given("open regPage")
//    public void openRegPage(){
//        StartPage startPage = new StartPage();
//        startPage.regPage();
//    }
//
//    @Given("open enterPage")
//    public void openEnterPagee(){
//        StartPage startPage = new StartPage();
//        startPage.enterPage();
//    }
//
//    @When("Auth user")
//    public void authUser(){
//        EnterPage enterPage = new EnterPage();
//        enterPage.enterAcc(randomEmail, randomPass);
//    }
//
//    @When("registr new user")
//    public void registrNewUser(){
//        RegPage regPage = new RegPage();
//        regPage.regUser(randomEmail, randomPass);
//    }
//
//    @When("open page create new AD")
//    public void openCreateADPage(){
//        StartPage startPage = new StartPage();
//        startPage.clickNewAdButton();
//    }
//
//    @When("create new AD")
//    public void createNewAD(){
//        CreateADPage createADPage = new CreateADPage();
//        createADPage.createNewAD(randomName, randomPrice);
//    }
//
//    @When("search ad and editing")
//    public void openAD(){
//        StartPage startPage = new StartPage();
//        startPage.searchAd(randomName, randomPrice);
//        $(".card")
//                .shouldBe(visible)
//                .find(byAttribute("alt", randomName)).shouldBe(visible).parent().click();
//    }
//
//    @When("open editing ad")
//    public void openEditingAD(){
//        ADPage adPage = new ADPage();
//        adPage.edinigAD();
//    }
//
//    @When("editing AD")
//    public void editingAD(){
//        EditingADPage editingADPage = new EditingADPage();
//        editingADPage.editingAD(randomEditName);
//    }
//
//    @When("del ad")
//    public void delAD(){
//        ADPage adPage = new ADPage();
//        adPage.delAD();
//    }
//
//    @Then("Reg OK and close")
//    public void regOK(){
//        exitBtn.should(exist);
//        Selenide.closeWebDriver();
//    }
//
//    @Then("fail reg user and close")
//    public void failReg(){
//        exitBtn.shouldNot(exist);
//        Selenide.closeWebDriver();
//    }
//
//    @Then("search ad and close")
//    public void searchAD(){
//        StartPage startPage = new StartPage();
//        startPage.searchAd(randomName, randomPrice);
//        ad
//                .shouldBe(visible)
//                .find(byAttribute("alt", randomName)).shouldBe(visible).parent();
//        Selenide.closeWebDriver();
//    }
//
//    @Then("checking saved changes")
//    public void checkSaveChanges(){
//        StartPage startPage = new StartPage();
//        startPage.searchAd(randomEditName, randomPrice);
//        ad
//                .shouldBe(visible)
//                .find(byAttribute("alt", randomEditName)).shouldBe(visible).parent();
//        Selenide.closeWebDriver();
//    }
//
//    @Then("search del ad and close")
//    public void searchDelAD(){
//        StartPage startPage = new StartPage();
//        startPage.searchAd(randomName, randomPrice);
//        ad
//                .shouldNotBe(visible)
//                .find(byAttribute("alt", randomName)).shouldNotBe(visible).parent();
//        Selenide.closeWebDriver();
//    }
//}
