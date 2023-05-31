package Page;

import Base.BaseHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage extends BaseHaloOglasi {

    public RegistrationPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "UserName")
    WebElement korisnickoImeInputField;

    @FindBy(id = "Email")
    WebElement emailInputField;

    @FindBy(id = "Password")
    WebElement lozinkaInputField;

    @FindBy(id = "ConfirmPassword")
    WebElement ponoviLozinkuInputField;

    @FindBy(id = "AllowSendingNewsletters")
    WebElement newsLetterCheckbox;

    @FindBy(xpath = "//button[contains(text(), \"Registruj me\")]")
    WebElement registrujMeButton;

    @FindBy(name = "HasAgreedToGetFiscalReceiptByEmail")
    WebElement saglasnostFiskalniRacuni;

    public void inputKorisnickoImeField(String name) {
        wdwait.until(ExpectedConditions.elementToBeClickable(korisnickoImeInputField));
        korisnickoImeInputField.sendKeys(name);
    }
    public void inputEmailField(String email) {
        wdwait.until(ExpectedConditions.elementToBeClickable(emailInputField));
        emailInputField.sendKeys(email);
    }
    public void inputPasswordField(String password) {
        wdwait.until(ExpectedConditions.elementToBeClickable(lozinkaInputField));
        lozinkaInputField.sendKeys(password);
    }
    public void inputConfirmPassword(String confirmpassword) {
        wdwait.until(ExpectedConditions.elementToBeClickable(ponoviLozinkuInputField));
        ponoviLozinkuInputField.sendKeys(confirmpassword);
    }
    public void unchekNewsLetterCheckbox() {
        wdwait.until(ExpectedConditions.elementToBeClickable(newsLetterCheckbox));
    if (newsLetterCheckbox.isSelected()) {
        newsLetterCheckbox.click();
        }
    }
    public void checkSaglasnostFiskalniRacuni() {
        wdwait.until(ExpectedConditions.elementToBeClickable(saglasnostFiskalniRacuni));
        saglasnostFiskalniRacuni.click();
    }
    public void clickRegistrujMe() {
        wdwait.until(ExpectedConditions.elementToBeClickable(registrujMeButton));
        registrujMeButton.click();
    }

}
