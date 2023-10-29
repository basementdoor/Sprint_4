package sprint_4_project.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Steps {

    private WebDriver driver;

    public Steps(WebDriver driver) {
        this.driver = driver;
    }

    public Steps open(String url) {
        driver.get(url);
        return this;
    }

    public Steps click(By element) {
        driver.findElement(element).click();
        return this;
    }

    public Steps inputText(By element, String text) {
        driver.findElement(element).sendKeys(text);
        return this;
    }

    public Steps scroll(By element) {
        WebElement webElement = driver.findElement(element);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", webElement);
        return this;
    }

    public String getWebText(By element) {
        return driver.findElement(element).getText();
    }

    public boolean checkShown(By element) {
        return driver.findElements(element).size() > 0;
    }

}
