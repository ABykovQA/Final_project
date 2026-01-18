package stepDefinitions;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegPage {

    private SelenideElement emailInput = $(By.name("email"));
    private SelenideElement passwordInput = $(By.name("password"));
    private SelenideElement submitPasswordInput = $(By.name("submitPassword"));
    private SelenideElement regButton = $(By.xpath(".//Button[text()='Создать аккаунт']"));
    public static final String regPage = "https://qa-desk.stand.praktikum-services.ru/regiatration";


    public void openRegPage(){
        open(regPage);
    }

    public void regUser(String mail, String pass){
    emailInput.setValue(mail);
    passwordInput.setValue(pass);
    submitPasswordInput.setValue(pass);
    regButton.click();
    }
}
