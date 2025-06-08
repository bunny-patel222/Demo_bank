package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public WebDriver driver;

    public RegisterPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void NavigateToRegisterPage() {
        // Implement the logic to navigate to the register page

        driver.findElement(By.cssSelector("a[href*='register.htm']")).click();
        String title = driver.getTitle();
        System.out.println(title);
    }

    @FindBy(id = "customer.firstName")
    WebElement firstName;

    @FindBy(id = "customer.lastName")
    WebElement lastName;

    @FindBy(id = "customer.address.street")
    WebElement address;

    @FindBy(id = "customer.address.city")
    WebElement city;

    @FindBy(id = "customer.address.state")
    WebElement state;

    @FindBy(css = "input[name='customer.address.zipCode']")
    WebElement zip;

    @FindBy(id = "customer.phoneNumber")
    WebElement phone;

    @FindBy(id = "customer.ssn")
    WebElement ssn;

    @FindBy(id = "customer.username")
    WebElement userName;
    @FindBy(id = "customer.password")
    WebElement password;
    @FindBy(css = "input[name='repeatedPassword']")
    WebElement repeatPassword;
    @FindBy(css = "input[value='Register']")
    WebElement registerButton;

    public void RegisterUser(String FirstName, String LastName, String Address, String City, String State, String Zip, String Phone, String Ssn, String UserName, String Password) {
        firstName.sendKeys(FirstName);
        lastName.sendKeys(LastName);
        address.sendKeys(Address);
        city.sendKeys(City);
        state.sendKeys(State);
        zip.sendKeys(Zip);
        phone.sendKeys(Phone);
        ssn.sendKeys(Ssn);
        userName.sendKeys(UserName);
        password.sendKeys(Password);
        repeatPassword.sendKeys(Password);
        registerButton.click();
    }


}
