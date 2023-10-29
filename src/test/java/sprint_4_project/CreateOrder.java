package sprint_4_project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeOptions;
import sprint_4_project.POM.MainPage;
import sprint_4_project.POM.OrderCreation;
import sprint_4_project.Steps.Steps;

import static org.junit.Assert.assertEquals;

public class CreateOrder {
    private static WebDriver driver;

    @Before
    public void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Test
    public void orderCreatedFirstButton() {

        MainPage mainPage = new MainPage(driver);
        OrderCreation orderCreation = new OrderCreation(driver);
        Steps steps = new Steps(driver);

        steps
                .open(mainPage.getURL())
                .click(mainPage.getFirstOrderButton())
                .click(orderCreation.getSkipCookie())
                .inputText(orderCreation.getOrderName(), "Вячеслав")
                .inputText(orderCreation.getOrderSurname(), "Пупков")
                .inputText(orderCreation.getOrderAdress(), "Колотушкина, 1")
                .click(orderCreation.getOrderSubwayStation())
                .click(orderCreation.getCherkizovoStation())
                .inputText(orderCreation.getOrderPhone(), "+71112223344")
                .click(orderCreation.getNextButton())
                .click(orderCreation.getOrderDeliveryDate())
                .click(orderCreation.getOrderPickDate())
                .click(orderCreation.getOrderRentPeriod())
                .click(orderCreation.getOrderPickPeriod())
                .click(orderCreation.getOrderPickBlackColor())
                .click(orderCreation.getOrderFinalButton())
                .click(orderCreation.getConfirmationButton());


        assertEquals("Элемента нет на странице",
                true,
                steps.checkShown(orderCreation.getOrderSuccess()));


    }

    /* Задумывался как негативный тест, но в нем не проходится весь флоу
    @Test
    public void orderNotCreatedFirstButton() {

        MainPage mainPage = new MainPage(driver);
        OrderCreation orderCreation = new OrderCreation(driver);
        Steps steps = new Steps(driver);

        steps
                .open(mainPage.getURL())
                .click(mainPage.getFirstOrderButton())
                .click(orderCreation.getSkipCookie())
                .inputText(orderCreation.getOrderName(), "Вячеслав")
                .inputText(orderCreation.getOrderSurname(), "Пупков")
                .inputText(orderCreation.getOrderAdress(), "Колотушкина, 1")
                .click(orderCreation.getOrderSubwayStation())
                .click(orderCreation.getCherkizovoStation())
                .inputText(orderCreation.getOrderPhone(), "+711") //некорректный номер
                .click(orderCreation.getNextButton())
                .click(orderCreation.getOrderDeliveryDate())
                .click(orderCreation.getOrderPickDate())
                .click(orderCreation.getOrderRentPeriod())
                .click(orderCreation.getOrderPickPeriod())
                .click(orderCreation.getOrderPickBlackColor())
                .click(orderCreation.getOrderFinalButton())
                .click(orderCreation.getConfirmationButton());


        assertEquals("Элемента нет на странице",
                false,
                steps.checkShown(orderCreation.getOrderSuccess()));


    }
    */


    @Test
    public void orderCreatedSecondButton() {

        MainPage mainPage = new MainPage(driver);
        OrderCreation orderCreation = new OrderCreation(driver);
        Steps steps = new Steps(driver);

        steps
                .open(mainPage.getURL())
                .scroll(mainPage.getSecondOrderButton())
                .click(mainPage.getSecondOrderButton())
                .click(orderCreation.getSkipCookie())
                .inputText(orderCreation.getOrderName(), "Мстислав")
                .inputText(orderCreation.getOrderSurname(), "Коровин")
                .inputText(orderCreation.getOrderAdress(), "Болотушкина, 1")
                .click(orderCreation.getOrderSubwayStation())
                .click(orderCreation.getCherkizovoStation())
                .inputText(orderCreation.getOrderPhone(), "+71112223377")
                .click(orderCreation.getNextButton())
                .click(orderCreation.getOrderDeliveryDate())
                .click(orderCreation.getOrderPickDate())
                .click(orderCreation.getOrderRentPeriod())
                .click(orderCreation.getOrderPickPeriod())
                .click(orderCreation.getOrderPickBlackColor())
                .click(orderCreation.getOrderFinalButton())
                .click(orderCreation.getConfirmationButton());


        assertEquals("Элемента нет на странице",
                true,
                steps.checkShown(orderCreation.getOrderSuccess()));


    }

    @After
    public void tearDown() {

        driver.quit();

    }


}
