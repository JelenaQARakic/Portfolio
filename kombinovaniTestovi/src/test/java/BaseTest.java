//ovde importujemo
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//ovo je pocetak nase klase
public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wdwait;

    /* deklarisali smo promenljivu driver koja pokrece WebDriver - IME+TIP
    public - modifikator pristupa
    static - promenljivoj se moze pristupiti bez pravljenja objekta ove klase(bez instanciranja klase)
    driver - ime promenljive koje mi sami dajemo
    WebDriver - tip podatka
     */
//ovo je junit anotacija koja govori sta ce se izvrsiti pre svih testova
    @Before

    public void setUp() {

        // public void setUp() potpis metode, void povratna vrednost, setUp-ime metode-mi biramo, setUp je standard
        //ovo je metoda koja se izvrsava pre testova
        /*WebDriverManager.chromedriver().setup();
        -ova metoda automatski skida verziju odgovarajucu zeljenog pretrazivaca*/
        //WebDriverManager.chromedriver().setup(); - skida novu verziju crhome-a automatski

        driver = new ChromeDriver();
        //objekat kreira konstruktor metoda - ChromeDriver();
        //klasa se zove ChromeDriver-isto kao metoda, uvek isti naziv
        //nasoj promenljivi driver smo dodelili instancu objekta klase ChromeDriver
        //driver ce da ima metode,funkcije i sve ostalo sto ima ChromeDriver
        //metode se pozivaju sa tackom
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @Test
    public void firstTest() {

    }

    @Test
    public void secondTest(){

    }

    @After
    public void tearDown(){
    //    driver.close();  //trenutni tab
    //    driver.quit();        //kompletni pretrazivac

    }
}
