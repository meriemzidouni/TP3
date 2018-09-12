import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.core.Is.is;

public class SeleniumTestPageObject {

    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void quitBrowser() {
        driver.quit();
    }

    @Test
    public void testEntree() {

        HomePage homePage = new HomePage(driver);
        ResultsPage resultPage = homePage.rechercheEntree("bordeaux");
        String result = resultPage.getResults(0);
        Assert.assertThat(result, is("Site officiel de la ville de Bordeaux | Bordeaux"));
    }

    @Test
    public void testClick () {
        HomePage homePage = new HomePage(driver);
        ResultsPage resultPage = homePage.rechercheEntree("bordeaux");
        String result = resultPage.getResults(0);
        Assert.assertThat(result, is("Site officiel de la ville de Bordeaux | Bordeaux"));
    }

}
