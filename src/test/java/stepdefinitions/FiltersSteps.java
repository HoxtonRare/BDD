package stepdefinitions;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static dataForTests.DataForTests.*;

public class FiltersSteps {
    private static String countProductWithFilter = "";


    @When("Пользователь нажал “Фильтры”")
    public void openCatalog() {
        $(By.xpath(XPATH_FOR_CATALOG)).shouldBe(clickable).click();
    }

    @And("Выбрал фильтр: \"Электроника\" - \"Ноутбуки и компьютеры\" - \"Ноутбуки\"")
    public void selectCategory() {
        $(By.xpath(XPATH_FOR_ELECTRONIC)).shouldBe(visible).hover();
        $(By.xpath(XPATH_FOR_COMPUTERS_AND_LAPTOPS)).shouldBe(clickable).click();
        $(By.xpath(XPATH_FOR_LAPTOPS)).shouldBe(clickable).click();
    }

    @Then("Открылась страница с ноутбуками")
    public void checkForOpenPage() {
        webdriver().shouldHave(url(PAGE_AFTER_SEARCH));
    }

    @When("Пользователь выставляет фильтры: минимальная, максимальная цена, срок доставки, Бренд, диагональ экрана")
    public void enterFilters() {
        $(By.xpath(XPATH_FOR_ALL_FILTERS)).shouldBe(clickable).click();
        $(By.xpath(XPATH_FOR_START_PRICE_FILTER)).shouldBe(enabled).setValue(START_PRICE);
        $(By.xpath(XPATH_FOR_END_PRICE_FILTER)).shouldBe(enabled).setValue(END_PRICE);
        $(By.xpath(XPATH_FOR_MANUFACTURER_FILTER)).shouldBe(clickable).click();
        $(By.xpath(XPATH_FOR_DIAGONAL_FILTER)).shouldBe(clickable).click();
        $(By.xpath(XPATH_FOR_DELIVERY_THREE_DAYS_FILTER)).shouldBe(clickable).click();
        countProductWithFilter = getCountProduct(countProductWithFilter);
    }

    @And("Нажимает на кнопку “Показать”")
    public static void applyFilters() {
        $(By.xpath(XPATH_FOR_APPLY_FILTERS)).shouldBe(clickable).click();
    }

    @Then("Фильтр активируется")
    public void checkForApplyFilters() {
        webdriver().shouldHave(url(PAGE_WITH_FILTERS));
    }

    @And("Кол-во товара на страница = количеству товара на странице")
    public void checkForCountOfProduct() {
        $(By.xpath(XPATH_FOR_COUNT_OF_PRODUCT_ON_PAGE)).shouldHave(text(countProductWithFilter));
    }

    @And("Выбранные фильтры отображаются на странице")
    public void isApplyFilters() {
        $(By.xpath(XPATH_FOR_FIRST_FILTER_ON_PAGE)).shouldHave(text(FILTER_DELIVERY));
        $(By.xpath(XPATH_FOR_SECOND_FILTER_ON_PAGE)).shouldHave(text(FILTER_MANUFACTURER));
        $(By.xpath(XPATH_FOR_THIRD_FILTER_ON_PAGE)).shouldHave(text(FILTER_PRICE));
        $(By.xpath(XPATH_FOR_FOURTH_FILTER_ON_PAGE)).shouldHave(text(FILTER_DIAGONAL));
    }

    @And("Появилась кнопка \"Сбросить все\"")
    public void checkForButtonForReset() {
        $(By.xpath(XPATH_FOR_RESET_FILTERS)).shouldBe(visible);
    }

    private static String getCountProduct(String expected) {
        Selenide.sleep(1000);
        expected = getExpetedCountOfProductAfterFilters(expected);
        return expected;
    }

    private static String getExpetedCountOfProductAfterFilters(String expected) {
        expected = $(By.xpath(XPATH_FOR_COUNT_PRODUCT_AFTER_FILTERS)).getText();
        return expected.replace("Нашли ", "");
    }
}
