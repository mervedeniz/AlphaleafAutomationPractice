package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private By loc_page_banner = By.xpath("//h1");
    private By loc_email_input = By.id("user");
    private By loc_pass_input = By.id("password");
    private By loc_login_bttn = By.id("login");


    public LoginPage(WebDriver inputDriver){
        driver = inputDriver;
    }

    public void isLoginVisible() {
        WebElement pageBannerElem = driver.findElement(loc_page_banner);
        pageBannerElem.isDisplayed();
    }

    public void login(String email, String password){
        //1. enter email
        //2. enter password
        //3. click "log in" button

        WebElement emailInput = driver.findElement(loc_email_input);
        emailInput.sendKeys(email);

        WebElement passwordInput = driver.findElement(loc_pass_input);
        emailInput.sendKeys(password);

        WebElement loginButton = driver.findElement(loc_login_bttn);
        emailInput.click();




    }


}
