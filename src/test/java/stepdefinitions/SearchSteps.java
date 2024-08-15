package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static dataForTests.DataForTests.*;

public class SearchSteps {

    @When("Пользователь нажимет на поисковую строку")
    public void clickOnSearchInput() {
      $(By.id(ID_FOR_SEARCH_INPUT)).shouldBe(enabled).click();
    }

    @And("вводит {string}")
    public void inputSearchRequest(String request) {
        $(By.id(ID_FOR_SEARCH_INPUT)).shouldBe(enabled).setValue(request);
    }
    @And("Нажимает Enter")
    public void pressEnter() {
        $(By.id(ID_FOR_SEARCH_INPUT)).pressEnter();
    }

    @Then("На странице присутствует текст {string}")
    public void checkForText(String expected) {
        $(By.xpath(XPATH_FOR_TEXT_AFTER_SEARCH)).shouldHave(text(expected));
    }

    @And("Первым фильтром является - {string}")
    public void checkForFirstFilter(String firstFilter) {
        $(By.xpath(XPATH_FOR_FIRST_FILTER)).shouldHave(text(firstFilter));
    }
    @And("Применён фильтр {string}")
    public void checkForSort(String sort) {
        $(By.xpath(XPATH_FOR_SORTING)).shouldHave(text(sort));
    }
    @And ("У первого устройства из списка бренд - {string}")
    public void checkForManufacturer(String manufacturer) {
        $(By.xpath(XPATH_FOR_MANUFACTURER)).shouldHave(text(manufacturer));
    }

    @When("Пользователь нажимает на крестик")
    public void clearSearchInput() {
        $(By.xpath(XPATH_FOR_CLEAR_SEARCH_INPUT)).click();
    }

    @Then("Поисковая строка очищается")
    public void searchInputIsClear() {
        $(By.id(ID_FOR_SEARCH_INPUT)).shouldBe(empty);
    }
}
