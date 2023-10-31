package sprint_4_project;

import org.junit.Test;
import sprint_4_project.POM.MainPage;
import sprint_4_project.POM.OrderCreation;
import sprint_4_project.Steps.Steps;

import static org.junit.Assert.assertEquals;

public class SecondButtonOrderForm extends BeforeAndAfter {

    @Test
    public void orderFormOpenedSecondButton() {

        MainPage mainPage = new MainPage(driver);
        OrderCreation orderCreation = new OrderCreation(driver);
        Steps steps = new Steps(driver);

        steps
                .open(mainPage.getURL())
                .scroll(mainPage.getSecondOrderButton())
                .click(mainPage.getSecondOrderButton());


        assertEquals("Окна для ввода данных заказа нет на странице",
                true,
                steps.checkShown(orderCreation.getOrderForm()));


    }
}
