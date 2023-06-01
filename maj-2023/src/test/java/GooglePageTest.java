import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

    public static WebDriver driver;


    @Before
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

    }

    @Test
    public void testGooglePage(){
    driver.navigate().refresh();
    driver.navigate().back();
    driver.navigate().forward();
    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("Beograd");
    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("Novi Sad");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }

    @Test
    public void googleSearchButtonTest(){
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("Srbija");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Test
    public void gmailLink(){
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("Srbija");
        driver.findElement(By.partialLinkText("Gmail")).sendKeys(Keys.ENTER);
    }
    @Test
    public void yahooTest(){
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("Yahoo");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.partialLinkText("Yahoo | Mail")).click();
        driver.findElement(By.linkText("News")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("p")).clear();
        driver.findElement(By.name("p")).sendKeys("Google");
        driver.findElement(By.id("ybar-search")).click();

    }

    @Test
    public void yahooPartialLink(){
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("Yahoo");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.partialLinkText("Yahoo | Mail")).click();
        driver.findElement(By.linkText("News")).click();
        driver.findElement(By.name("p")).clear();
        driver.findElement(By.name("p")).sendKeys("Google");
        driver.findElement(By.name("p")).sendKeys(Keys.ENTER);

    }

    @Test
    public void yahooTestXpath() throws InterruptedException {
     driver.findElement(By.xpath("//textarea[@maxlength=\"2048\"]")).click();
     driver.findElement(By.xpath("//*[@maxlength=\"2048\"]")).sendKeys("Yahoo");
     //u prvom smo rekli trazi element textarea sa maxlength-suzavanje pretrage
     //bilo koji element sa vrednoscu maxlength
        Thread.sleep(1000);
        driver.findElement(By.className("gNO89b")).click();
        driver.findElement(By.xpath("//h3[contains(text(), \"Yahoo | Mail\")]")).click();
        //ImeElementa [@atributElementa="vrednostAtributa"] - prvi xPath
        //ImeElementa[contains(text(), "tekstTogElementa")] - drugi xPath

    }



    @After
    public void tearDown() {
        //driver.quit();
    }
}
