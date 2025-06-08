package AbstractConstructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class AbstractComponent {
    public WebDriver driver;

    public AbstractComponent(WebDriver driver) throws FileNotFoundException {
        super();
        this.driver = driver;
        // Initialize elements with PageFactory
        PageFactory.initElements(driver, this);
    }
}
