package Page;

import Base.BaseHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InboxPageMailinator extends BaseHaloOglasi {

    public InboxPageMailinator(){

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//td[contains(text(), \"Molimo aktivirajte Vaš Halo oglasi nalog\")]")
    WebElement aktivirajteNalog;

    public void clickAktivirajNalog() {
        wdwait.until(ExpectedConditions.elementToBeClickable(aktivirajteNalog));
        aktivirajteNalog.click();
    }

}
