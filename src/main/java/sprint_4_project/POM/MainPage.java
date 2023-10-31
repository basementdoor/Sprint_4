package sprint_4_project.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final String URL = "https://qa-scooter.praktikum-services.ru";
    //Область FAQ
    private final By faqField = By.className("Home_FAQ__3uVm4");
    //Вопросы
    private final By firstQuestion = By.id("accordion__heading-0");

    private final By secondQuestion = By.id("accordion__heading-1");

    private final By thirdQuestion = By.id("accordion__heading-2");

    private final By fourthQuestion = By.id("accordion__heading-3");

    private final By fifthQuestion = By.id("accordion__heading-4");

    private final By sixthQuestion = By.id("accordion__heading-5");

    private final By seventhQuestion = By.id("accordion__heading-6");

    private final By eighthQuestion = By.id("accordion__heading-7");

    // Локаторы ответов на вопросы
    private final By firstQuestionAnswer = By.xpath(".//div[@id='accordion__panel-0']/p");

    private final By secondQuestionAnswer = By.xpath(".//div[@id='accordion__panel-1']/p");

    private final By thirdQuestionAnswer = By.xpath(".//div[@id='accordion__panel-2']/p");

    private final By fourthQuestionAnswer = By.xpath(".//div[@id='accordion__panel-3']/p");

    private final By fifthQuestionAnswer = By.xpath(".//div[@id='accordion__panel-4']/p");

    private final By sixthQuestionAnswer = By.xpath(".//div[@id='accordion__panel-5']/p");

    private final By seventhQuestionAnswer = By.xpath(".//div[@id='accordion__panel-6']/p");

    private final By eighthQuestionAnswer = By.xpath(".//div[@id='accordion__panel-7']/p");

    // первая кнопка заказать
    private final By firstOrderButton = By.xpath(".//button[@class='Button_Button__ra12g']");

    // вторая кнопка заказать
    private final By secondOrderButton = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM')]");

// далее геттеры на поля

    public String getURL() {
        return URL;
    }

    public By getFaqField() {
        return faqField;
    }

    public By getFirstQuestion() {
        return firstQuestion;
    }

    public By getSecondQuestion() {
        return secondQuestion;
    }

    public By getThirdQuestion() {
        return thirdQuestion;
    }

    public By getFourthQuestion() {
        return fourthQuestion;
    }

    public By getFifthQuestion() {
        return fifthQuestion;
    }

    public By getSixthQuestion() {
        return sixthQuestion;
    }

    public By getSeventhQuestion() {
        return seventhQuestion;
    }

    public By getEighthQuestion() {
        return eighthQuestion;
    }

    // Геттеры ответов на вопросы и кнопок Заказать

    public By getFirstQuestionAnswer() {
        return firstQuestionAnswer;
    }

    public By getSecondQuestionAnswer() {
        return secondQuestionAnswer;
    }

    public By getThirdQuestionAnswer() {
        return thirdQuestionAnswer;
    }

    public By getFourthQuestionAnswer() {
        return fourthQuestionAnswer;
    }

    public By getFifthQuestionAnswer() {
        return fifthQuestionAnswer;
    }

    public By getSixthQuestionAnswer() {
        return sixthQuestionAnswer;
    }

    public By getSeventhQuestionAnswer() {
        return seventhQuestionAnswer;
    }

    public By getEighthQuestionAnswer() {
        return eighthQuestionAnswer;
    }

    public By getFirstOrderButton() {
        return firstOrderButton;
    }

    public By getSecondOrderButton() {
        return secondOrderButton;
    }


}
