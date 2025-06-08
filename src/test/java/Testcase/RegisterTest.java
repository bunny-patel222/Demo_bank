package Testcase;

import PageObject.RegisterPage;
import TestComponent.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegisterTest extends BaseTest {


    @Test(priority = 1, groups = {"smoke","regression"})
    public void registerTest() throws IOException {
        // Implement the test logic here


        LaunchApp();
        // Add your test steps for registration
        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.NavigateToRegisterPage();
        //Fill the registration form
        LoadData();

        registerPage.RegisterUser(
                FirstName, LastName, Address, City, State, Zip, Phone, Ssn, UserName, Password


                );


    }
}
