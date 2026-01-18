package stepDefinitions;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class StartPage {
    private SelenideElement enterAndRegButton = $(By.xpath(".//button[text()='Вход и регистрация']"));
    private SelenideElement newAdButton = $(By.xpath(".//button[text()='Разместить объявление']"));
    private SelenideElement inputName = $(By.xpath("//input[@placeholder='Я хочу купить...']"));
    private SelenideElement inputPrice = $(By.xpath("//input[@name='price']"));
    private SelenideElement searchButton = $(By.xpath("//button[text()='Применить']"));
    private SelenideElement regButton = $(withText("Нет аккаунта"));
    public static final String startPage = "https://qa-desk.stand.praktikum-services.ru/";



    public EnterPage clickEnterButton() {
        enterAndRegButton.click();
        return new EnterPage();
    }

    public void clickNewAdButton() {
        newAdButton.click();
    }

    public void openStarPage(){
        open(startPage);
    }

    public void enterPage(){
        open(startPage);
        enterAndRegButton.click();
    }

    public void regPage(){
        open(startPage);
        enterAndRegButton.click();
        regButton.click();
    }

    public void searchAd(String name, int price){
        inputName.setValue(name);
        inputPrice.setValue(String.valueOf(price));
        searchButton.click();
    }

}
