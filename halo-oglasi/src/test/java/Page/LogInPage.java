package Page;

import Base.BaseHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInPage extends BaseHaloOglasi {

    public LogInPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Registrujte se →")
    WebElement registrujSeLink;

    public void clickRegistrujSeLink () {
        wdwait.until(ExpectedConditions.elementToBeClickable(registrujSeLink));
        registrujSeLink.click();
    }

}
