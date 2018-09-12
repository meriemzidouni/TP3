import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(id="hplogo")
    WebElement logo;

    @FindBy(name="q")
    WebElement barreRecherche;

    @FindBy(css =".lsb")
    WebElement buttonRecherche;



    public HomePage (WebDriver driver) {

        this.driver = driver;

        //initialisation des elements qui sont dans le driver : logo, barreRecherche, buttonRecherche
        PageFactory.initElements(driver, this);


    }


    public void rechercheEntree (String text) {

        barreRecherche.sendKeys(text);
        barreRecherche.sendKeys(Keys.ENTER);

    }


    public void rechercheClick (String text) {

        buttonRecherche.sendKeys(text);
        buttonRecherche.click();

    }

}


