package stepDefinitions;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class EnterPage {

    private SelenideElement email = $(By.name("email"));
    private SelenideElement password = $(By.name("password"));
    private SelenideElement enterButton = $(By.xpath(".//button[text()='Войти']"));
    private SelenideElement regButton = $(withText("Нет аккаунта"));

    public void enterAcc(String mail, String pass) {
        email.setValue(mail);
        password.setValue(pass);
        enterButton.click();
    }

    public RegPage openRegPage(){
        regButton.click();
        return new RegPage();
    }


}
