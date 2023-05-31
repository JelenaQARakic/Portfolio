package Page;

import Base.BaseHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class SuccessfulActivationPageHaloOglasi extends BaseHaloOglasi {

    public SuccessfulActivationPageHaloOglasi() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "regsitration-success")
    WebElement uspesnaAktivacijaMessage;


    public boolean uspesnaAktivacijaMessageDisplayed() {
        wdwait.until(ExpectedConditions.elementToBeClickable(uspesnaAktivacijaMessage));
        return uspesnaAktivacijaMessage.isDisplayed();
    }

    public String uspesnaAktivacijaMessageText() {
        wdwait.until(ExpectedConditions.elementToBeClickable(uspesnaAktivacijaMessage));
        return uspesnaAktivacijaMessage.getText();

    }

    public void moveToNewTab() {
        wdwait.until(ExpectedConditions.numberOfWindowsToBe(1));

      ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));

        }


    }


