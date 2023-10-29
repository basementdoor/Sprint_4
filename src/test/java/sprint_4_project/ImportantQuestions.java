package sprint_4_project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeOptions;
import sprint_4_project.POM.MainPage;
import sprint_4_project.Steps.Steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(Parameterized.class)
public class ImportantQuestions {

    private static WebDriver driver;
    static MainPage mainPage = new MainPage(driver);
    public final By questionButton;
    public final By answerText;
    public final String expectedText;

    public ImportantQuestions(By questionButton, By answerText, String expectedText) {
        this.questionButton = questionButton;
        this.answerText = answerText;
        this.expectedText = expectedText;
    }

    public static String[] correctAnswers = {"Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
            "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
            "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
            "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
            "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
            "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
            "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
            "Да, обязательно. Всем самокатов! И Москве, и Московской области."};


    @Parameterized.Parameters
    public static Object[][] getAnswers() {
        return new Object[][] {
                { mainPage.getFirstQuestion(), mainPage.getFirstQuestionAnswer(), correctAnswers[0]},
                { mainPage.getSecondQuestion(), mainPage.getSecondQuestionAnswer(), correctAnswers[1]},
                { mainPage.getThirdQuestion(), mainPage.getThirdQuestionAnswer(), correctAnswers[2]},
                { mainPage.getFourthQuestion(), mainPage.getFourthQuestionAnswer(), correctAnswers[3]},
                { mainPage.getFifthQuestion(), mainPage.getFifthQuestionAnswer(), correctAnswers[4]},
                { mainPage.getSixthQuestion(), mainPage.getSixthQuestionAnswer(), correctAnswers[5]},
                { mainPage.getSeventhQuestion(), mainPage.getSeventhQuestionAnswer(), correctAnswers[6]},
                { mainPage.getEighthQuestion(), mainPage.getEighthQuestionAnswer(), correctAnswers[7]},
        };
    }



    @Before
    public void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Test
    public void answerCorrespondsToQuestion() {

        MainPage mainPage = new MainPage(driver);
        Steps steps = new Steps(driver);

        steps
                .open(mainPage.getURL())
                .scroll(mainPage.getFaqField())
                .click(questionButton);

        assertEquals("Фактический ответ не соответствует ожидаемому",
                expectedText,
                steps.getWebText(answerText));

    }

    @Test // негативный тест
    public void answerNotCorrespondsToQuestion() {

        MainPage mainPage = new MainPage(driver);
        Steps steps = new Steps(driver);

        final String incorrectText = "Некорректный текст";

        steps
                .open(mainPage.getURL())
                .scroll(mainPage.getFaqField())
                .click(questionButton);

        assertNotEquals("В блоке содержится некорректный текст",
                incorrectText,
                steps.getWebText(answerText));

    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
