package Page;

import Base.BaseHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessfulRegistrationPage extends BaseHaloOglasi {

    public SuccessfulRegistrationPage() {
        PageFactory.initElements(driver,this);
    }


    @FindBy(className = "regsitration-success")
    WebElement uspesnaRegistracijaMessage;

    public boolean uspesnaRegistracijaMessageDisplayed () {
        wdwait.until(ExpectedConditions.elementToBeClickable(uspesnaRegistracijaMessage));
        return uspesnaRegistracijaMessage.isDisplayed();
    }

    public String uspesnaRegistracijaMessageText() {
        wdwait.until(ExpectedConditions.elementToBeClickable(uspesnaRegistracijaMessage));
        return uspesnaRegistracijaMessage.getText();
    }


}

