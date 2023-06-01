package tests;

import baseTest.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.ComtradeRegistrationPage;

public class ComtradeRegistrationTests extends BaseTest {
//tip                              //ime promenljive
    ComtradeRegistrationPage comtradeRegistrationPage;

@Before

    public void setUpTest()
{                                       //konstruktor metoda
   comtradeRegistrationPage = new ComtradeRegistrationPage(); //comtradeRegistrationPage ima vrednost instance objekta ComtradRegistrationPage

}

@Test
    public void setComtradeRegistrationPage() {
    comtradeRegistrationPage.acceptCookiePolicyConfirm();
    comtradeRegistrationPage.pravnoLiceDropDown();
    comtradeRegistrationPage.nePravnoLiceDropdown();
    comtradeRegistrationPage.inputNameField("Anastasija");
    comtradeRegistrationPage.inputLastNameField("Bled");
    comtradeRegistrationPage.inputEmailAddressField("124@example.com");
    comtradeRegistrationPage.inputSubscribedCheckbox();
    comtradeRegistrationPage.inputPasswordField("exodus358!");
    comtradeRegistrationPage.inputConfirmationPasswordField("exodus358!");
    comtradeRegistrationPage.RememberCheckbox();
    comtradeRegistrationPage.SubmitButton();
    Assert.assertTrue(comtradeRegistrationPage.vecPostojiNalogisDisplayed());
    Assert.assertEquals("Već postoji nalog sa unetom email adresom! Molimo ulogujte se!",comtradeRegistrationPage.vecPostojiNalogTextGetText());

}



}



