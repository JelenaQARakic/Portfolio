package tests;

import baseTest.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.ComtradeRegistrationPage;

public class BuyingProductTest extends BaseTest {

BuyingProductTest buyingProduct;

    @Before

    public void setUpTest()
    {
        buyingProduct = new BuyingProductTest();
    }

    @Test
    public void setBuyingProduct() {


        ComtradeRegistrationPage comtradeRegistrationPage = new ComtradeRegistrationPage();
        Assert.assertTrue(comtradeRegistrationPage.vecPostojiNalogisDisplayed());
        Assert.assertEquals("Već postoji nalog sa unetom email adresom! Molimo ulogujte se!",comtradeRegistrationPage.vecPostojiNalogTextGetText());

    }


}



