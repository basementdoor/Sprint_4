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

    private final By orderName = By.xpath(".//input[@placeholder='* Имя']");

    // поле Фамилия
    private final By orderSurname = By.xpath(".//input[@placeholder='* Фамилия']");

    // поле Адрес
    private final By orderAdress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    // поле Станция метро
    private final By orderSubwayStation = By.xpath(".//input[@placeholder='* Станция метро']");

    // станции метро (для выбора)
    private final By cherkizovoStation = By.xpath(".//div[@class='Order_Text__2broi' and text()='Черкизовская']");

    private final By sokolnikiStation = By.xpath(".//div[@class='Order_Text__2broi' and text()='Сокольники']");

    // поле Телефон
    private final By orderPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    // кнопка Далее
    private final By nextButton = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM')]");

    // поле Когда привезти самокат

    private final By orderDeliveryDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    // выбор даты доставки
    private final By orderPickDate = By.xpath(".//div[contains(@class, 'react-datepicker__day')and @tabindex='0']");

    // поле Срок аренды

    private final By orderRentPeriod = By.className("Dropdown-placeholder");

    // выбор срока аренды

    private final By orderPickPeriod = By.xpath(".//div[@class='Dropdown-option' and text()='сутки']");

    // выбор цвета самоката
    private final By orderPickBlackColor = By.xpath(".//input[@id='black']");

    private final By orderPickGreyColor = By.xpath(".//input[@id='grey']");

    // финальная кнопка Заказать

    private final By orderFinalButton = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM')and text()='Заказать']");

    // кнопка подтверждения заказа
    private final By confirmationButton = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM') and text()='Да']");

    // окно успешного заказа
    private final By orderSuccess = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']");

    // окно для ввода параметров заказа
    private final  By orderForm = By.className("Order_Content__bmtHS");

    public By getOrderForm() {
        return orderForm;
    }

    public By getOrderPickGreyColor() {
        return orderPickGreyColor;
    }
    public By getSokolnikiStation() {
        return sokolnikiStation;
    }
    public By getOrderAdress() {
        return orderAdress;
    }
    public By getOrderSubwayStation() {
        return orderSubwayStation;
    }
    public By getCherkizovoStation() {
        return cherkizovoStation;
    }
    public By getOrderPhone() {
        return orderPhone;
    }
    public By getNextButton() {
        return nextButton;
    }
    public By getOrderDeliveryDate() {
        return orderDeliveryDate;
    }
    public By getOrderPickDate() {
        return orderPickDate;
    }
    public By getOrderRentPeriod() {
        return orderRentPeriod;
    }
    public By getOrderPickPeriod() {
        return orderPickPeriod;
    }
    public By getOrderPickBlackColor() {
        return orderPickBlackColor;
    }
    public By getOrderFinalButton() {
        return orderFinalButton;
    }
    public By getConfirmationButton() {
        return confirmationButton;
    }
    public By getOrderSurname() {
        return orderSurname;
    }
    public By getSkipCookie() {
        return skipCookie;
    }
    public By getOrderName() {
        return orderName;
    }
    public By getOrderSuccess() {
        return orderSuccess;
    }



}
