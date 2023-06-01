import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.text.Text;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class comtradeShopRegistrationForm {

    public static WebDriver driver;
    public static WebDriverWait wdwait;    //deklaracija

    @Before
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @Test
    public void registrationForm() throws InterruptedException {
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("Comtrade shop");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[contains(text(), \"CT shop\")]")).click();
        Thread.sleep(4000);
        driver.navigate().refresh();
        driver.findElement(By.xpath("//button[contains(text(), \"Prihvatam\")]")).click();
        driver.findElement(By.partialLinkText("Otvori nalog")).click();
        driver.findElement(By.id("pravnolice")).click();
        driver.findElement(By.xpath("//option[contains(text(), \"Ne\")]")).click();
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("Jelena");
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Rakic");
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("128@example.com");
        //driver.findElement(By.xpath("//input[@title=\"Email Adress\")]")).clear();
        driver.findElement(By.name("is_subscribed")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Password8!");
        driver.findElement(By.name("password_confirmation")).clear();
        driver.findElement(By.name("password_confirmation")).sendKeys("Password8!");
        driver.findElement(By.id("remember_meGgNW83udlh")).click();
        driver.findElement(By.xpath("//span[contains(text(), \"Pošalji\")]")).click();
        //driver.findElement(By.cssSelector(".soundest-form-background-image-close")).click(); - pop up
    }

    @Test

    public void comtradeRegistrationFormXpath() throws InterruptedException {

        driver.get("https://www.ctshop.rs/customer/account/create");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(), \"Prihvatam\")]")).click();
        driver.findElement(By.id("pravnolice")).click();
        driver.findElement(By.xpath("//option[contains(text(), \"Ne\")]")).click();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("firstname")));
        driver.findElement(By.xpath("//input[@title=\"First Name\"]")).clear();
        driver.findElement(By.xpath("//input[@title=\"First Name\"]")).sendKeys("Jeca");
        driver.findElement(By.xpath("//input[@title=\"Last Name\"]")).clear();
        driver.findElement(By.xpath("//input[@title=\"Last Name\"]")).sendKeys("Colic");
        driver.findElement(By.xpath("//input[@title=\"Email Address\"]")).clear();
        driver.findElement(By.xpath("//input[@title=\"Email Address\"]")).sendKeys("285@example.com");
        //driver.findElement(By.xpath("//input[@title=\"Sign Up for Newsletter\"]")).click();
        if(driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).isSelected()) {
            driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
        }//ako pitamo da je checkbox selektovan,ako jeste  ulazimo u blok koda za if i unselect checkbox, ako nije selektovan,samo preskacemo
        driver.findElement(By.xpath("//input[@title=\"Morate uneti minimum 6 karaktera\"]")).clear();
        driver.findElement(By.xpath("//input[@title=\"Morate uneti minimum 6 karaktera\"]")).sendKeys("Peretikos8!");
        driver.findElement(By.xpath("//input[@title=\"Confirm Password\"]")).clear();
        driver.findElement(By.xpath("//input[@title=\"Confirm Password\"]")).sendKeys("Peretikos8!");
        driver.findElement(By.xpath("//input[@title=\"Remember Me\"]")).click();
        driver.findElement(By.xpath("//button[@title=\"Submit\"]")).click();
        assertTrue(driver.findElement(By.cssSelector(".alert.alert-warning")).isDisplayed());  //ako je poruka prikazana, test je prosao, da li je nesto prikazano
        Assert.assertEquals("Već postoji nalog sa unetom email adresom! Molimo ulogujte se!",  //validacija poruke da li pise ono sto treba
             driver.findElement(By.cssSelector(".alert.alert-warning")).getText());




    }
    @Test

    public void comtradeRegistrationTestingBugs() throws InterruptedException {

        driver.get("https://www.ctshop.rs/customer/account/create");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(), \"Prihvatam\")]")).click();
        driver.findElement(By.id("pravnolice")).click();
        driver.findElement(By.xpath("//option[contains(text(), \"Da\")]")).click();
        driver.findElement(By.id("pib")).clear();
        driver.findElement(By.id("pib")).sendKeys("12345678");
        driver.findElement(By.xpath("//input[@title=\"First Name\"]")).clear();
        driver.findElement(By.xpath("//input[@title=\"First Name\"]")).sendKeys("Jeca");
        driver.findElement(By.xpath("//input[@title=\"Last Name\"]")).clear();
        driver.findElement(By.xpath("//input[@title=\"Last Name\"]")).sendKeys("Colic");
        driver.findElement(By.xpath("//input[@title=\"Email Address\"]")).clear();
        driver.findElement(By.xpath("//input[@title=\"Email Address\"]")).sendKeys("285@example.com");
        //driver.findElement(By.xpath("//input[@title=\"Sign Up for Newsletter\"]")).click();
        if (driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).isSelected()) {
            driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
        }//ako pitamo da je checkbox selektovan,ako jeste  ulazimo u blok koda za if i unselect checkbox, ako nije selektovan,samo preskacemo
        Select pravnoLice = new Select(driver.findElement(By.id("pravnolice"))); //promenljivoj smo dali tip, ime i vrednost-inicijalizacija
        driver.findElement(By.xpath("//input[@title=\"Morate uneti minimum 6 karaktera\"]")).clear();
        driver.findElement(By.xpath("//input[@title=\"Morate uneti minimum 6 karaktera\"]")).sendKeys("Peretikos8!");
        driver.findElement(By.xpath("//input[@title=\"Confirm Password\"]")).clear();
        driver.findElement(By.xpath("//input[@title=\"Confirm Password\"]")).sendKeys("Peretikos8!");
        driver.findElement(By.xpath("//input[@title=\"Remember Me\"]")).click();
        driver.findElement(By.xpath("//button[@title=\"Submit\"]")).click();

    }

        @Test

        public void comtradeRegistrationFormNegativeTestCasePib() throws InterruptedException {

            driver.get("https://www.ctshop.rs/customer/account/create");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[contains(text(), \"Prihvatam\")]")).click();
            Select pravnoLice = new Select(driver.findElement(By.id("pravnolice")));
            pravnoLice.selectByVisibleText("Da");
            driver.findElement(By.id("pravnolice")).click();
            driver.findElement(By.xpath("//option[contains(text(), \"Da\")]")).click();
            driver.findElement(By.id("pib")).clear();
            driver.findElement(By.id("pib")).sendKeys("0123456789");
            boolean displayed = driver.findElement(By.cssSelector(".modal-title")).isDisplayed();
            String expectedMessage = "Ne možemo da pronađemo pravno lice sa navedenim PIB-om. Molimo Vas da pokušate ponovo da unesete PIB ili pokušajte da unesete MB (matični broj).";
            Text messageElement = new Text();
            String actualMessage = messageElement.getText();

        }

        @Test

        public void hoverMouseTest() throws InterruptedException {

            driver.get("https://www.ctshop.rs/customer/account/create");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[contains(text(), \"Prihvatam\")]")).click();
            wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".am-opener.sharkskin-collapse")));

            Actions hover = new Actions(driver);  //pozvali smo sve metode koje su sadrzane u Actions klasi
            hover.moveToElement(driver.findElement(By.cssSelector(".am-opener.sharkskin-collapse"))).perform();
            hover.moveToElement(driver.findElement(By.partialLinkText("Bela tehnika"))).perform();
            driver.findElement(By.partialLinkText("Šporeti")).click();
            driver.findElement(By.xpath("//button[contains(text(), \"Prihvatam\")]")).click();
            driver.findElement(By.partialLinkText("Kombinovani šporeti")).click();
            hover.moveToElement(driver.findElement(By.partialLinkText("Gorenje"))).perform();
            driver.findElement(By.xpath("//label[@for=\"filter_data_brend_142\"]")).click();
            Thread.sleep(2000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            //js.executeScript("window.scrollTo(10, document.body.scrollHeight)");
            driver.findElement(By.xpath("//a[@title=\"GK5A11WG kombinovani šporet\"]")).click();
            driver.navigate().back();
            hover.moveToElement(driver.findElement(By.partialLinkText("Gorenje"))).perform();
            js.executeScript("window.scrollTo(40, 20);");
            driver.findElement(By.xpath("//label[@for=\"filter_data_brend_142\"]")).click();
            driver.findElement(By.xpath("//label[@for=\"filter_data_brend_42\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@title=\"FSE64320DS kombinovani šporet\"]")).click();
            js.executeScript("window.scrollTo(5, document.body.scrollHeight)");
            //Assert.assertTrue(driver.findElement(By.partialLinkText("Deklaracija")).isDisplayed());



        }

    @After
    public void tearDown() {
        //driver.quit();
    }
}

