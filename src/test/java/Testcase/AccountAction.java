package Testcase;

import PageObject.AccountPage;
import TestComponent.BaseTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class AccountAction extends BaseTest {

    @Test
    public void accountAction() throws Exception {

        AccountPage accountPage = new AccountPage(driver);
        LaunchApp();

        accountPage.GetBalance();

    }




}
