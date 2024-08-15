package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static dataForTests.DataForTests.*;

public class ChangeCitySteps {

    private static String address = "";

    @When("Пользователь нажал на кнопку “Смена города”")
    public void openChangeCity() {
        $(By.xpath(XPATH_FOR_OPEN_CHANGE_CITY)).shouldBe(visible).click();
    }

    @And("Ввёл в поисковую строку {string}")
    public void enterCity(String city) {
        $(By.xpath(XPATH_FOR_INPUT_CITY)).shouldBe(enabled).setValue(city);
    }

    @And("Выбрал первый адрес из списка адресов")
    public void selectFirstAddress() {
        address = $(By.xpath(XPATH_FOR_GET_FIRST_ADDRESS)).getText();
        $(By.xpath(XPATH_FOR_FIRST_ADDRESS)).shouldBe(enabled).click();
    }

    @Then("Открылась информация о центре выдачи")
    @And("Адрес пункта выдачи совпадает с тем адресом, что был предложен в списке адресов")
    public void infoIsOpen() {
        $(By.xpath(XPATH_FOR_ADDRESS)).shouldBe(visible);
        $(By.xpath(XPATH_FOR_ADDRESS)).shouldHave(text(address));
    }

    @When("Пользователь нажал на кнопку “Выбрать”")
    public void applyAddress() {
        $(By.xpath(XPATH_FOR_APPLY_ADDRESS)).shouldBe(clickable).click();
    }

    @Then("Произошел переход на главную страницу WB")
    @And("Отображается выбранный адрес пункта выдачи")
    public void isAddressApplyAndOpenMainPage() {
        webdriver().shouldHave(url(WB));
        $(By.xpath(XPATH_FOR_OPEN_CHANGE_CITY)).shouldHave(text(address));
    }
}
