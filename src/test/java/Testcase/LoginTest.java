package Testcase;

import PageObject.AccountPage;
import PageObject.LoginPage;
import TestComponent.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseTest {
    @BeforeMethod //(priority = 2,groups = {"smoke"})
    public void loginTest() throws Exception {

        LaunchApp();
        LoadData();
        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginIn(UserName, Password);
        Assert.assertEquals(driver.getTitle(), "ParaBank | Accounts Overview", "Title does not match");

        AccountPage accountPage = new AccountPage(driver);
        accountPage.GetBalance();

    }
    // (priority = 3,groups = {"smoke"})
    public void accountAction() throws Exception {

        AccountPage accountPage = new AccountPage(driver);
        accountPage.GetBalance();

    }
    //(groups = {"smoke","regression"})
    public void transferFunds() throws IOException {
        // Implement the transfer funds logic here
        // You can create a new PageObject class for transfer funds if needed
        System.out.println("Transfer funds logic goes here");

    }
}
