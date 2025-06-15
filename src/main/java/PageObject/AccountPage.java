package PageObject;

import AbstractConstructor.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.io.FileNotFoundException;

public class AccountPage extends AbstractComponent {
    public WebDriver driver;

    public AccountPage(WebDriver driver) throws FileNotFoundException {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='overview.htm']")
    WebElement accountOverview;

    @FindBy(xpath = "//tr[td/b[text()='Total']]/td[2]/b")
    WebElement totalAmount;


    public void GetBalance() throws Exception {
        accountOverview.click();
        totalAmount.getText();
        System.out.println("Total Amount is: " + totalAmount.getText());


    }


}
