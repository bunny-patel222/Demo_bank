package TestComponent;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    public WebDriver driver;
    public String URL;
    public String browserName;
    public String FirstName;
    public String LastName;
    public String Address;
    public String City;
    public String State;
    public String Zip;
    public String Phone;
    public String Ssn;
    public String UserName;
    public String Password;



    public void LoadData() throws IOException {

        Properties prop = new Properties();
        FileInputStream FileInput = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/TestComponent/GlobalData.properties");
        prop.load(FileInput);
        browserName = prop.getProperty("browser");
        URL = prop.getProperty("URL");
        FirstName = prop.getProperty("firstName");
        LastName = prop.getProperty("lastName");
        Address = prop.getProperty("address");
        City = prop.getProperty("city");
        State = prop.getProperty("state");
        Zip = prop.getProperty("zip");
        Phone = prop.getProperty("phone");
        Ssn = prop.getProperty("ssn");
        UserName = prop.getProperty("userName");
        Password = prop.getProperty("password");


    }

    public void intDriver() throws IOException {

        LoadData();

        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public void LaunchApp() throws IOException {
        intDriver();
        driver.get(URL);

    }

  //  @AfterMethod(alwaysRun = true)
    public void CloseApp() {
        driver.quit();
    }

}


