package page;

import baseTest.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ComtradeRegistrationPage extends BaseTest {


    public ComtradeRegistrationPage() {

        PageFactory.initElements(driver, this);  //metoda koja ce od nasih buducih elemenata odnosno lokatora za elemente da napravi objekte sa kojima cemo moci da interaktujemo, bez ovoga nista ne funkcionise

    }

    @FindBy(xpath = ("//button[contains(text(), \"Prihvatam\")]"))
    WebElement acceptCookiePolicy;

    @FindBy(name = ("pravnolice"))
    WebElement pravnoLice;

    @FindBy(xpath = ("//option[contains(text(), \"Ne\")]"))
    WebElement nePravnoLice;

    @FindBy(id = "firstname")         //vrednost promenljive nameField
    WebElement nameField;      //nameField jeste ime elementa, odnosno ime promenljive tipa WebElement

    @FindBy(xpath = ("//input[@title=\"Last Name\"]"))
    WebElement lastnameField;

    @FindBy(id = "email_address")
    WebElement emailaddressField;

    @FindBy(id = "is_subscribed")
    WebElement subscribedCheckbox;
  
    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "confirmation")
    WebElement confirmationPasswordField;

    @FindBy(id = "remember_meGgNW83udlh")
    WebElement rememberCheckBox;

    @FindBy(xpath = ("//button[@title=\"Submit\"]"))
    WebElement submitButton;

    @FindBy(xpath = ("//div[@class=\"alert alert-warning\"]"))
    WebElement uspesnaRegistracija;

    public void acceptCookiePolicyConfirm() {
        wdwait.until(ExpectedConditions.elementToBeClickable(acceptCookiePolicy));
        acceptCookiePolicy.click();
    }

    public void pravnoLiceDropDown() {
        wdwait.until(ExpectedConditions.elementToBeClickable(pravnoLice));
        pravnoLice.click();
    }

    public void nePravnoLiceDropdown() {
        wdwait.until(ExpectedConditions.elementToBeClickable(nePravnoLice));
        nePravnoLice.click();
    }


    public void inputNameField(String name) {
        wdwait.until(ExpectedConditions.elementToBeClickable(nameField));
        nameField.clear();
        nameField.sendKeys(name);

    }

    public void inputLastNameField(String lastname) {
        wdwait.until(ExpectedConditions.elementToBeClickable(lastnameField));
        lastnameField.clear();
        lastnameField.sendKeys(lastname);
    }


    public void inputEmailAddressField(String emailAddress) {
        wdwait.until(ExpectedConditions.elementToBeClickable(emailaddressField));
        emailaddressField.clear();
        emailaddressField.sendKeys(emailAddress);

    }


    public void inputSubscribedCheckbox() {
        wdwait.until(ExpectedConditions.elementToBeClickable(subscribedCheckbox));
        subscribedCheckbox.click();
    }

    public void inputPasswordField(String password) {
        wdwait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void inputConfirmationPasswordField(String confirmationPasswordField) {
        wdwait.until(ExpectedConditions.elementToBeClickable(this.confirmationPasswordField));
        this.confirmationPasswordField.clear();
        this.confirmationPasswordField.sendKeys(confirmationPasswordField);
    }

    public void RememberCheckbox() {
        wdwait.until(ExpectedConditions.elementToBeClickable(rememberCheckBox));
        rememberCheckBox.click();
    }


    public void SubmitButton() {
        wdwait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
    }

    public boolean vecPostojiNalogisDisplayed() {
        wdwait.until(ExpectedConditions.visibilityOfAllElements(uspesnaRegistracija));
        //uspesnaRegistracija.isDisplayed(); isDisplayed metoda proverava da li je element vidljiv i vraca boolean true ili false - metoda proverava vidljivost i vraca isDisplayed
        return uspesnaRegistracija.isDisplayed();

    }

    public String vecPostojiNalogTextGetText() {
        wdwait.until(ExpectedConditions.elementToBeClickable(uspesnaRegistracija));         //metoda get text vraca string tako da koristimo public String, metoda vraca text iz elementa
        return uspesnaRegistracija.getText();

    }


}