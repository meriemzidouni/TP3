
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultsPage {

    WebDriver driver;


    @FindBy(css = ".rc > .r > a")
    List<WebElement> listResults;



    public  ResultsPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String getResults (int index) {

        return(listResults.get(index).getText());

    }


}
