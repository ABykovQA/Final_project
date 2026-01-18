package stepDefinitions;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ADPage {

    private SelenideElement editingBtn = $(By.xpath(".//button[text()='Редактировать объявление']"));
    private SelenideElement delBtn = $(By.xpath(".//button[text()='Удалить']"));

    public ADPage() {
    }

    public void edinigAD(){
        editingBtn.click();
    }

    public void delAD(){
        delBtn.click();
    }
}
