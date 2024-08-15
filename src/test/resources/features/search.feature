@search
Feature: Поисковая строка
  Scenario: Поиск товара с помощью поисковой строки
    Given Пользователь открыл страницу "https://www.wildberries.ru/"
    When Пользователь нажимет на поисковую строку
    And вводит "iPhone 13"
    And Нажимает Enter
    Then На странице присутствует текст "По запросу iPhone 13 найдено"
    And Первым фильтром является - "iPhone 13"
    And Применён фильтр "По популярности"
    And У первого устройства из списка бренд - "Apple"
    When Пользователь нажимает на крестик
    Then Поисковая строка очищается