package dataForTests;

public class DataForTests {
    //SearchSteps
    public static final String XPATH_FOR_FIRST_PRODUCT = "//div[@class='main-page__content']/descendant::article[1]/div/a";
    public static final String ID_FOR_SEARCH_INPUT = "searchInput";
    public static final String XPATH_FOR_MANUFACTURER = "//div[@class='product-card-list']/descendant::article[1]//span[@class = 'product-card__brand']";
    public static final String XPATH_FOR_TEXT_AFTER_SEARCH = "//h1";
    public static final String XPATH_FOR_FIRST_FILTER = "//*[@class = 'dropdown-filter__btn'][1]";
    public static final String XPATH_FOR_SORTING = "//div[@class='dropdown-filter'][1]/button";
    public static final String XPATH_FOR_CLEAR_SEARCH_INPUT = "//button[@aria-label = 'Очистить поиск']";

    //ChangeCity
    public static final String XPATH_FOR_OPEN_CHANGE_CITY = "//li[@class = 'simple-menu__item j-geocity-wrap']";
    public static final String XPATH_FOR_INPUT_CITY = "//input [@autocomplete = 'off'][@placeholder = 'Введите адрес']";
    public static final String XPATH_FOR_GET_FIRST_ADDRESS = "//div[@id='pooList']/div[1]//span[@class = 'address-item__name-text']";
    public static final String XPATH_FOR_ADDRESS = "//span[@class = 'details-self__name-text']";
    public static final String XPATH_FOR_FIRST_ADDRESS = "//div[@id='pooList']/div[1]";
    public static final String XPATH_FOR_APPLY_ADDRESS = "//button[text() = 'Выбрать']";
    public static final String WB = "https://www.wildberries.ru/";

    //FilterSteps
    public static final String XPATH_FOR_CATALOG = "//button[@aria-label = 'Навигация по сайту']";
    public static final String XPATH_FOR_ELECTRONIC = "//span[text() = 'Электроника']";
    public static final String XPATH_FOR_COMPUTERS_AND_LAPTOPS = "//span[text() = 'Ноутбуки и компьютеры']";
    public static final String XPATH_FOR_LAPTOPS = "//a[text() = 'Ноутбуки']";
    public static final String PAGE_AFTER_SEARCH = "https://www.wildberries.ru/catalog/elektronika/noutbuki-pereferiya/noutbuki-ultrabuki";
    public static final String PAGE_WITH_FILTERS = "https://www.wildberries.ru/catalog/elektronika/noutbuki-pereferiya/noutbuki-ultrabuki?sort=popular&page=1&fdlvr=72&fbrand=6049&priceU=10000000%3B14900000&f4474=8071618";
    public static final String XPATH_FOR_COUNT_OF_PRODUCT_ON_PAGE = "//span[@class = 'goods-count']";
    public static final String XPATH_FOR_FIRST_FILTER_ON_PAGE = "(//span[@class = 'your-choice__btn'])[1]";
    public static final String XPATH_FOR_SECOND_FILTER_ON_PAGE = "(//span[@class = 'your-choice__btn'])[2]";
    public static final String XPATH_FOR_THIRD_FILTER_ON_PAGE = "(//span[@class = 'your-choice__btn'])[3]";
    public static final String XPATH_FOR_FOURTH_FILTER_ON_PAGE = "(//span[@class = 'your-choice__btn'])[4]";
    public static final String XPATH_FOR_RESET_FILTERS = "//button[@class = 'your-choice__btn']";
    public static final String XPATH_FOR_ALL_FILTERS = "//button[text() = 'Все фильтры']";
    public static final String XPATH_FOR_START_PRICE_FILTER = "//input[@name = 'startN']";
    public static final String XPATH_FOR_END_PRICE_FILTER = "//input[@name = 'endN']";
    public static final String XPATH_FOR_MANUFACTURER_FILTER = "//span[@class = 'checkbox-with-text__text'][text() = 'Apple']";
    public static final String XPATH_FOR_DIAGONAL_FILTER = "//span[@class = 'checkbox-with-text__text'][text() = '13.3\"']";
    public static final String XPATH_FOR_DELIVERY_THREE_DAYS_FILTER = "//span[text() = 'до 3 дней']";
    public static final String XPATH_FOR_APPLY_FILTERS = "//button[text() = 'Показать']";
    public static final String XPATH_FOR_COUNT_PRODUCT_AFTER_FILTERS = "//p[@class = 'filters-desktop__count-goods']";

    public static final String FILTER_DELIVERY = "до 3 дней";
    public static final String FILTER_MANUFACTURER = "Apple";
    public static final String FILTER_PRICE = "от 100 000 до 149 000";
    public static final String FILTER_DIAGONAL = "13.3\"";
    public static final String START_PRICE = "100000";
    public static final String END_PRICE = "149000";
}
