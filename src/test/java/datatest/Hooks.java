package datatest;

import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import java.util.Locale;

public class Hooks {

    private ScenarioContext scenarioContext;

    public Hooks(ScenarioContext context) {
        this.scenarioContext = context;
    }

    @Before
    public void setUp(){
        Faker faker = new Faker(new Locale("en"));
        String randomName = faker.commerce().productName();
        int randomPrice = faker.number().numberBetween(1, 10000);
        String randomEditName = faker.commerce().productName();
        String randomEmail = faker.internet().emailAddress();
        String randomPass = faker.internet().password();

        scenarioContext.setContext("randomName", randomName);
        scenarioContext.setContext("randomPrice", randomPrice);
        scenarioContext.setContext("randomEditName", randomEditName);
        scenarioContext.setContext("randomEmail", randomEmail);
        scenarioContext.setContext("randomPass", randomPass);
    }


    @After
        public void tearDown() {
        System.out.println("Tearing down the scenario.");
        ScenarioContext.clear();
        Selenide.closeWebDriver();
        System.out.println("Browser closed.");
    }
}
