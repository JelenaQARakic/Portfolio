package Page;

import Base.BaseHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageHaloOglasi extends BaseHaloOglasi {

    public HomePageHaloOglasi() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "cookie-policy-btn")
    WebElement uReduCookieButton;

    @FindBy(linkText = "Uloguj se")
    WebElement ulogujSeLink;

    public void clickUreduCookieButton() {
        wdwait.until(ExpectedConditions.elementToBeClickable(uReduCookieButton));
        uReduCookieButton.click();
    }
    public void clickUlogujSeLink () {
        wdwait.until(ExpectedConditions.elementToBeClickable(ulogujSeLink));
        ulogujSeLink.click();
    }
}
