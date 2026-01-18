package stepDefinitions;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class CreateADPage {

    private SelenideElement inputProductName = $(By.xpath(".//input[@placeholder='Название']"));
    private SelenideElement inputPrice = $(By.xpath(".//input[@placeholder='Стоимость']"));
    private SelenideElement createBtn = $(By.xpath(".//button[text()='Опубликовать']"));

    public CreateADPage() {
    }

    public void createNewAD(String name, int price){
        inputProductName.setValue(name);
        inputPrice.setValue(String.valueOf(price));
        createBtn.click();
    }
}
