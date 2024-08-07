package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SaucedemoPage {

    public SaucedemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    public WebElement usernameKutusu ;

    @FindBy(id = "password")
    public WebElement passwordKutusu;

    @FindBy(id="login-button")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[@class='inventory_item_name ']")
    public List<WebElement> tumUrunElementleriList;
}