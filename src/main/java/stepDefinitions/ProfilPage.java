package stepDefinitions;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProfilPage {

    private SelenideElement saveChanges = $(By.xpath(".//button[text()='Сохранить изменения']"));
}
