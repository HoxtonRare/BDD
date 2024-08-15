package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static dataForTests.DataForTests.XPATH_FOR_FIRST_PRODUCT;

public class StartPage {

    @Given("Пользователь открыл страницу {string}")
    public void openMainPage(String url) {
        open(url);
        $(By.xpath(XPATH_FOR_FIRST_PRODUCT)).shouldBe(enabled);
    }
}
