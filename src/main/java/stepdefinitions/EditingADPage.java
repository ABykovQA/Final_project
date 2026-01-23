package stepdefinitions;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EditingADPage {

    private SelenideElement inputName = $(By.xpath(".//input[@placeholder='Название']"));
    private SelenideElement saveEditBtn = $(By.xpath(".//button[text()='Сохранить изменения']"));

    public EditingADPage() {
    }

    public void editingAD(String name){
        inputName.clear();
        inputName.setValue(name);
        saveEditBtn.click();
    }
}
