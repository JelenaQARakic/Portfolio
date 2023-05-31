package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//setUp
public class BaseTest {

public static WebDriver driver;
public static WebDriverWait wdwait;
Duration waitTime = Duration.ofSeconds(5);

@Before

    public void setUp(){

    WebDriverManager.chromedriver().setup(); //da skine najnoviju verziju

    driver = new ChromeDriver(); //dodela instance objekta klase

    wdwait = new WebDriverWait(driver,waitTime); //vrednost wdwait je instanca objekta klase WebDriverWait

    driver.manage().window().maximize();

    driver.get("https://www.ctshop.rs/customer/account/create");

}


@After

    public void tearDown(){

    //driver.close();
    //driver.quit();


}

}
