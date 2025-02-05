@changeCity
Feature: Смена адреса пвз на сайте интернет-магазина
  Scenario: Поиск и выбор адреса по карте
    Given Пользователь открыл страницу "https://www.wildberries.ru/"
    When Пользователь нажал на кнопку “Смена города”
    And Ввёл в поисковую строку "Санкт-Петербург"
    And Выбрал первый адрес из списка адресов
    Then Открылась информация о центре выдачи
    And Адрес пункта выдачи совпадает с тем адресом, что был предложен в списке адресов
    When Пользователь нажал на кнопку “Выбрать”
    Then Произошел переход на главную страницу WB
    And Отображается выбранный адрес пункта выдачи