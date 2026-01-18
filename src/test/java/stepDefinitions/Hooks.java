//package cucumber;
//
//import com.codeborne.selenide.Selenide;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import com.github.javafaker.Faker;
//import org.junit.jupiter.api.AfterEach;
//
//import java.util.Locale;
//
//
//public class Hooks {
////
////    private final TestContext testContext;
////
////    public Hooks(TestContext testContext) {
////        this.testContext = testContext;
////    }
////
////    private String randomEmail;
////
////    private String randomPass;
//
////    @Before
////    public void setUp(){
////    }
//
////    @Before
////    public void setUp(){
////        Faker faker = new Faker(new Locale("en"));
////        randomEmail = faker.internet().emailAddress();
////        randomPass = faker.internet().password(8,12);
////        testContext.setRandomEmail(faker.internet().emailAddress());
////        testContext.setRandomPass(faker.internet().password(8,12));
////    }
//
//    @AfterEach
//    public void tearDown(){
//        Selenide.closeWebDriver();
//    }
//}
