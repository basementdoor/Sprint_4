package sprint_4_project.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderCreation {

    private final WebDriver driver;

    public OrderCreation(WebDriver driver) {
        this.driver = driver;
    }

    // кнопка для скипа сообщения о куках
    private final By skipCookie = By.className("App_CookieButton__3cvqF");

    public By getSkipCookie() {
        return skipCookie;
    }

    // поле Имя
    public By getOrderName() {
        return orderName;
    }

    private final By orderName = By.xpath(".//input[@placeholder='* Имя']");

    public By getOrderSurname() {
        return orderSurname;
    }

    // поле Фамилия
    private final By orderSurname = By.xpath(".//input[@placeholder='* Фамилия']");

    public By getOrderAdress() {
        return orderAdress;
    }

    // поле Адрес
    private final By orderAdress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    public By getOrderSubwayStation() {
        return orderSubwayStation;
    }

    // поле Станция метро
    private final By orderSubwayStation = By.xpath(".//input[@placeholder='* Станция метро']");

    public By getCherkizovoStation() {
        return cherkizovoStation;
    }

    // станция Черкизовская (для выборы)
    private final By cherkizovoStation = By.xpath(".//div[@class='Order_Text__2broi' and text()='Черкизовская']");

    public By getOrderPhone() {
        return orderPhone;
    }

    // поле Телефон
    private final By orderPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    // кнопка Далее
    private final By nextButton = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM')]");

    public By getNextButton() {
        return nextButton;
    }

    // поле Когда привезти самокат

    public By getOrderDeliveryDate() {
        return orderDeliveryDate;
    }

    private final By orderDeliveryDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");



    // выбор сегодняшней даты доставки
    private final By orderPickDate = By.xpath(".//div[contains(@class, 'react-datepicker__day')and @tabindex='0']");

    public By getOrderPickDate() {
        return orderPickDate;
    }

    // поле Срок аренды

    private final By orderRentPeriod = By.className("Dropdown-placeholder");

    public By getOrderRentPeriod() {
        return orderRentPeriod;
    }

    // выбор срока аренды

    private final By orderPickPeriod = By.xpath(".//div[@class='Dropdown-option' and text()='сутки']");

    public By getOrderPickPeriod() {
        return orderPickPeriod;
    }

    // выбор черного цвета самоката
    private final By orderPickBlackColor = By.xpath(".//input[@id='black']");

    public By getOrderPickBlackColor() {
        return orderPickBlackColor;
    }

    // финальная кнопка Заказать

    private final By orderFinalButton = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM')and text()='Заказать']");

    public By getOrderFinalButton() {
        return orderFinalButton;
    }

    // кнопка подтверждения заказа
    private final By confirmationButton = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM') and text()='Да']");

    public By getConfirmationButton() {
        return confirmationButton;
    }


    // окно успешного заказа
    private final By orderSuccess = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']");

    public By getOrderSuccess() {
        return orderSuccess;
    }



}
