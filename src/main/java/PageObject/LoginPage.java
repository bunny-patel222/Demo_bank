package PageObject;

import AbstractConstructor.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class LoginPage extends AbstractComponent {


    public LoginPage(WebDriver driver) throws FileNotFoundException {
        super(driver);
        PageFactory.initElements(driver, this);

    }
    @FindBy(css = "input[name='username']")
    WebElement userName;

    @FindBy(css = "input[name='password']")
    WebElement password;

    @FindBy(css = "input[type='submit']")
    WebElement submitLogin;


    public void loginIn(String UserName, String Password) {
        userName.sendKeys(UserName);
        password.sendKeys(Password);
        submitLogin.click();
        String title = driver.getTitle();
        System.out.println(title);
    }
}
