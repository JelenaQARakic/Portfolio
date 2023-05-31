package Page;

import Base.BaseHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiEmailWindow extends BaseHaloOglasi {

    public HaloOglasiEmailWindow() {

        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "html_msg_body")
    WebElement iframeBody;

    @FindBy(css = "[align=\"center\"] > a")
    WebElement aktivirajNalogLink;

    public void switchToIframeAndClickAktivirajNalogLink (){
        wdwait.until(ExpectedConditions.elementToBeClickable(iframeBody));
        driver.switchTo().frame(iframeBody);
        wdwait.until(ExpectedConditions.elementToBeClickable(aktivirajNalogLink));
        aktivirajNalogLink.click();
        driver.switchTo().defaultContent();



    }

}
